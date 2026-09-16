public class Sorting {

    public void AscendingSort(int[] nums){
        for(int i = 0; i<nums.length ;i++){
            for (int j = 0; j < nums.length-1-i; j++) {
                 if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
           
        }
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }
    }
    public static void main(String[] args) {
        int[] nums = {8,-5,1,4,2,6};
        Sorting ob = new Sorting();
        ob.AscendingSort(nums);
    }    
}
