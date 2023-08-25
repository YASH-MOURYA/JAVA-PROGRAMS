public class Binarysearch {
    public static int binaryS(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] > key) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 10, 11, 15, 45, 50 };
        int key = 11;
        System.out.println("key is :" + binaryS(number, key));
    }
}