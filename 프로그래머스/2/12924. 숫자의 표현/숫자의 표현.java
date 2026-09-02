class Solution {
    public int solution(int n) {

        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = i;
        }

        int end = n/2;
        int answer = 0;// 최종 개수

        for (int start = 1; start <= end; start++) {
            int sum = 0;
            for (int i = start; i <= n; i++) {
                sum += nums[i];
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer + 1;
    }
}