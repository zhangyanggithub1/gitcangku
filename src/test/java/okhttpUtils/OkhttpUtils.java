package okhttpUtils;

import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class OkhttpUtils {


    @Test
    public static Response getmethod(String url, String parcham) {

//        url = "https://passport.bilibili.com/x/passport-login/web/key";
//        parcham = "_=1659430957458";
        //创建okhttpClinet
        OkHttpClient client = new OkHttpClient();
        //构建
        Request request = new Request.Builder()
                .url(url + "?" + parcham)
                .get()
                .build();
        //使用cliennt发送请求，返回一个响应
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static Response postmethod(String url, String parcham) {
        //创建okhttpClinet
        OkHttpClient client = new OkHttpClient();
        //
        MediaType type = MediaType.parse("application/x-www-form-lencode");
        RequestBody requestBody = RequestBody.create(type, parcham);
        //构建
        Request request = new Request.Builder()
                .url(url + "?" + parcham)
                .post(requestBody)
                .build();
        //使用cliennt发送请求，返回一个响应
        Response response = null;
        try {
            response = client.newCall(request).execute();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static Response Call(String methon, String URL, String params) {
        if ("getmethod".equalsIgnoreCase(methon)) {
            return getmethod(URL, params);
        } else if ("postmethod".equalsIgnoreCase(methon)) {
            return postmethod(URL, params);
        }
        return null;
    }


}
