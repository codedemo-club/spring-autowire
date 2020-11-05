package club.codedemo.springautowire.section3;

import org.springframework.stereotype.Component;

@Component
public class FooFormatter {
    public String format() {
        return "foo";
    }
}
