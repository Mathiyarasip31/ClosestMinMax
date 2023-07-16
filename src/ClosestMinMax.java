import java.util.Scanner;

public class ClosestMinMax {
    public static void findminmax(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int latest_min=-1;
        int latest_max=-1;
        int result=arr.length;
        for (int i=0;i<n;i++)
        {
            if(arr[i]==min)
            {
                latest_min=i;
                if(latest_max>=0)
                {
                    result=Math.min(result,i-latest_max+1);
                }
            }
            if(arr[i]==max)
            {
                latest_max=i;
                if(latest_min>=0)
                {
                    result=Math.min(result,i-latest_min+1);
                }
            }
        }
        System.out.println("RESULT: "+result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        findminmax(arr,n);
    }
}