

public class Brute_force{

    //brute force
    public static int sum(int[] arr,int k){
        int maxsum =Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length-3;i++){
            int currsumm =0 ;
            for(int j=i;j<i+k;j++){
            currsumm+=arr[j];
            }
            if(currsumm>=maxsum){
            maxsum=currsumm;
            }
            
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr={2,9,31,-4,21,7};
        int k=3;
        System.out.println(sum(arr, k));
    }
}
