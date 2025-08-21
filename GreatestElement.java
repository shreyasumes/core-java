class GreatestElement{
	public static void main(String[] args){
		int[] nums = {10,85,25,15,5};
		int gNum = nums[0];
		for(int i=1; i<nums.length; i++){
			if(nums[i]>gNum){
			   gNum = nums[i];
			}
		}
		System.out.println(gNum);
	}
}