package SortingDSA;

public class SelectionSort
{
    public static void main(String[] args) {

        int[] arr = {23,54,107,303,14,66,2};

        for(int i=0;i<arr.length;i++)
        {
            int index = 0;
            int min = Integer.MAX_VALUE;
            int j = i;
            for(;j< arr.length;j++)
            {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index] ;
            arr[index] = temp;

        }

        System.out.print("Sorted Array : ");
        for(int mm:arr)
        {
            System.out.print(mm+" ");
        }
    }
}
