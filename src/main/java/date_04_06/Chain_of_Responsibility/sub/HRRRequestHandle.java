package date_04_06.Chain_of_Responsibility.sub;

import date_04_06.Chain_of_Responsibility.inter.RequestHandle;
import org.omg.CORBA.Request;

public class HRRRequestHandle implements RequestHandle {
    @Override
    public void handleRequest(Request request) {

    }
//    @Override
//    public void handleRequest(Request request) {
//        if(request instanceof D){
//            System.out.println("想辞职，不可能的!");
//        }
//        System.out.println("请求完毕");
//    }
}
