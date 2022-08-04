package okhttpUtils;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class HttpClientUtils<main> {
    @Test
    public static void DoGET() throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();// 创建http GET请求
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                //请求体内容
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                //内容写入文件
                FileUtils.writeStringToFile(new File("d:\\devtest\\baidu.html"), content, "UTF-8");
                System.out.println("内容长度：" + content.length());
            }
            System.out.println(response.getAllHeaders());
            System.out.println(response.getStatusLine());

        } finally {
            if (response != null) {
                response.close();
            }//相当于关闭浏览器
            httpclient.close();
        }
    }

    @Test
    public static void DoGETParam() throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 定义请求的参数
        URI uri = new URIBuilder("http://www.baidu.com/s").setParameter("wd", "java").build();
        // 创建http GET请求
        HttpGet httpGet = new HttpGet(uri);
        //response 对象

        CloseableHttpResponse response = null;
        try {
            // 执行http get请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                //内容写入文件
                FileUtils.writeStringToFile(new File("d:\\devtest\\baidu-param.html"), content, "UTF-8");
                System.out.println("内容长度：" + content.length());
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }

    }


    public static void DoPOST() throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建http POST请求
        HttpPost httpPost = new HttpPost("http://www.oschina.net/");
        //伪装浏览器请求
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                //内容写入文件
                FileUtils.writeStringToFile(new File("E:\\devtest\\oschina.html"), content, "UTF-8");
                System.out.println("内容长度：" + content.length());
            }
        } finally {
            if (response != null) {
                response.close();
            }
            httpclient.close();
        }
    }

   @Test
    public static void DoPOSTParam() throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建http POST请求
        HttpPost httpPost = new HttpPost("https://www.oschina.net");
        // 设置2个post参数，一个是scope、一个是q
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
//        parameters.add(new BasicNameValuePair("scope", "project"));
//        parameters.add(new BasicNameValuePair("q", "java"));
        // 构造一个form表单式的实体
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters);
        // 将请求实体设置到httpPost对象中
        httpPost.setEntity(formEntity);
        //伪装浏览器
        httpPost.setHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpPost);
           System.out.println("11111111111111111111111111========================" +response.toString());
            System.out.println("11111111111111111111111111========================" +response.getStatusLine().getReasonPhrase());
            System.out.println("11111111111111111111111111========================" +response.getAllHeaders().toString());
            System.out.println("11111111111111111111111111========================" +response.getEntity().getContentType());
            System.out.println("11111111111111111111111111========================" +response.containsHeader(""));
            System.out.println("11111111111111111111111111========================" +response.headerIterator().nextHeader());
            System.out.println("11111111111111111111111111========================" +response.headerIterator().nextHeader().getName());
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                //内容写入文件
//                FileUtils.writeStringToFile(new File("d:\\devtest\\oschina-param.html"), content, "UTF-8");
//                System.out.println("内容长度：" + content.length());
            }
        } finally {
            if (response != null) {
                response.close();
            }
            httpclient.close();
        }
    }

    @Test
    public static void TEST( ) throws IOException {

        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://www.oschina.net/");
        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
        params.add(new BasicNameValuePair("msg","toBeSendMsg"));
        UrlEncodedFormEntity uefEntity;
        uefEntity = new UrlEncodedFormEntity(params,"UTF-8");
        httpPost.setEntity(uefEntity);
        System.out.println("执行request请求"+httpPost.getURI());
        HttpResponse httpResponse;
        httpResponse = httpClient.execute(httpPost);
        HttpEntity entity = httpResponse.getEntity();
        String resData = EntityUtils.toString(entity);
        System.out.println(("返回信息："+resData));
    }
}















