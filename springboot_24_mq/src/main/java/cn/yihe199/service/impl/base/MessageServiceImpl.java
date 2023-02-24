package cn.yihe199.service.impl.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.yihe199.service.MessageService;

//@Service
public class MessageServiceImpl implements MessageService {

    private final List<String> msgList = new ArrayList<>();

    @Override
    public void sendMessage(String id) {
        msgList.add(id);
        System.out.println("待发送短信的订单已经进入处理队列:" + id);

    }

    @Override
    public String doMessage() {
        //移除
        if (msgList.size() > 0) {
            final String remove = msgList.remove(0);
            System.out.println("已经完成发送短信业务：" + remove);
            return remove;
        }
        return null;
    }
}
