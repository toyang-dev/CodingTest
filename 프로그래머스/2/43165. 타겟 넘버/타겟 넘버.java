class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        int index = 0;
        int sum = 0;

        dfs(0, 0, numbers, target);
    
        return answer;
    }
    
    public void dfs(int index, int sum, int[] numbers, int target){
        if (sum == target && index == numbers.length) {
            answer++;
            return;
        }
        if (index == numbers.length) {
            return;
        }
        dfs(index + 1, sum + numbers[index], numbers, target);
        dfs(index + 1, sum - numbers[index], numbers, target);
    }
}