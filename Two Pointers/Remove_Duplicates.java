public class Remove_Duplicates{
    //given sorted array ,remove the duplicates 
    //in-place so that each element appears only once


    public static int Remove(int[]arr){
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
        int[] arr={1,2,3,4,4,5,5,5,6,6};
        System.out.println(Remove(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }


}