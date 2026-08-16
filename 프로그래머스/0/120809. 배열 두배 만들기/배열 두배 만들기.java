class Solution {
    public int[] solution(int[] numbers) {
        int numbersSize = numbers.length;
        
        int[] answer = new int[numbersSize];
        
        for(int i=0; i < numbersSize; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}