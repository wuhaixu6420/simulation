package com.wox.simulation.util;

import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;

import org.apache.commons.lang.StringUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

import com.wox.simulation.common.BaseConstant;

/**
 * 
 * 描述：RSA加解密
 * @author wuhaixu
 * @created 2017年8月16日23:16:46
 * @since
 */
public class RSAUtilswww
{
	/** 可以先注册到虚拟机中,再通过名称使用;也可以不注册,直接传入使用 */
	public static final Provider pro = new BouncyCastleProvider();
	/** 种子,改变后,生成的密钥对会发生变化 */
	private static final String seedKey = "wox";

	private static final String charSet = "UTF-8";
	
	/**
	 * * 生成密钥对 *
	 *
	 * @return KeyPair *
	 */
	public static KeyPair generateKeyPair() throws Exception
	{
		try
		{
			KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA", pro);
			keyPairGen.initialize(1024, new SecureRandom(seedKey.getBytes()));
			KeyPair keyPair = keyPairGen.generateKeyPair();

			RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  
			RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
			
			//模  
			String modulus = publicKey.getModulus().toString(16);
			System.out.println("modulus" + modulus);
			//公钥指数  
			String public_exponent = publicKey.getPublicExponent().toString(16);
			System.out.println("public_exponent" + public_exponent);
			//私钥指数  
			String private_exponent = privateKey.getPrivateExponent().toString(16);
			System.out.println("private_exponent" + private_exponent);
			
			return keyPair;
		}
		catch (Exception e)
		{
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * * 生成公钥 *
	 *
	 * @param modulus		*
	 * @param publicExponent *
	 * @return RSAPublicKey *
	 * @throws Exception
	 */
	public static RSAPublicKey generateRSAPublicKey(byte[] modulus, byte[] publicExponent) throws Exception
	{
		KeyFactory keyFac = null;
		try
		{
			keyFac = KeyFactory.getInstance("RSA", pro);
		}
		catch (NoSuchAlgorithmException ex)
		{
			throw new Exception(ex.getMessage());
		}
		RSAPublicKeySpec pubKeySpec = new RSAPublicKeySpec(new BigInteger(modulus), new BigInteger(publicExponent));
		try
		{
			return (RSAPublicKey) keyFac.generatePublic(pubKeySpec);
		}
		catch (InvalidKeySpecException ex)
		{
			throw new Exception(ex.getMessage());
		}
	}

	/**
	 * * 生成私钥 *
	 *
	 * @param modulus		 *
	 * @param privateExponent *
	 * @return RSAPrivateKey *
	 * @throws Exception
	 */
	public static RSAPrivateKey generateRSAPrivateKey(byte[] modulus, byte[] privateExponent) throws Exception
	{
		KeyFactory keyFac = null;
		try
		{
			keyFac = KeyFactory.getInstance("RSA", pro);
		}
		catch (NoSuchAlgorithmException ex)
		{
			throw new Exception(ex.getMessage());
		}
		RSAPrivateKeySpec priKeySpec = new RSAPrivateKeySpec(new BigInteger(modulus), new BigInteger(privateExponent));
		try
		{
			return (RSAPrivateKey) keyFac.generatePrivate(priKeySpec);
		}
		catch (InvalidKeySpecException ex)
		{
			throw new Exception(ex.getMessage());
		}
	}

	/**
	 * * 加密 *
	 *
	 * @param key  加密的密钥 *
	 * @param data 待加密的明文数据 *
	 * @return 加密后的数据 *
	 * @throws Exception
	 */
	public static byte[] encrypt(PublicKey pk, byte[] data) throws Exception
	{
		try
		{
			Cipher cipher = Cipher.getInstance("RSA",pro);
			cipher.init(Cipher.ENCRYPT_MODE, pk);
			byte[] raw = cipher.doFinal(data);
			return raw;
		}
		catch (Exception e)
		{
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * * 加密 *
	 *
	 * @param key  加密的密钥 *
	 * @param data 待加密的明文数据 *
	 * @return 加密后的数据 *
	 * @throws Exception
	 */
	public static String encrypt(PublicKey pk, String dataStr) throws Exception
	{
		byte[] data = dataStr.getBytes(charSet);
		byte[] raw = encrypt(pk, data);
		return new String(raw,charSet);
	}

	/**
	 * * 解密 *
	 *
	 * @param key 解密的密钥 *
	 * @param raw 已经加密的数据 *
	 * @return 解密后的明文 *
	 * @throws Exception
	 */
	public static byte[] decrypt(PrivateKey pk, byte[] raw) throws Exception
	{
		Cipher cipher = Cipher.getInstance("RSA", pro);
		cipher.init(Cipher.DECRYPT_MODE, pk);
		byte[] re = cipher.doFinal(raw);
		return re;
	}

	/**
	 * * 解密 *
	 *
	 * @param key 解密的密钥 *
	 * @param raw 已经加密的数据 *
	 * @return 解密后的明文 *
	 * @throws Exception
	 */
	public static String decrypt(String raw) throws Exception
	{
		String modulusStr = BaseConstant.RSA_MODULUS;
		String priExponentStr = BaseConstant.RSA_PRIVATE_EXPONENT;
		byte[] modulusArray = new BigInteger(modulusStr, 16).toByteArray();
		byte[] priExponentArray = new BigInteger(priExponentStr, 16).toByteArray();
		RSAPrivateKey privateKey = RSAUtilswww.generateRSAPrivateKey(modulusArray, priExponentArray);
		byte[] input = Hex.decode(raw);
		byte[] byRaw = decrypt(privateKey,input);
		// 标志位为0之后的是输入的有效字节
		int i = byRaw.length - 1;
		while (i >= 0 && byRaw[i] != 0) {
			i--;
		}
		i++;
		byte[] data = new byte[byRaw.length - i];
		for (int j = i; j < byRaw.length; j ++) {
			data[j - i] = byRaw[j];
		}
		return new String(data, charSet);
	}

	/**
	 * * 加密
	 */
	public static String encrypt(String raw) throws Exception
	{
		String modulusStr = BaseConstant.RSA_MODULUS;
		String pubExponentStr = BaseConstant.RSA_PUBLIC_EXPONENT;
		byte[] modulusArray = new BigInteger(modulusStr, 16).toByteArray();
		byte[] pubExponentArray = new BigInteger(pubExponentStr, 16).toByteArray();
		RSAPublicKey publicKey = RSAUtilswww.generateRSAPublicKey(modulusArray, pubExponentArray);
		byte[] byRaw = encrypt(publicKey, raw.getBytes(charSet));
		byte[] data = Hex.encode(byRaw);
		return new String(data, charSet);
	}
	
	/**
	 * * 加密
	 */
	public static String encrypt(String modulusStr,String pubExponentStr, String raw) throws Exception
	{
		byte[] modulusArray = new BigInteger(modulusStr, 16).toByteArray();
		byte[] pubExponentArray = new BigInteger(pubExponentStr, 16).toByteArray();
		RSAPublicKey publicKey = RSAUtilswww.generateRSAPublicKey(modulusArray, pubExponentArray);
		byte[] byRaw = encrypt(publicKey, raw.getBytes(charSet));
		byte[] data = Hex.encode(byRaw);
		return new String(data, charSet);
	}

	public static void main(String[] args) throws Exception
	{
		//generateKeyPair();
		String a = "123";
		a = encrypt(a);
		System.out.println(a);
		System.out.println(a.length());
		a = decrypt(a);
		System.out.println(a);
		
		
		String s = "06f71b3e610bf697d6d0443c64b6dd7e96cde6411395ebd18561f84bc616a343df16673710ff2553969e441c7e5ad4abfc6f0274769e2a37baea0186ca8a650a480dcd20df7ded563799876a0b6ede6bceb7a5e2c02ffacf02d93e28710a8dc989489db0b65843fadb3ac4731a376ccf066456752e8cccfa529c4149224e4208";
		//	△		js加密的时候，对原始数据进行翻转，所以在后端需要对解密的数据进行再反转
		System.out.println(StringUtils.reverse(decrypt(s)));
		
		
		String s1 = "1d5db5e6731befcb1e7bc705b30686d214f22851c8ba240ce706f326e905dea0efac4e1e3265728aee2d66e7fac65be3f3de6be5441f6bbef51d3b809646a7fc7b92db0e461a594e1942bd8dfefe10d8e32802caaa1619ffbc1179bbf1a0974fc31c1af6de5f55df4bc7c665432ea2fabdfc6d86d58d41b155e6ada5b0b2d3d1";
		System.out.println(StringUtils.reverse(decrypt(s1)));
		
		//	△		如果是中文就要进行编码
		String s2 = "12dbb6f78add06c8ad340af41cd6f2ca0d82701aea64e2b7241c5b3e3c1e22b938013787b99b191d1854867de176f592b00f16d0775e5be099e2f4fcf7ec0c128abab3b3a6b482a6e464ea185c985ca00916bf2c01792c7a6ee673f11c0a254a74cfa48293f6c49a8f3bdb22f84979255503682e3e148242bd2fe6cc6fb6b9d7";
		System.out.println(URLDecoder.decode(StringUtils.reverse(decrypt(s2)), "UTF-8"));
		
	}
}
