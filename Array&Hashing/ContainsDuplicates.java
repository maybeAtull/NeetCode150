import java.util.Arrays;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for( int i =0; i<nums.length-1; i++){
            if(nums[i]== nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,-1};
        ContainsDuplicates obj = new ContainsDuplicates();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}
