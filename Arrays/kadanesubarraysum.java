// print kadane's algorithm
class ArrayCC {
    public static void kadaneArray(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int smallestNegative = Integer.MIN_VALUE; // Initialize to the smallest possible value
        boolean hasPositive = false; // Flag to check if there are any positive numbers in the array

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];

            // Check if ms should be updated
            if (ms < cs) {
                ms = Math.max(cs, ms);
            }

            // Check if smallestNegative should be updated
            if (numbers[i] < 0 && numbers[i] > smallestNegative) {
                smallestNegative = numbers[i];
            }

            // Check if there are any positive numbers in the array
            if (numbers[i] > 0) {
                hasPositive = true;
            }
        }

        // If there are no positive numbers in the array, print the smallest negative number
        if (!hasPositive) {
            System.out.println("Smallest Negative Number is " + smallestNegative);
        } else {
            System.out.println("Max Subarray sum is " + ms);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        kadaneArray(numbers);
        
        int negativeNumbers[] = {-5, -3, -7, -1, -9};
        kadaneArray(negativeNumbers);
    }
}