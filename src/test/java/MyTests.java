import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testMemo() {
        HouseRobber hr = new HouseRobber();
        assertEquals(6, hr.robMemoization(new int[] {1, 4, 5}));
        hr = new HouseRobber();
        assertEquals(0, hr.robMemoization(new int[0]));
        hr = new HouseRobber();
        assertEquals(5, hr.robMemoization(new int[] {5}));
        hr = new HouseRobber();
        assertEquals(13, hr.robMemoization(new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 5, 0}));
    }

    @Test
    public void testTabulation() {
        assertEquals(6, HouseRobber.robTabulation(new int[] {1, 4, 5}));
        assertEquals(0, HouseRobber.robTabulation(new int[0]));
        assertEquals(5, HouseRobber.robTabulation(new int[] {5}));
        assertEquals(13, HouseRobber.robTabulation(new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 5, 0}));
    }
}