import java.util.*;

public class YourClassNameHere {
    public static void main(String[] args) {
  int[] arr={5,4,3,2,1};
  int n=arr.length;
  int min=0;
  for(int i=0;i<n;i++){
    min=i;
    
    for(int j=i+1;j<n;j++){
      if(arr[j]<arr[min])
         min=j;
    }
    if(min!=i){
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
      }
  } 
  System.out.println(Arrays.toString(arr));
}
}

OUTPUT:
{1,2,3,4,5}
