package package626;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class test1Test {
 @Test(dependsOnMethods = "fangfa2",alwaysRun = true)
    public void fangfa(){
     System.out.println("fangfa");
    // Assert.assertEquals(false,true);
 }
    @Test
    public void fangfa2(){
        System.out.println("fangfa2");
       // Assert.assertEquals(false,true);
    }
}