import java.util.*;

public class YourClassNameHere {
    public static void main(String[] args) {
      int[] arr={2,8,5,3,9,4};
      int n=arr.length;
      
      for(int i=1;i<n;i++){
        int j=i;
        while(arr[j]<arr[j-1])
           {
             int temp=arr[j];
             arr[j]=arr[j-1];
             arr[j-1]=temp;
             j-=1;
           }
      }
      System.out.println(Arrays.toString(arr));
    }
}

OUTPUT:
[2, 3, 4, 5, 8, 9]
