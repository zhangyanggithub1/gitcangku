package package626;

import okhttpUtils.OkhttpUtils;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetCookie {
    public Map<String, String> cookie = new HashMap<String, String>();

    @Test
    public void test_1() {
        String url="https://10.81.106.123:443";
        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
        params.add(new BasicNameValuePair("username", "测试专员"));
        params.add(new BasicNameValuePair("pwd", "123456789"));
        OkhttpUtils okhttpUtils = new OkhttpUtils();
//        Response body =okhttpUtils.getmethod(url,params);

//        try {
//            post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
//            HttpResponse report = httpClient.execute(post);
//            getAndStoreCookiesFromResponse(report);
//            if (report.getStatusLine().getStatusCode()== 200) {
//                String result = EntityUtils.toString(report.getEntity());
//                System.out.println(result);
//            } else {
//                System.out.println("请求失败");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Test(dependsOnMethods = {"test_1"})
    public void test_2() throws Exception {
//        HttpClient httpClient = HttpClients.createDefault();
//        HttpPost post = new HttpPost("接口地址");
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("name", "webApii"));
//        params.add(new BasicNameValuePair("yn", "1"));
//        params.add(new BasicNameValuePair("authScope", "3"));
//        params.add(new BasicNameValuePair("type", "1"));
//        params.add(new BasicNameValuePair("menuIds", "325,1011,1102,11024,11029"));
//        post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
//        addCookieInRequestHeaderBeforeRequest(post);
//        HttpResponse report = httpClient.execute(post);
//        if (report.getStatusLine().getStatusCode() == 200) {
//            String result = EntityUtils.toString(report.getEntity());
//            System.out.println(result);
//        } else {
//            System.out.println("请求失败");
//        }
    }
//    private void addCookieInRequestHeaderBeforeRequest(HttpPost post) {
//        String pinIdCookie = cookie.get("pin");
//        System.out.println(pinIdCookie);
//        if (pinIdCookie != null) {
//            post.setHeader("Cookie", pinIdCookie);
//        }
//    }
//    private void getAndStoreCookiesFromResponse(HttpResponse report) {
//        Header setCookieHeader = report.getFirstHeader("Set-Cookie");
//        if (setCookieHeader != null) {
//            String cookiePairsString = setCookieHeader.getValue();
//            System.out.println("Set-Cookie:" + cookiePairsString);
//            if (cookiePairsString != null && cookiePairsString.trim().length() > 0) {
//                String[] cookiePairs = cookiePairsString.split(";");
//                if (cookiePairs != null) {
//                    for (String cookiePair : cookiePairs) {
//                        if (cookiePair.contains("pin")) {
//                            cookie.put("pin", cookiePair);
//                        }
//                    }
//                }
//            }
//        }
//    }
}
