package club.codedemo.springautowire.section51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    @Qualifier("fooMessage")
    Message message;

    @Autowired
    @MessageType
    Message message1;

    @Autowired
    Message barMessage;

    public Message getMessage() {
        return message;
    }

    public Message getMessage1() {
        return message1;
    }

    public Message getBarMessage() {
        return barMessage;
    }
}
