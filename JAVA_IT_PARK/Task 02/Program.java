class Program {
    public static void main(String[] args) {
     int number = 0;
     int binaryNumberOne = number % 2;
     number = number/2;
     int binaryNumberTwo = number % 2;
        number = number/2;
        int binaryNumberThree = number % 2;
        number = number/2;
        int binaryNumberFour = number % 2;
        number = number/2;
        int binaryNumberFive = number % 2;
        number = number/2;
        int binaryNumberSix = number % 2;
        number = number/2;
        int binaryNumberSeven = number % 2;
        number = number/2;
        System.out.print(binaryNumberSeven);
        System.out.print(binaryNumberSix);
        System.out.print(binaryNumberFive);
        System.out.print(binaryNumberFour);
        System.out.print(binaryNumberThree);
        System.out.print(binaryNumberTwo);
        System.out.print(binaryNumberOne);

    }
}