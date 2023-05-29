import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int f=factorial(n);
	    System.out.println(f);
	}
	public static int factorial(int n){
	    if(n==1){
	        return 1;
	    }
	    int xf=factorial(n-1);
	    int x=n*xf;
	    return x;
	}
}
