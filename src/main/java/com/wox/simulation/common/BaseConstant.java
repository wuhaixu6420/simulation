package com.wox.simulation.common;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class BaseConstant {

	public static final String START = "[start]";

	public static final String END = "[end]";
	
	protected static final String CHARSET = ";charset=UTF-8";
	
	protected final static String charsetNameUTF8 = "UTF-8";
	
	protected final static String charsetNameGBK = "GBK";
	
	/**交易标志，委托*/
	protected static final String TRANSACTIONSIGN_ENTRUST = "0";
	/**交易标志，已成*/
	protected static final String TRANSACTIONSIGN_HAVESUCCEEDED = "1";
	/**交易标志，部成*/
	protected static final String TRANSACTIONSIGN_PARTSUCCESS = "2";
	/**交易标志，部撤*/
	protected static final String TRANSACTIONSIGN_PARTREVOKE = "3";
	/**买卖标志，卖出*/
	protected static final String BUSINESSSIGN_SELL = "0";
	/**买卖标志，买入*/
	protected static final String BUSINESSSIGN_BUY = "1";
	
	/** 用于获取静态配置值 */
	private static Properties props = null;

	/** modulus */
	public static String RSA_MODULUS;

	/** 公钥 */
	public static String RSA_PUBLIC_EXPONENT;

	/** 私钥 */
	public static String RSA_PRIVATE_EXPONENT;
	
	static {
		try {
			props = PropertiesLoaderUtils.loadAllProperties("config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		/** modulus */
		RSA_MODULUS = props.getProperty("rsa.modulus");
		
		/** 公钥 */
		RSA_PUBLIC_EXPONENT = props.getProperty("rsa.public.exponent");
		
		/** 私钥 */
		RSA_PRIVATE_EXPONENT = props.getProperty("rsa.private.exponent");
	}
}
