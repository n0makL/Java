import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int a = array[0]-48;
        for (int i = 1; i < array.length ; i++) {
            a = a * 10;
            a = a + (array[i] - 48);

        }
        System.out.println(a);
    }
}
