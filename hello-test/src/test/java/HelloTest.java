import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    // f(name) = "Hello kansank"
    @Test
    @DisplayName("ทำการทดสอบ .....")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "kansank";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello kansank", actualResult);
    }
}