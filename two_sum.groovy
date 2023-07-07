class TwoSum{
    static void main(String[] args){
        int[] nums = [2,7,11,15];
        int target = 22;

        println twoSum(nums,target);
    }

    static int[] twoSum(int[] nums,int target) {
        //brute force solution O(n^2)
        //  for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target) return new int[]{i,j};
        //     }
        //  }

        def map = [:]
        for(def i=0;i<nums.size();i++){
            if(map.containsKey(nums[i])) return new int[]{map[nums[i]],i};
            map[target-nums[i]]=i;
        }
    }
}