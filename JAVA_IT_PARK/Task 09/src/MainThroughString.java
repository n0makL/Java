import java.util.Scanner;

public class MainThroughString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.nextLine().toCharArray();
        String s = "";

        for (int i = 0; i < charArray.length; i++) {
            s = s + charArray[i];
        }
        int result = Integer.parseInt(s);
        System.out.println(s);
        System.out.println(++result);


        }
    }



