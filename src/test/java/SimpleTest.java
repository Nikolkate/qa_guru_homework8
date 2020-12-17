import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void SimpleTests() {

        int a = 5;
        int b = 5;

        int c = a + b;

        assertEquals(c, 10);
    }
}
