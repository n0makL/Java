import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int composition = 1;
        int position = 1;
        int digitsSum = 0;
        int currentDigit;

        while (number != -1){
        if (number == 1){
            System.out.println("Число непростое");
            position++;
            number = scanner.nextInt();
            continue;
        }
        if(number == 2 || number == 3){
            System.out.println("Число простое");
            composition = composition * position;
            position++;
            number = scanner.nextInt();
            continue;
        }

            while (number != 0){
                currentDigit = number % 10;
                digitsSum = digitsSum + currentDigit;
                number = number / 10;
            }
            int divider = 2;
            boolean result = true;

            while (divider < (digitsSum/2)){
                if (digitsSum % divider == 0){
                    result = false;
                    System.out.println("Сумма цифр - непростое число");
                    break;
                }
                divider++;
            }
            if( result == true){
                System.out.println("Сумма цифр - простое число, позиция - " + position);
                composition = composition * position;
            }


            digitsSum = 0;
            position++;
            number = scanner.nextInt();

        }
        System.out.println(composition);
    }
}
