// print sum of subarrays of an array
class ArrayCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.print("Subarray [" + i + ".." + j + "]: ");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" (Sum: " + currSum + ")");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        maxSubarraySum(numbers);
    }
}
class ArrayCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.print("Subarray [" + i + ".." + j + "]: ");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" (Sum: " + currSum + ")");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        maxSubarraySum(numbers);
    }
}
