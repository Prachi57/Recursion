import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int n=sc.nextInt();
	    int xn=Power(x,n);
	    System.out.println(xn);
	}
	public static int Power(int x,int n){
	    if(n==0){
	        return 1;
	    }
	    int xf=Power(x,n-1);
	    int xm=x*xf;
	    return xm;
	}
}
