class demo{
    public static void main(String[] args) {
        int[] nums = {2,2,2,1, 2, 3};
        int maj = majorityElement(nums);
        System.out.print(maj);

    }
    public static int majorityElement(int [] nums){
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(count == 0){
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate){
                count++;
            } else {
                count --;
            }
            
        }
    return candidate;
    }    
    
}