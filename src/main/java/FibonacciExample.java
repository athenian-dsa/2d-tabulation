import java.util.HashMap;

// This is an example of how memoization works
public class FibonacciExample {
    // This HashMap will store the previously computed
    // values for the Fibonacci sequence
    HashMap<Integer, Integer> memo;

    public FibonacciExample() {
        memo = new HashMap<>();
    }

    public int fib(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // If we've already calculated fib(n), return the
        // stored value
        else if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // If not, calculate the value, store, and return it
        else {
            int num = fib(n - 1) + fib(n - 2);
            memo.put(n, num);
            return num;
        }
    }
}