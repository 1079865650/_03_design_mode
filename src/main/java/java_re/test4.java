package java_re;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {
    String info = "27.19.74.143 - - [30/Mar/2015:17:38:20 +0800] \"GET /static/image/common/faq.gif HTTP/1.1\" 200 1127";

    @Test
    public void test() {
        String info = "27.19.74.143 - - [30/Mar/2015:17:38:20 +0800] \"GET /static/image/common/faq.gif HTTP/1.1\" 200 1127";
        Pattern p = Pattern.compile("(?<=image/)[a-zA-Z]*(?=\\/)");
        Matcher m = p.matcher(info);
        m.find();
        System.out.println(m.group());
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    @Test
    public void list1() {
        Pattern p = Pattern.compile("^Java.*$");
        Matcher m = p.matcher("Java是一门开发语言");
        boolean b = m.matches();
        System.err.println(b);
//        m1 = p.matcher("查询Java是一门开发语言");
    }

    @Test
    public void test2() {
        Pattern p = Pattern.compile("[,||]+");
        String[] split = p.split("java,world|sun||ok");
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s);
        }
    }

    @Test
    public void test4() {
        String info = "a-b.A1-23_4@yahoo.com.cn";
        Pattern p = Pattern.compile("([\\w-.]+@)([\\w]+\\.[\\w]+\\.[\\w]+)", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(info);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }

    @Test
    public void test5() {
        String info = "<a href=\"/index.html\">主页</a>";
        Pattern p = Pattern.compile("<.*?>");
        Matcher m = p.matcher(info);
        String str = m.replaceAll("");
        System.out.println(str);
    }

    @Test
    public void test6() {
        Pattern p = Pattern.compile("(http|https){1}(://){1}[\\w\\.\\/]+");
        Pattern p1 = Pattern.compile("(http|https){1}.*(?=\"){1}");
        Matcher m = p1.matcher("<a href=\"http://jf.10086.cn/ware/111.html\"></a>");
        StringBuffer buffer = new StringBuffer();
        while (m.find()) {
//            buffer.append(m.group());
//            String protocal = m.group(1);
//            System.out.println(protocal);
//            System.out.println(buffer.toString());
            System.out.println(m.group());
        }
    }

    @Test
    public void test7() {

        String info = "27.19.74.143 - - [30/Mar/2015:17:38:20 +0800] \"GET /static/image/common/faq.gif HTTP/1.1\" 200 1127";

        StringBuffer regexp = new StringBuffer()
                .append("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})[\\s]*")//ip地址
                .append("\\s-\\s-\\s")//为了匹配“- -”（但不提取它），正则表达式中间加入了“\s-\s-\s”
                .append("\\[(.*?)\\s*[-+0-9]*?\\][\\s]*")//[ 和  ] 有特殊含义，故需要转义
                .append("\"(.*?)\"[\\s]*")// 请求
                .append("(.*)[\\s]+")//状态码
                .append("(.*)");//流量
        Pattern p = Pattern.compile(regexp.toString());

        Matcher m = p.matcher(info);

        if (m.find()) {
            String ip = m.group(1);
            String date = m.group(2);
            System.out.println("ip=>" + ip);
            System.out.println("date=>" + date);
            Pattern pp = Pattern.compile("(.*)[\\s]+(.*)[\\s]+(.*)[\\s]*");
            Matcher mm = pp.matcher(m.group(3));
            if (mm.find()) {
                String method = mm.group(1);
                String url = mm.group(2);
                String protocol = mm.group(3);
                System.out.println("method=>" + method);
                System.out.println("url=>" + url);
                System.out.println("protocol=>" + protocol);
            }

            String status = m.group(4);
            System.out.println("status=>" + status);
            String flow = m.group(5);
            System.out.println("flow=>" + flow);
        }
    }

}
























