import java.util.HashMap;

public class CoinChange {
    // This HashMap will store the previously computed
    // values for the coin change problem
    HashMap<Integer, Integer> memo;

    // Constructor just creates an empty HashMap
    public CoinChange() {
        memo = new HashMap<>();
    }

    // The recursive method is given an int[] corresponding
    // to the available coin types, and an amount of money
    // to add up to. It should return the fewest number of coins
    // needed to make up that amount.
    // For this version, you should not use memoization. Just compute
    // the answer recursively.
    public int changeNoMemo(int[] coins, int amount) {
        // YOUR CODE HERE
        return -1;
    }

    // The recursive method is given an int[] corresponding
    // to the available coin types, and an amount of money
    // to add up to. It should return the fewest number of coins
    // needed to make up that amount.
    // For this version, take advantage of the HashMap instance variable
    // to memoize sub-problems you've calculated as you go.
    public int changeWithMemo(int[] coins, int amount) {
        // YOUR CODE HERE
        return -1;
    }
}
