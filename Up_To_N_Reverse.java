import java.util.*;
public class Up_To_N_Reverse {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number for printing");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        f(n);
    }
    public static void f(int n){
        if(n==0)
        return;
        System.out.print(n+",");
        f(n-1);
    }
}
