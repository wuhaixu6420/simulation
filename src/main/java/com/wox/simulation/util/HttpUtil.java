package com.wox.simulation.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpUtil {
    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param cookie
     *            cookie
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param charsetName
     *            字符集
     * @return URL 所代表远程资源的响应结果
     */
    public static HttpRespon sendGet(String cookie, String url, String param, String charsetName) {
        String result = "";
        BufferedReader in = null;
        HttpRespon hr = new HttpRespon();
        try {
            String urlNameString = url;
            if(ObjectUtil.isNotEmpty(param)){
            	urlNameString = urlNameString + "?" + param;
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //cookie
            if(ObjectUtil.isNotEmpty(cookie)){
            	conn.setRequestProperty("Cookie",cookie);
            }
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            conn.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), charsetName));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            //cookie
            String ck = conn.getHeaderField("set-cookie");
            
            //result
            hr.setContent(result);
            hr.setCookie(ck);
            
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return hr;
    }

    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param charsetName
     *            字符集
     * @return URL 所代表远程资源的响应结果
     */
    public static HttpRespon sendGet(String url, String param, String charsetName) {
        return sendGet(null, url, param, charsetName);
    }
    
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param cookie
     *            cookie
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param charsetName
     *            字符集
     * @return 所代表远程资源的响应结果
     */
    public static HttpRespon sendPost(String cookie, String url, String param, String charsetName) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        HttpRespon hr = new HttpRespon();
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //cookie
            if(ObjectUtil.isNotEmpty(cookie)){
            	conn.setRequestProperty("Cookie",cookie);
            }
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            if(ObjectUtil.isNotEmpty(param)){
            	out.print(param);
            }
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), charsetName));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            //cookie
            String ck = conn.getHeaderField("set-cookie");
            
            //result
            hr.setContent(result);
            hr.setCookie(ck);
            
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return hr;
    }   
    
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param charsetName
     *            字符集
     * @return 所代表远程资源的响应结果
     */
    public static HttpRespon sendPost(String url, String param, String charsetName) {
        return sendPost(null, url, param, charsetName);
    }    
}