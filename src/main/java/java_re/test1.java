package java_re;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        String string = "a\\b\\c";
        System.out.println(string);
        System.out.println(string.replace("\\", "_\\\\_"));
        System.out.println(string.replaceAll("\\\\", "_\\\\\\\\_"));
        String string1 = "abcd";
        System.out.println(string1.contains("ab") + "," + string1.contains("ab.*"));
        String number = "13512345678";
        String regex = "1[358]\\d{9}";
        boolean isMatch = number.matches(regex) && Pattern.matches(regex, number) && Pattern.compile(regex).matcher(number).matches();
        System.out.println(isMatch + "," + "12512345678".matches(regex));
        String str1 = "注意\\\\和$呀";
        System.out.println(str1.replaceAll("\\$", "\\\\"));
        System.out.println("\\\\");
        String str2 = "我我.我我要...要要要要...要.学学学..学学编编...编编..编..程程...程程...";
        System.out.println(str2.replaceAll("\\.+", "")); //我要学编程
        System.out.println(str2);
        System.out.println(str2.replaceAll("\\.+", "").replaceAll("(.)\\1+","$1")); //我要学编程
        String ipString = "192.168.0.11  3.0.25.3";
        String ipStringFillZeros = ipString.replaceAll("(\\d+)", "00$1");//先补2个零  // $1 取到分组的第一个元素
        System.out.println(ipStringFillZeros);//00192.00168.000.0011  003.000.0025.003
        String regex1 = "([a-z]+)(\\d+)";
        String line = "bqt20094哈哈abc789";
        Matcher m = Pattern.compile(regex1).matcher(line);
        System.out.println(m.groupCount());
        while(m.find()){
            System.out.println(m.group() + m.start() + m.end());
            for (int i = 0; i < m.groupCount(); i++) {
                System.out.println("\tgroup" + i + ":" + m.group(i));
            }
        }
    }
}
