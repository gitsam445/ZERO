public class zeroday1_2largest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 0 };
        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
         
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondlargest);
    }
}
