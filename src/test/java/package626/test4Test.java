package package626;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4Test {

    //@Parameters ({"111","222"})
//    public void fangfa(String X,String b){
//     System.out.println( "aaa"+X+""+b);
//    // Assert.assertEquals(false,true);
// }
    @Test(dataProvider = "datas")
    //  @Parameters ({"111","333"})

    public void fangfa2(String X, String b) {
        System.out.println("bbb" + X + "" + b);
        //  Assert.assertEquals(false,true);
    }
    @DataProvider(name="datas")
    public Object[][] datas() {
        Object[][] datas = {
                {"张", "三"},
                {"李", "四"}
        };
        return datas;

    }
}