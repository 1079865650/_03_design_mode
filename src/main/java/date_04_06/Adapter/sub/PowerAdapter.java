package date_04_06.Adapter.sub;

import date_04_06.Adapter.inter.DC5;

public class PowerAdapter extends AC220 implements DC5 {

    @Override
    public int output5V() {
        int adapterInput = super.outputAC220v();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
