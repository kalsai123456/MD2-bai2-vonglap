import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class soNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " Khong phai so nguyen to ");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + "la so nguyen to");
            } else {
                System.out.println(number + "khong phai so nguyen to")  ;
            }

        }
    }
}