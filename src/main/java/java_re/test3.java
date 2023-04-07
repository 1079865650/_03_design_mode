package java_re;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    @Test
    public void test1(){
        String info = "ten";
        Pattern p = Pattern.compile("t.n");
        Matcher m = p.matcher(info);
        System.out.println(m.getClass()); //class java.util.regex.Matcher
        if(m.find()){
            String group = m.group();
            System.out.println(group);
        }
    }
    @Test
    public void test2(){
        String info = "ten";
        Pattern p = Pattern.compile("t[aeio]n");
        Matcher m = p.matcher(info);
        while(m.find()){
            String group = m.group();
            System.out.println(group);
        }
    }
    @Test
    public void test3(){
        String info = "teen";
        Pattern p = Pattern.compile("t(a|ee|i|o)n");
        Matcher m = p.matcher(info);
        while (m.find()){
            String group = m.group();
            System.out.println(group);
        }
    }
    @Test
    public void test4(){
        String info = "102-12-8901";
        Pattern p = Pattern.compile("([\\d]{3})\\-([\\d]{2})\\-([0-9]{4})");
        Matcher m = p.matcher(info);
//        System.out.println(m.group());
        m.find();
        System.out.println(m.group());
//        while(m.find()){
//            String group = m.group();
//            System.out.println(group);
//        }
    }
    @Test
    public void test5(){
        String info = "123-12-1234";
        Pattern p = Pattern.compile("([\\d]{3})\\-?([\\d]{2})\\-?([0-9]{4})");
        Matcher m = p.matcher(info);
        if (m.find()){
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            System.out.println(m.group(0));  // 使用matcher之前必须先find()一下
        }
    }
    @Test
    public void test6(){
        String info = "8836KV";
        Pattern p = Pattern.compile("([\\d]{4})([A-Z]{2})");  // 部分匹配不能返回结果
        Matcher m = p.matcher(info);
        if(m.find()){
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }
    @Test
    public void test7(){
        String info = "June 26, 1951";
        Pattern p = Pattern.compile("([\\w]+)\\s+([\\d]{1,2}),\\s*([\\d]{4})");
        Matcher m = p.matcher(info);
        if (m.find()){
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }

    }



}
