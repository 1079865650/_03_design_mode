package java_re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {
    public static void main(String[] args) {
        Pattern pattern03 = Pattern.compile("(a+)\\s(b+)\\s(c+)");
        String source03 = "aaaa bbbb cccc";
        Matcher matcher03 = pattern03.matcher(source03);
        if (matcher03.matches()) {
            System.out.println("group 0" + ":" + matcher03.group(0));
            System.out.println("group 1" + ":" + matcher03.group(1));
            System.out.println("group 2" + ":" + matcher03.group(2));
            System.out.println("group 3" + ":" + matcher03.group(2));
        }
    }
    void aa(){
        Pattern pattern01 = Pattern.compile("([^@]+)?@([^@+])?,");
//        Matcher matcher01 = pattern01.matcher(source);
    }
}
