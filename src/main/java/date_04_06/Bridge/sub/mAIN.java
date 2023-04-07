package date_04_06.Bridge.sub;

public class mAIN {
    public static void main(String[] args) {
        System.out.println("=====折叠式小米手机啊=====");
        FoldedPhone phone = new FoldedPhone(new XiaoMi());// FoldedPhone 里面放品牌 品牌是小米继承 小米重写抽象方法s
        phone.open();
        phone.close();
        phone.call();

        System.out.println("======折叠式vivo手机======");
        phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("===============直立式Vivo手机=================");
//        new UpRightPhone()
    }
}
