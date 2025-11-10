import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    // Tests for latestNonOverlapping helper method
    @Test
    public void testLatestNonOverlappingEmpty() {
        WeightedInterval[] intervals = {};
        assertEquals(-1, Main.latestNonOverlapping(intervals, 0));
    }

    @Test
    public void testLatestNonOverlappingFirst() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5)
        };
        assertEquals(-1, Main.latestNonOverlapping(intervals, 0));
    }

    @Test
    public void testLatestNonOverlappingNoOverlap() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5),
            new WeightedInterval(4, 6, 6)
        };
        assertEquals(0, Main.latestNonOverlapping(intervals, 1));
    }

    @Test
    public void testLatestNonOverlappingWithOverlap() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5),
            new WeightedInterval(2, 5, 6),
            new WeightedInterval(6, 8, 3)
        };
        assertEquals(1, Main.latestNonOverlapping(intervals, 2));
    }

    @Test
    public void testLatestNonOverlappingMultiple() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 2, 1),
            new WeightedInterval(1, 3, 2),
            new WeightedInterval(3, 5, 3),
            new WeightedInterval(4, 7, 4),
            new WeightedInterval(8, 10, 5)
        };
        assertEquals(3, Main.latestNonOverlapping(intervals, 4));
    }

    // Tests for weightedInterviewScheduling
    @Test
    public void testWeightedInterviewSchedulingEmpty() {
        WeightedInterval[] intervals = {};
        assertEquals(0, Main.weightedInterviewScheduling(intervals));
    }

    @Test
    public void testWeightedInterviewSchedulingSingle() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5)
        };
        assertEquals(5, Main.weightedInterviewScheduling(intervals));
    }

    @Test
    public void testWeightedInterviewSchedulingNoOverlap() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5),
            new WeightedInterval(4, 6, 6),
            new WeightedInterval(7, 9, 2)
        };
        assertEquals(13, Main.weightedInterviewScheduling(intervals));
    }

    @Test
    public void testWeightedInterviewSchedulingWithOverlap() {
        WeightedInterval[] intervals = {
            new WeightedInterval(0, 3, 5),
            new WeightedInterval(1, 4, 6),
            new WeightedInterval(5, 7, 4)
        };
        assertEquals(10, Main.weightedInterviewScheduling(intervals));
    }

    @Test
    public void testWeightedInterviewSchedulingComplex() {
        WeightedInterval[] intervals = {
            new WeightedInterval(1, 3, 5),
            new WeightedInterval(2, 5, 6),
            new WeightedInterval(4, 6, 5),
            new WeightedInterval(6, 7, 4),
            new WeightedInterval(5, 8, 11),
            new WeightedInterval(7, 9, 2)
        };
        assertEquals(17, Main.weightedInterviewScheduling(intervals));
    }

    // Tests for minFallingPathSum
    @Test
    public void testMinFallingPathSumSingleElement() {
        Main main = new Main();
        int[][] matrix = {{5}};
        assertEquals(5, main.minFallingPathSum(matrix));
    }

    @Test
    public void testMinFallingPathSumTwoByTwo() {
        Main main = new Main();
        int[][] matrix = {
            {2, 1},
            {3, 4}
        };
        assertEquals(4, main.minFallingPathSum(matrix));
    }

    @Test
    public void testMinFallingPathSumThreeByThree() {
        Main main = new Main();
        int[][] matrix = {
            {2, 1, 3},
            {6, 5, 4},
            {7, 8, 9}
        };
        assertEquals(13, main.minFallingPathSum(matrix));
    }

    @Test
    public void testMinFallingPathSumNegativeNumbers() {
        Main main = new Main();
        int[][] matrix = {
            {-19, 57},
            {-40, -5}
        };
        assertEquals(-59, main.minFallingPathSum(matrix));
    }

    @Test
    public void testMinFallingPathSumLarger() {
        Main main = new Main();
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        assertEquals(28, main.minFallingPathSum(matrix));
    }

    @Test
    public void testMinFallingPathSumMixedValues() {
        Main main = new Main();
        int[][] matrix = {
            {-48, -10, -100},
            {65, -73, 68},
            {56, -53, 10}
        };
        assertEquals(-226, main.minFallingPathSum(matrix));
    }
}
