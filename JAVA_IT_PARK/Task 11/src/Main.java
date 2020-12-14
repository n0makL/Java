public class Main {

    public static int binarySearch(int array[], int requiredNumber){
        int left = 0;
        int right = array.length -1;
        int middle = left +(right - left)/2;
        for (int i = 0; i <array.length ; i++) {
            if(array[middle] == requiredNumber){
                return middle;
            }
            if (array[middle] < requiredNumber){
                left = middle;
                middle = left +(right - left)/2;
            }
            if(array[middle] > requiredNumber){
                right = middle;
                middle = left +(right - left)/2;
            }
            System.out.println("Итерация № " + i);
        }
        return -1;
    }
    public static void main(String[] args) {
    int [] array = {10, 15, 45, 58, 59, 63, 89, 90, 95, 101, 115, 135, 140 };
        System.out.println(binarySearch(array,115));
    }
}
