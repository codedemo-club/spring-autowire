package club.codedemo.springautowire.section51;

import org.springframework.stereotype.Component;

@Component
@MessageType
public class FooMessage implements Message {

    @Override
    public String hello() {
        return "foo";
    }
}
