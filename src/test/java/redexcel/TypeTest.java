package redexcel;

import org.testng.annotations.Test;

public class TypeTest {


  /**
   * 一个使用typecasting将double转换为int的Java程序
   **/
  @Test
      public static void main(String []args){
          double doubleValue = 82.14; // 82.14
          System.out.println("doubleValue: "+doubleValue);
          //typecase double to int
          int intValue = (int) doubleValue; // 82
          System.out.println("intValue1111111: "+intValue);
      }
  }


