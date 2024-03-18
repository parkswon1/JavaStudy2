import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTest {
    @Test
    void substring() {
        String str = "abcde";
        assertEquals("cd", str.substring(2, 4));
    }
}