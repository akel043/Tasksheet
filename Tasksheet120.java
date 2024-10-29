public class Tasksheet120 {

    public static int calculateCumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + num + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int totalCumulativeSum = calculateCumulativeSum(4, 5, 10);
        System.out.println("Total sum of cumulative sums is: " + totalCumulativeSum);
    }
}
