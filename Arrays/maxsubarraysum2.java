class ArrayCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
         for (int i = 1; i < prefix.length; i++) {
             prefix[i] = prefix[i - 1] + numbers[i];
         }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
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