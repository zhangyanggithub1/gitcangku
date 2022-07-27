package package626;

import org.testng.annotations.Test;

public class test7TEST {
    @Test(dependsOnMethods = "fangfa2",alwaysRun = true)
    public void fangfa(){
        System.out.println("fangfa111");
        // Assert.assertEquals(false,true);
    }
    @Test
    public void fangfa2(){
        System.out.println("fangfa2");
        // Assert.assertEquals(false,true);
    }
}
