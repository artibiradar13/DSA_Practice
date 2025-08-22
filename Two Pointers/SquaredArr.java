

public class SquaredArr{

    public static int [] squared(int[] arr){
        int left =0;
        int right=arr.length-1;
        int pos=arr.length-1;

        int[] result =new int[arr.length];
        while(left<right){
            int leftSq = arr[left] *arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return result;
    }
    

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int [] square =squared(arr);
        for(int i=0;i<square.length-1;i++){
        System.out.println(square[i]);
        }
    }
        
}