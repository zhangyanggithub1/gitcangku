package redexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelUtils {

//    public static void main(String[] args) {
//
//        try {
//            //创建工作簿
//            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("D:\\shuju.xlsx"));
//
//            //System.out.println("xssfWorkbook对象：" + xssfWorkbook);
//            //读取第一个工作表
//            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
//            System.out.println("var member=[");
//            //System.out.println("sheet对象：" + sheet);
//            //获取最后一行的num，即总行数。此处从0开始计数
//            int maxRow = sheet.getLastRowNum();
//            System.out.println(maxRow);
//            //System.out.println("总行数为：" + (maxRow+1));
//            for (int row=1; row <=maxRow; row++) {
//                //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
//                System.out.println("{");
//                //System.out.println("--------第" + row + "行的数据如下--------");
//                System.out.println("姓名:\""+sheet.getRow(row).getCell(0)+"\",");
//                System.out.println("性别:\""+sheet.getRow(row).getCell(1) + "\",");
//                System.out.println("地址:\""+sheet.getRow(row).getCell(2)+"\",");
//                System.out.println("手机:\""+sheet.getRow(row).getCell(3) + "\",");
//                System.out.println("年龄:\""+sheet.getRow(row).getCell(4) + "\",");
//                fengzhuang fz=new fengzhuang(null,null,null,null,0.00);
//                fz.setName(String.valueOf(sheet.getRow(row).getCell(0)));
//                fz.setgender(String.valueOf(sheet.getRow(row).getCell(1)));
//                fz.setaddress(String.valueOf(sheet.getRow(row).getCell(2)));
//                fz.setphone(String.valueOf(sheet.getRow(row).getCell(3)));
//                fz.setage(Double.valueOf(String.valueOf(sheet.getRow(row).getCell(4))));
//                fz.eat();
//
//                if(row!=maxRow) {
//                    System.out.println("},");
//                }else {
//                    System.out.println("}");
//                }
//            }
//            System.out.println("]");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    @Test
    public static void ReadExcel() throws IOException {
        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("D:\\shuju.xlsx"));
            //System.out.println("xssfWorkbook对象：" + xssfWorkbook);
            //读取第一个工作表
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            System.out.println("var member=[");
            //System.out.println("sheet对象：" + sheet);
            //获取最后一行的num，即总行数。此处从0开始计数
            int maxRow = sheet.getLastRowNum();
            int columnNum;
            columnNum = sheet.getRow(1).getPhysicalNumberOfCells();
            System.out.println(columnNum);
            System.out.println(maxRow);
            //System.out.println("总行数为：" + (maxRow+1));
            for (int row = 1; row <= maxRow; row++) {
                //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
                System.out.println("{");
                /* System.out.println("--------第" + row + "行的数据如下--------"); */
                System.out.println("姓名:\"" + sheet.getRow(row).getCell(0).toString() + "\",");

                System.out.println("性别:\"" + sheet.getRow(row).getCell(1).toString() + "\",");
                System.out.println("地址:\"" + sheet.getRow(row).getCell(2).toString() + "\",");
                System.out.println("手机:\""+sheet.getRow(row).getCell(3) + "\",");
                String tmp= (sheet.getRow(row).getCell(4)).toString();
                int age=(int)Double.parseDouble(String.valueOf(sheet.getRow(row).getCell(4)));
                System.out.println("年龄:\"" + age + "\",");
                fengzhuang fz = new fengzhuang(null, null, null, null, 0);
                fz.setName(String.valueOf(sheet.getRow(row).getCell(0)));
                fz.setgender(String.valueOf(sheet.getRow(row).getCell(1)));
                fz.setaddress(String.valueOf(sheet.getRow(row).getCell(2)));
                fz.setphone(String.valueOf(sheet.getRow(row).getCell(3)));
                fz.setage(age);
                fz.tostring();
                if (row != maxRow) {
                    System.out.println("},");
                } else {
                    System.out.println("}");
                }
            }
            System.out.println("]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
