package Reccursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rev(nums,0,nums.length-1);
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }

    }

    public static void rev(int[] nums,int low,int high) {
        if(low>=high) {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            return;
        }
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
//        for(int x : nums)
//            System.out.print(x+" ");
//        System.out.println();
//        System.out.println(nums[low]);
        rev(nums,low+1,high-1);
//        System.out.println(nums[high]);



    }
}
