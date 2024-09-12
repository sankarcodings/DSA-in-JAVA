package SortingDSA;

public class InsertionSort
{
    public static void main(String[] args) {

        int[] arr = {54,23,20,18,14,66,2};
        if(arr.length==1)
        {
            System.out.println(arr[0]);
            return;
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
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
