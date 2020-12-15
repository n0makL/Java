public class MainFactorial {
    public static int fact(int n){
        System.out.println("Заходим в метод с аргументом - " + n);
        if(n == 1){
            return 1;
        }
        int  result = fact(n-1)*n;
        System.out.println("Выходим из метода с результатом - " + result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
