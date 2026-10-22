package Reccursion;

public class FIrstOccurence {
    public static void main(String[] args) {
        int[] nums ={1,2,7,7,5,6,7,8};
        System.out.println(occ(7,nums,0));

    }
    public static int occ(int x,int[] nums,int indx){


        if(nums[indx]==x) return indx;
        return occ(x,nums,indx+1);

    }
}
