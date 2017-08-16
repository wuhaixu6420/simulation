package com.wox.simulation.common;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class BaseConstant {

	public static final String START = "[start]";

	public static final String END = "[end]";
	
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
