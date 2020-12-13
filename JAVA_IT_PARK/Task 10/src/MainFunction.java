
import java.util.Scanner;

public class MainFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] main = scanner.nextLine().toCharArray();
        char[] sought = scanner.nextLine().toCharArray();
        System.out.println(indexSearch(main,sought));
    }
    public static int indexSearch(char[] main, char[] sought) {
        int position = -1;
        for (int i = 0; i <main.length ; i++) {
            if (main[i] == sought[0]) {
                position = i;
                int j = i;
                for (int k = 0; k < sought.length ; k++) {
                    if(sought[k] != main[j]){
                        position = -1;
                        break;
                    }
                    j++;
                }
                if (position >= 0){
                    return position;
                }
            }
        }
        return position;
    }
}
