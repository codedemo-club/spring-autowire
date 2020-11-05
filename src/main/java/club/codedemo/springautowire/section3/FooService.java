package club.codedemo.springautowire.section3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
    @Autowired
    private FooFormatter fooFormatter;

    private FooFormatter fooFormatter1;

    private FooFormatter fooFormatter2;

    @Autowired
    public FooService(FooFormatter fooFormatter2) {
        this.fooFormatter2 = fooFormatter2;
    }

    @Autowired
    public void setFooFormatter1(FooFormatter fooFormatter1) {
        this.fooFormatter1 = fooFormatter1;
    }

    public FooFormatter getFooFormatter() {
        return fooFormatter;
    }

    public FooFormatter getFooFormatter1() {
        return fooFormatter1;
    }

    public FooFormatter getFooFormatter2() {
        return fooFormatter2;
    }
}
