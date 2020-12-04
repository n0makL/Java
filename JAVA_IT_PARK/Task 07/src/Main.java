public class Main {
    public static void main(String[] args) {
        int array[] = {5, 423,143,3,23,1,65,32,23};
        int count = 0;

        for (int i = 1; i < array.length-1 ; i++) {
            if(array[i]>array[i-1] & array[i]>array[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
