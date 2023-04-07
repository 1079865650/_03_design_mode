package date_04_07.singleton_pattern.sub;

public class Test {
    public class ABC{
        public ABC(){}
    }
    public class CDB{
        public CDB(){
            ABC n1,n2;
            n1 = new ABC();
            n2 = new ABC();
            System.out.println("CBD：" + (n1 == n2));
        }
    }

    public static void main(String[] args) {
        ABC n1, n2;
        n1 = new Test().new ABC();
        n2 = new Test().new ABC();
        System.out.println("main:" + (n1 == n2));
        new Test().new CDB();
    }
}
