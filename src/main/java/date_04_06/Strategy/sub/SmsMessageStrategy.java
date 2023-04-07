package date_04_06.Strategy.sub;

import date_04_06.Strategy.inter.MessageStrategy;

@Component
public class SmsMessageStrategy implements MessageStrategy {
    @Override
    public String sendMessage() {
        return "发送短信消息....";
    }

    @Override
    public String getMessageType() {
        return "SMS";
    }
}
