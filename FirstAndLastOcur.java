public class FirstAndLastOcur {
    public static int firstOc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOc(arr, key, i + 1);
    }

    public static int lastOc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOc(arr, key, i + 1);
        if (isFound == -1 && key == arr[i]) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 6, 5, 4, 8, 5, 9, 7 };
        // int key=5;
        System.out.println(lastOc(arr, 5, 0));
    }

}
