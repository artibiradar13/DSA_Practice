public class Remove_Duplicates{
    //given sorted array ,remove the duplicates 
    //in-place so that each element appears only once


    public static int Remove(int[]arr){
        //two pointers----slow,fast----
        int slow=0;
        if(arr.length==0) return 0;
        for(int fast=1;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
                
            }
        }return slow+1;

    }

    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3,4,5,5,6};
        int K=Remove(arr);
        System.out.println(K);
        for (int i = 0; i < K; i++) {
            System.out.print(arr[i]);
        }
        //return each element appear at mst twice in final arr
        int[] arr2={0,1,1,1,1,2,2,2,3,3,4};
        if()
        
    }


}