package SearchingDSA;

import java.awt.*;
import java.util.*;
public class BinarySearch
{
    // only in sorted array

    public static void main(String[] args) {

        int[] arr = {22,43,56,78,81,92};
        int target = 81;
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }



    }
}
