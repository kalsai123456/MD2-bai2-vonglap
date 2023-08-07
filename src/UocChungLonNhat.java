import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: " );
        a = sc.nextInt();
        System.out.println("Enter b: " );
        b = sc.nextInt();
        if (a == 0 || b == 0){
            System.out.println("Khong co uoc chung");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }

        } System.out.println("Uoc chung lon nhat la: " + a);
    }
}
