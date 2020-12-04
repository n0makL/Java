public class Main {
    public static void main(String[] args) {
        int array [] = {5,-1,42,4,154,2};
        int variable;
        for (int i = 0; i <array.length/2 ; i++) {
            variable = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = variable;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
