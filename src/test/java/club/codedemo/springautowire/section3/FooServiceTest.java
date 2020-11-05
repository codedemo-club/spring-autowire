package club.codedemo.springautowire.section3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooServiceTest {
    @Autowired
    FooService fooService;

    @Test
    void test() {
        assertNotNull(fooService.getFooFormatter());
        assertNotNull(fooService.getFooFormatter1());
        assertNotNull(fooService.getFooFormatter2());
    }
}