package club.codedemo.springautowire.section51;

import org.springframework.stereotype.Component;

@Component
//@Component("customBarMessage")
public class BarMessage implements Message {

    @Override
    public String hello() {
        return "bar";
    }
}
