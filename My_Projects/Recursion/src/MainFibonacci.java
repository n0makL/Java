public class MainFibonacci {

    private static int array[] = new int[11];
    public static int fib(int number){
        System.out.println("Вошли в метод с числом - " + number);
        if(number == 0){
            return 0;
        }
        else if (number == 1){
            return 1;
        }
        if(array[number] != 0){
            return array[number];
        }
        int result = fib(number-1)+fib(number-2);
        array[number ]= result;
        //System.out.println(array[number]);
        System.out.println("Выходим из метода с числом " + result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
