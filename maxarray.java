import java.util.*;
public class maxarray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int ans=f(a,n,0);
        System.out.print("Max element of array="+ans);
       
    }
    public static int f(int a[],int n,int i){
        if(i==n-1)
        return a[i];
        int max=f(a,n,i+1);
        max=Math.max(a[i],max);
        return max;
    }
}