import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f(arr,0);
    }
    public static void f(int arr[],int idx){
        if(idx==arr.length)
           return;
        f(arr,idx+1);
        System.out.print(arr[idx]+",");
    }
} 
