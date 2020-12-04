public class Main {
    public static void main(String[] args) {
        int array [] = {5,-1,42,4,154,2};

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(min>array[i]){
                min = array[i];
            }
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент в массиве = " + min);
        System.out.println("Максимальный элемент в массиве = " + max);

    }
}
