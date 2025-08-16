
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static List<List<Integer>> Teen_sum(int[]arr,int Sum){

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<arr.length-3;i++){
            int left=i+1,right=arr.length-1;


            while(left<right){
                if(arr[i]+arr[left]+arr[right]==Sum){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;
                    left++;
                    right--;
                }else if(arr[i]+arr[left]+arr[right]<Sum){
                    left ++;
                }
                else{
                    right--;
                }
               

            }

        }
          return result;

    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Teen_sum(nums,0));
    
    }
}
