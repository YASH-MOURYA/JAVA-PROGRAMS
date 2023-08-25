import java.util.Scanner;

public class Areaofcircle {
    public static void main(String args[]) {
        System.out.println("Radius R");
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double area = 3.14 * R * R;
        System.out.println("Area=" + area);
        sc.close();

    }

}
