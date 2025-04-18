import org.example.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(JUnit4.class)
public class StringUtilsDefectTest {

    @Test
    public void testIsEmpty() {
        String str1 = null;
        String str2 = "";
        String str3 = "a";
        String str4 = "abc";

        assertTrue(StringUtils.isEmpty(str1));
        assertTrue(StringUtils.isEmpty(str2));
        // 注入了缺陷，这里预期结果应该为 False
        assertFalse(StringUtils.isEmpty(str3));
        assertFalse(StringUtils.isEmpty(str4));
    }

    @Test
    public void testIsBlank() {
        String str1 = null;
        String str2 = "";
        String str3 = "  ";
        String str4 = "abc";

        assertTrue(StringUtils.isBlank(str1));
        assertTrue(StringUtils.isBlank(str2));
        assertTrue(StringUtils.isBlank(str3));
        assertFalse(StringUtils.isBlank(str4));
    }

    @Test
    public void testEquals() {
        String str1 = "abc";
        String str2 = "aBc";
        String str3 = "DEf";

        assertTrue(StringUtils.equalsIgnoreCase(str1, str2));
        assertFalse(StringUtils.equalsIgnoreCase(str1, str3));
    }
}    