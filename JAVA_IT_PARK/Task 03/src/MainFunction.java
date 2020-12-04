import java.util.Scanner;

public class MainFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int composition = 1;
        int position = 1;
        while (number != -1){
            if (number == 1){
                System.out.println("Число непростое");
            }
            if (number == 2 || number == 3){
                composition = composition * position;
                System.out.println("Число простое");

            }
            position ++;
            number = scanner.nextInt();
        }
    }
}
