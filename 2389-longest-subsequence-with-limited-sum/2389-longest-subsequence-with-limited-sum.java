class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n =  nums.length, m = queries.length;
        int[] answer = new int[m];
        
        for(int i = 1; i < n; i++)
            nums[i] += nums[i-1];
        
//         finding insertion index to the prefix sum array
        for(int i = 0; i < m; i++){
            int index = BS(nums, queries[i]);
            answer[i] = index;
            }
            return answer;
        }
    
    int BS(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid + 1;
            if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return nums[left] > target ? left : left+1;
    }
}
