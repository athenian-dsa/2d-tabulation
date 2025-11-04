import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testChangeNoMemo() {
        CoinChange c1 = new CoinChange();
        assertEquals(4, c1.changeNoMemo(new int[] {1, 4, 5}, 18));
        c1 = new CoinChange();
        assertEquals(7, c1.changeNoMemo(new int[] {1, 4, 5}, 33));
        c1 = new CoinChange();
        assertEquals(4, c1.changeNoMemo(new int[] {1, 3, 5}, 16));
        c1 = new CoinChange();
        assertEquals(7, c1.changeNoMemo(new int[] {1, 3, 5}, 33));
    }

    @Test
    public void testChangeMemoSmall() {
        CoinChange c1 = new CoinChange();
        assertEquals(4, c1.changeWithMemo(new int[] {1, 4, 5}, 18));
        c1 = new CoinChange();
        assertEquals(7, c1.changeWithMemo(new int[] {1, 4, 5}, 33));
        c1 = new CoinChange();
        assertEquals(4, c1.changeWithMemo(new int[] {1, 3, 5}, 16));
        c1 = new CoinChange();
        assertEquals(7, c1.changeWithMemo(new int[] {1, 3, 5}, 33));
    }

    @Test
    public void testChangeMemoLarge() {
        CoinChange c1 = new CoinChange();
        assertEquals(118, c1.changeWithMemo(new int[] {1, 4, 5}, 588));
        c1 = new CoinChange();
        assertEquals(258, c1.changeWithMemo(new int[] {1, 4, 5}, 1288));
    }
}