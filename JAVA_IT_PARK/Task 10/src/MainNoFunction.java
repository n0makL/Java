import java.util.Scanner;

public class MainNoFunction {
    public static int search(char[] main, char[] sought, int pointEntry) {
        int j = pointEntry;
        for (int i = 0; i < sought.length ; i++) {
            if(sought[i] != main[j]){
                return -1;
            }
            j++;
        }
        System.out.println(pointEntry+ " метод search");
        return pointEntry;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] main = scanner.nextLine().toCharArray();
        char[] sought = scanner.nextLine().toCharArray();

        for (int i = 0; i <main.length ; i++) {
            if (main[i] == sought[0]) {
                search(main, sought, i);

                if (search(main, sought, i) != -1) {
                    System.out.println((search(main, sought, i)));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
