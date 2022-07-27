package package626;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test6Test {
    @Test(dataProvider = "datas")
    public void qingqiu(String params){
    String url="https://10.81.106.123/idp/authcenter/ActionAuthChain";

    }
    @DataProvider(name="datas")
    public Object[][] datas(){
        Object[][] datas={
                {"entityId=xkOKRxt"}
        };
        return datas;
    }
  
}

