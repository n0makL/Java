import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        int expectedResult = 0;
        int resultingResult = 0;
        for (int i = 1; i <=1000 ; i++) {
            expectedResult = expectedResult+i;
        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < 1000; i++) {
            resultingResult = number;
            number = scanner.nextInt();
        }
        if (expectedResult - resultingResult == 0){
            System.out.println("Нет пропущенного числа");
            return;
        }
        System.out.println("Пропущенное число - " + (expectedResult - resultingResult));
    }
}
