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

    //keep two elements---
    public static int keeptwice(int[] arr){
        int slow=2;
        if(arr.length==0) return 0;
        for(int fast=2;fast<arr.length;fast++){
            //compare two position behind
            if(arr[fast]!=arr[slow-2]){
                arr[slow]=arr[fast];
                slow++;
            }
        }return slow;//new length
    }

    //keep unique elements---
    public static int Unique(int[] arr){
        int slow=0;   // position for unique elements
        int fast=0;   //current scanning index
        while(fast<arr.length){
            int count =0;
            int current =arr[fast];

            //count occurrences of nums[fast]
            while(fast<arr.length && arr[fast]==current){
                fast++;
                count++;
            }

            //if element occurred only once , keep it
            if(count==1){
                arr[slow] =current;
                slow++;
            }
        }
        return slow;
    }

    //remove element 
    public static int removeElement(int[] arr,int element){
        int slow=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=element){
                arr[slow]=arr[fast];
                slow++;
            }
        }return slow;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3,4,5,5,6};
        // int K=Remove(arr);
        // System.out.println(K);
        // for (int i = 0; i < K; i++) {
        //     System.out.print(arr[i]);
        // }
        //return each element appear at mst twice in final arr
        // int[] arr2={0,1,1,1,1,2,2,2,3,3,4};
        // int L=keeptwice(arr2);
        // System.out.println(L);
        // for (int i = 0; i < L; i++) {
        //     System.out.print(arr2[i]);
        // }

        //keep unique elements----
        int U=Unique(arr);
        System.out.println(U);
        for (int i = 0; i < U; i++) {
            System.out.print(arr[i]);
        }

        //remove specific element
        int element =2;
        System.out.println(removeElement(arr, element));

        
        
    }


}