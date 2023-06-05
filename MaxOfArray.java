import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int max=maxOfArray(arr,0);
	    System.out.println(max);
	    
		
	}
	public static int maxOfArray(int[] arr,int idx)
	{
	    //if length is equal to the array length then there is no 
	    //new element to be compared hence itself is a maximum element
	    if(idx==arr.length-1){
	        return arr[idx];
	    }
	    int misa=maxOfArray(arr,idx+1);
	    if(misa>arr[idx])
	    {
	        return misa;
	    }
	    else
	    {
	        return arr[idx];
	    }
	}
	
}
