package date_04_06.Chain_of_Responsibility.inter;

import org.omg.CORBA.Request;

public interface RequestHandle {
    void handleRequest(Request request);
}
