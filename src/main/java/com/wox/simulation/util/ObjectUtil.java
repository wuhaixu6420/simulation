/**
 * 
 */
package com.wox.simulation.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 *
 */
public class ObjectUtil {
	
	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;

		} else if (obj instanceof String) {
			String str = String.valueOf(obj);
			if (str.length() == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
	
	/***
     * 将对象转换为map对象
     * @param thisObj 对象
     * @return
     */
    public static Map<String, Object> objectToMap(Object thisObj)
    {
        Map<String, Object> map = new HashMap<>();
        Class<?> c;
        try
        {
            c = Class.forName(thisObj.getClass().getName());
            //获取所有的方法
            Method[] m = c.getMethods();
            for (int i = 0; i < m.length; i++)
            {   //获取方法名
                String method = m[i].getName();
                //获取get开始的方法名
                if (method.startsWith("get")&&!method.contains("getClass"))
                {
                    try{
                        //获取对应对应get方法的value值
                        Object value = m[i].invoke(thisObj);
                        if (value != null)
                        {
                            //截取get方法除get意外的字符 如getUserName-->UserName
                            String key=method.substring(3);
                            //将属性的第一个值转为小写
                            key=key.substring(0,1).toLowerCase()+key.substring(1);
                            //将属性key,value放入对象
                            map.put(key, value);
                        }
                    }catch (Exception e) {
                        System.out.println("error:"+method);
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return map;
    }
}
