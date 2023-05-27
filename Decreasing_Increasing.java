import java.util.*;
import java.io.*;
public class Main
{
	 public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printIncreasing(n);
    }
    public static void printDecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);

    }
}
