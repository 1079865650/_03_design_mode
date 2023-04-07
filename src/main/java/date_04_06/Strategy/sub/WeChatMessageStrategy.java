package date_04_06.Strategy.sub;

import date_04_06.Strategy.inter.MessageStrategy;

@Component
public class WeChatMessageStrategy implements MessageStrategy {
    @Override
    public String sendMessage() {
        return "发送微信消息...";
    }
    @Override
    public String getMessageType() {
        return "WeChat";
    }
}
