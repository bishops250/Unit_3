import org.junit.Test;

import static org.junit.Assert.*;

public class RightTriangleTest {

    @Test
    public void isTriangleTest() {
        assertEquals(true, RightTriangle.isTriangle(12, 5, 13));
        assertEquals(false, RightTriangle.isTriangle(5, 2, 3));
        assertEquals(true, RightTriangle.isTriangle(12, 5, 15));
    }

    @Test
    public void isRightTest() {
        assertEquals(true, RightTriangle.isRight(5, 12, 13));
        assertEquals(false, RightTriangle.isRight(5, 2, 3));
        assertEquals(false, RightTriangle.isRight(15, 5, 12));
    }
}