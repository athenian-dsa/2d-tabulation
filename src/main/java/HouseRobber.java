import java.util.HashMap;

public class HouseRobber {
    // This HashMap will store the previously computed
    // values for the memoization solution
    HashMap<Integer, Integer> memo;

    // Constructor just creates an empty HashMap
    public HouseRobber() {
        memo = new HashMap<>();
    }

    // See description on Canvas
    // For this solution, use the memo table to cache the solutions
    // to sub-problems as you compute them.
    public int robMemoization(int[] houses) {
        // YOUR CODE HERE
        return -1;
    }

    // See description on Canvas
    // For this solution, do not use the cache. Instead, compute values
    // from the base case up, and store them in an array as you go.
    public static int robTabulation(int[] houses) {
        // YOUR CODE HERE
        return -1;
    }
}
