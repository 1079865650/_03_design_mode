package date_04_06.Chain_of_Responsibility.sub;

import date_04_06.Chain_of_Responsibility.inter.RequestHandle;
import org.omg.CORBA.Request;

public class PMRequestHandle implements RequestHandle {
    RequestHandle requestHandle;
    public PMRequestHandle(RequestHandle requestHandle){
        this.requestHandle = requestHandle;
    }

    @Override
    public void handleRequest(Request request) {

    }
//    @Override
//    public void handleRequest(Request request) {
//        if(request instanceof AddMoneyRequest){
//            System.out.println("像加薪？不可能的！");
//        }else {
//            requestHandle.handleRequest(request);
//        }
//    }

}
