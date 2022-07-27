package package626;

import okhttp3.Response;
import okhttpUtils.OkhttpUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test5Test {
    @Test
    public static void qingqiu() {
        String url = "https://www.baidu.com";
        String xx = "";
        //创建okhttpClinet
        OkhttpUtils ok = new OkhttpUtils();
        Response body = ok.getmethod(url, xx);
        System.out.println(body.code());
        System.out.println(body.headers());
        System.out.println(body.header("header"));
        System.out.println(body.body());
        System.out.println(body.message());
        System.out.println(body.toString());
        System.out.println(body.request());
        System.out.println(body.hashCode());
        Assert.assertEquals(body.code(), 200);

//        if(){
//            System.out.println("请求成功");
//        }else {
//
//        }


//           String json=("{\"labelName\":\"2\",\"color\":\"#08979C\",\"tenantId\":\"3742e16860b44f76acfb45a37081a7ac\",\"tenantName\":\"测试\",\"belongUnitId\":\"20220421183941356-A76C-6F5F81863\",\"belongUnitName\":\"测试机构333\",\"belongUnitFullIdPath\":\"20220421183822754-F0BA-E4DBCB2A6,20220421183842697-002D-A86D4A882,20220421183901424-83A0-4AA477657,20220421183941356-A76C-6F5F81863\"}");
//           Response re1= response.post(url,json);
//
//           System.out.println( re1.code());

    }
}
