package package626;

import java.io.File;
import java.util.Date;

public class ReadExcel {
//    public static Map<String, List<String>> test(File file) throws Exception{
//        FileInputStream in = new FileInputStream(file);
//        Map<String,List<String>> mapData = new HashMap<String, List<String>>();
//        Workbook wk = StreamingReader.builder()
//                .rowCacheSize(100)  //缓存到内存中的行数，默认是10
//                .bufferSize(4096)  //读取资源时，缓存到内存的字节大小，默认是1024
//                .open(in);  //打开资源，必须，可以是InputStream或者是File，注意：只能打开XLSX格式的文件
//        int sheetNums = wk.getNumberOfSheets();
//        for(int i = 0 ; i < sheetNums;i ++){
//            List<String> sheetData = new ArrayList<String>();
//            Sheet sheet = wk.getSheetAt(i);
//            String sheetName = wk.getSheetName(i);
//            //遍历所有的行
//            int k = 0;
//            for (Row row : sheet) {
//                StringBuilder sb = new StringBuilder();
//                //遍历所有的列
//                for (Cell cell : row) {
//                    sb.append(cell.getStringCellValue());
//                }
//                System.out.println(k++ + "\t" + sb.toString());
//            }
//
//
//        }
//        return mapData;
//    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\数据导入模板及填写格式 (2).xlsx");
        long t1 = new Date().getTime();
//        test(file);
        long t2 = new Date().getTime();

        System.out.println((t2-t1)/1000 + "秒");

    }


}
