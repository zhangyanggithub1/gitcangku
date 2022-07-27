package package626;

import org.testng.annotations.Test;

public class test2Test {
    @Test(dependsOnMethods = "fangfa2",alwaysRun = true)
    public void fangfa(){
        System.out.println("test2Testfangfa");
        // Assert.assertEquals(false,true);
    }
    @Test
    public void fangfa2(){
        System.out.println("test2Testfangfa2");
        // Assert.assertEquals(false,true);
    }
}
