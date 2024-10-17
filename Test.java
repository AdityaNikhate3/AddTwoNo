import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no");
		int a = sc.nextInt(), b = sc.nextInt();

		System.out.println("Sum is: "+(a+b));
		sc.close();
	}
}
