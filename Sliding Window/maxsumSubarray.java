



public class maxsumSubarray{
    public static int sum(int [] arr,int k){
        int maxsum=Integer.MIN_VALUE;
        int wsum=0;
        for(int i=0;i<k;i++){
            wsum+=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            wsum=wsum-arr[i-k]+arr[i];
            if(wsum>maxsum){
                maxsum=wsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] arr={2,9,31,-4,21,7};
        int k=3;
        System.err.println("MaxSum of subarray:"+sum(arr, k));
    }
}
