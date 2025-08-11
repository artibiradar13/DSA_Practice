import java.util.ArrayList;
import java.util.List;

public class Target_Sum{
    /*sorted array of integers and target sum,return true 
    if there exists a pair whose sum equals the target, otheewise false....*/

    public static boolean IsPairSum(int [] arr,int target){
        //two pointers left and right----
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;

            }else if(sum>target){//bigger no. 
                right--;
            }else{
                left++;
            }
        }return false;

        //complexity=O(n),O(1)....
    }


    // return Indices--------
    public static int [] PairsSum(int []arr,int target){
        //two pointers left and right----
        int left=0;
        int right=arr.length-1;

        while(left < right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("indices are "+left +","+ right);
                return new int[]{left,right};
            }else if(sum>target){//bigger no. 
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,1};
    }
    
    //return PAir VAlues--
    public static int [] Pairs(int []arr,int target){
        //two pointers left and right----
        int left=0;
        int right=arr.length-1;

        while(left < right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("indices are "+left +","+ right);
                return new int[]{arr[left],arr[right]};
            }else if(sum>target){//bigger no. 
                right--;
            }else{
                left++;
            }
        }
        return new int[]{0};
    }

    //Count Number of Pairs----
    public static int countPAirs(int[] arr,int target){
        int left=0,right=arr.length-1;
        int count =0;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                left++;
                right--;
            }

        }return count;

    }


    //return all unique pairs---
    //complexity----o(n),O(k)-space k for number of pairs found 
    public static List<int []> allPairs(int[]arr,int target){
        List<int[]> result=new ArrayList<>();//list to store result pairs
         int left=0,right=arr.length-1;

         while(left<right){
            int sum =arr[left]+arr[right];

            if(sum==target){
                result.add(new int[]{arr[left],arr[right]});

                left++; 
                right--;


                //checking for duplicates----
                while(left<right&&arr[left]==arr[left-1])left++;//duplicatesfrom left
                while(left<right&&arr[right]==arr[right+1])right--;


            }else if(sum<target){
                left++;
            }else{
                right--;
            }

         }return result;
        
    }

    //closest PAir to target sum---
    public static int[] closestPair(int []arr,int target){
        int left=0,right=arr.length-1;
        int closestSum=Integer.MAX_VALUE;
        int []bestPair=new int[2];
        while(left<right){

            int Sum=arr[left]+arr[right];

            //if sum is closer to target---
            if(Math.abs(target-Sum)<Math.abs(target-closestSum)){
                closestSum=Sum;
                bestPair[0]=arr[left];
                bestPair[1]=arr[right];
            }
            if(Sum<target){
                left++;

            }else{
                right--;
            }

        }return bestPair;
    }

    


    public static void main(String[] args) {
        int [] arr={1,2,3,4,11, 15,16,};
        int target=5;

       // System.out.println(IsPairSum(arr, target));
       // System.out.println( PairsSum(arr, target));
       // System.out.println(Pairs(arr, target));
      //  System.out.println(countPAirs(arr, target));
        System.out.println(allPairs(arr, target));

    }

}