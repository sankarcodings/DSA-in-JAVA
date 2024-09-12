package SortingDSA;

public class BubbleSort
{
    public static void main(String[] args) {

        int[] arr = {45,78,101,54,88,67,90,11};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");
        for(int mm:arr)
        {
            System.out.print(mm+" ");
        }
    }
}
