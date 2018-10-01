import java.util.Scanner;
public class fibbo
{
	public static int fibbonaci(int n)
	{
		if(n == 0 || n == 1) return n;
		return fibbonaci(n - 1) + fibbonaci(n - 2); 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int f = fibbonaci(n);
		System.out.println(n+"th number in series is "+f);
	}
}