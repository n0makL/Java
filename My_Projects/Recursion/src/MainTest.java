public class MainTest {
    public static int sum(int number){
        System.out.println("Заходим в метод с цифрой " + number);
        if (number == 1){
            return 1;
        }
        int result = sum(number - 1)+ number;
        System.out.println("Выходим из метода с цифрой " + result );
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

}
