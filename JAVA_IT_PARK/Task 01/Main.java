/*
a = 5000
b = 2000
c = 1000
d = 500
e = 100
f = 50
g = мелочь
*/
class Main{
	public static void main(String[] args) {
		int sum = 15867;
		int a = sum/5000;
		sum = sum % 5000;
		int b = sum/2000;
		sum = sum % 2000;
		int c = sum/1000;
		sum = sum % 1000;
		int d = sum / 500;
		sum = sum % 500;
		int e = sum / 100;
		sum = sum % 100;
		int f = sum / 50;
		sum = sum % 50;
		int g = sum;
		System.out.println("5000 - " + a);
		System.out.println("2000 - " + b);
		System.out.println("1000 - " + c);
		System.out.println("500 - " + d);
		System.out.println("100 - " + e);
		System.out.println("50 - " + f);
		System.out.println("Small change - " + g);

	}
}