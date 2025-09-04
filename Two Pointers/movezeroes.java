public class movezeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0; // pointer for placing non-zero elements

        // Step 1: Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Step 2: Fill the rest with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
     public static void main(String[] args) {
        int[] arr ={0,2,0,4,5,6};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
