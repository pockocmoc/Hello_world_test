package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void sayHello() {
        var str = new Hello();
        assertSame("Hello World!", str.sayHello());
    }
}