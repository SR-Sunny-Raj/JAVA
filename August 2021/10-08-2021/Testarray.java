class Testarray {
    public static void main(String[] args) {
        double[] arr = { 1.3, 2.4, 8.6, 5.87 };
        double sum = 0;
        System.out.println("Array elements are -: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nThe sum of the array elements is -: " + sum);
    }
}