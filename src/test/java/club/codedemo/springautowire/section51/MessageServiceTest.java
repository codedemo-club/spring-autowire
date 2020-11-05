package club.codedemo.springautowire.section51;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageServiceTest {
    @Autowired
    MessageService messageService;

    @Test
    void test() {
        assertTrue(messageService.getMessage() instanceof FooMessage);
        assertTrue(messageService.getMessage1() instanceof FooMessage);
        assertTrue(messageService.getBarMessage() instanceof BarMessage);
    }
}