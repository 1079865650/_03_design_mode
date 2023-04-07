package date_04_07.singleton_pattern.sub;

public class Singleton {
    private static Singleton uniqeInstance = null;  //静态变量
    private Singleton(){}  // 私有的构造方法，外部无法使用
    public static Singleton getInstance(){
        if(uniqeInstance == null){
            uniqeInstance = new Singleton();
        }
        return uniqeInstance;
    }
}
