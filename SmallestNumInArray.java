class SmallestNumInArray{
	public static void main(String[] args){
		int[] nums = {10,85,25,15,5};
		int sNum = nums[0];
		for(int i=1; i<nums.length; i++){
			if(nums[i]<sNum){
			   sNum = nums[i];
			}
		}
		System.out.println(sNum);
	}
}