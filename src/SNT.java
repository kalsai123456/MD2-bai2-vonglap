import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        int number = 0;

        for (int i = 2; ; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j ==0){
                    count++;
                }
            }
            if (count == 2 && number <20 ){
                System.out.println(i + ",");
                number++;
            }
        }
    }
}
