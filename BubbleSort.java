import java.util.Scanner;
public class BubbleSort {
    public static void PrintArray(int arr[]){
        for (int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        
             int arr[] = {1,4,9,3,2};
            for(int i=0;i<arr.length-1;i++)
            {
                for (int j=0;j<arr.length-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
                }
            }
            PrintArray(arr);
        }
    }