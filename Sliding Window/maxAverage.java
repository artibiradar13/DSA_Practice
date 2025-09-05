public class maxAverage {
        public static double findMaxAverage(int[] nums, int k) {

        double average =0;
        

        for(int i =0;i<k;i++){
            average+=nums[i];
        }

        double maxAvg = average;

        for(int i =k;i<nums.length;i++){

            average=average-nums[i-k]+nums[i];
            if(average>maxAvg){
                maxAvg=average;
            }
        }
        
        return maxAvg/k;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int k =4;
        System.out.println(findMaxAverage(arr,k));
    }
}
