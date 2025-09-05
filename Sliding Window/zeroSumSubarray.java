
import java.util.HashMap;


//no. of subarrays whose sum is Zero---------
public class zeroSumSubarray {

    //fixed size window----
    public static int zeroSum(int[] arr,int k){
    int count=0;
    int sum =0;
    for(int i=0;i<k;i++){
        sum+=arr[i];
    }
    if(sum==0){
        count++;
    }
    for(int i=k;i<arr.length;i++){
        sum=sum-arr[i-k]+arr[i];
        if(sum==0){
            count++;
        }
    }
    return count;
    }


    //dynamic size window---
    public static int ZeroSubaarysum(int []arr){
        HashMap<Integer,Integer> map =new HashMap<>();
        int count =0;
        int sum =0;

        map.put(0, 1);
        for(int num:arr){
            sum+=num;//calculating prefix sum ;
            if(map.containsKey(sum)){//checking if the prefix sum exits 
            count+=map.get(sum); //yes-increase count 
            }

            map.put(sum,map.getOrDefault(sum,0)+1);//new value or exting value add /increase;
        }



        return count;
    }



    public static void main(String[] args) {
        int [] arr={6,-1,-3,4,-2,2,4,6,-12,-2};
        int k=3;
        System.out.println(zeroSum(arr, k));
        System.out.println(ZeroSubaarysum(arr));
    }
}
