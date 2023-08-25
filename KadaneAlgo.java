
public class KadaneAlgo {
    public static void kadane(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 1; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max sum = " + ms);
    }

    public static void main(String args[]) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(number);
    }
}
