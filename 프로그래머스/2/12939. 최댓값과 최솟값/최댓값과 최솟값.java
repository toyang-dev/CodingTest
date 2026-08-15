class Solution {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        Integer[] nums = new Integer[s1.length];
        StringBuilder answer = new StringBuilder();
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        
        
        for(int i=0; i<s1.length; i++) {
            nums[i] = Integer.parseInt(s1[i]);
        }

        for (int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        
        answer.append(min).append(" ").append(max);
        
        return answer.toString();
    }
}