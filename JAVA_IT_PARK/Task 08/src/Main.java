public class Main {
    public static void main(String[] args) {
        int array[] = {5, -4,23,1,541,74,433,53};
        int min;
        int variable;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[i] < array[j]){
                    variable = array[i];
                    array[i] = array[j];
                    array[j] = variable;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
