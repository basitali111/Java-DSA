// print subarrays of an array
class ArrayCC {
    public static void printSubarray(int numbers[]) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                total++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + total);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        printSubarray(numbers);
    }
}