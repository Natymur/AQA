import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    @Test
    public void TestFindMax(){
        int[] nums = {1, 200, -28, 0, 201, -1000};
        int max = MyClass.findMax(nums);
        assertEquals(201, max);
    }

    @Test
    public void TestFindMin() {
        int[] nums = {10, 5, 8, 0, -1, -30, 1000};
        int min = MyClass.findMin(nums);
        assertEquals(-30, min);
    }
}
