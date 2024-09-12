package SearchingDSA;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {2,9,4,1,8,5,7};
        int target = 8;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Index -> "+i);
            }
        }
    }
}
