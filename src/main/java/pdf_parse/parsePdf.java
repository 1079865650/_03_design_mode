package pdf_parse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;

public class parsePdf {
    public static void main(String[] args) {
        ParsePdfContent.tqPdfDataToTxt("F:\\Users\\DeskTop\\11.pdf","F:\\Users\\DeskTop\\22.txt");
    }
    public static void tqPdfDataToTxt(String sourcePdfPath, String outFilePath){
        File file = new File(sourcePdfPath);
        if(file.exists()){
            try{
                PDDocument doc = PDDocument.load(file);
                //正式使用时，此处注释开始--------------
                FileOutputStream fos = new FileOutputStream(outFilePath);
                Writer writer = new OutputStreamWriter(fos, "UTF-8");
                //正式使用时，此处注释结束--------------
                PDFTextStripper stripper = new PDFTextStripper();
                stripper.setSortByPosition(true);// 排序
                stripper.setEndPage(1);//要解析的结束页数，此处我只解析第一页
                stripper.setWordSeparator("##");//单元格内容的分隔符号
                stripper.setLineSeparator("\n");//行与行之间的分隔符号
                String text = stripper.getText(doc);
                String[] rows = text.split("\n");
                System.out.println(rows);
                System.out.println(text);
            }catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
