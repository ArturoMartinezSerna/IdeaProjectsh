package paquete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ejemploTest {

    @Test
    void test() {
        ejemplo e = new ejemplo(5,2);
        assertEquals(10, e.area());
        assertEquals(14, e.perimetro());
    }
}