import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 오름차순 최소 힙

        for (int i = 0; i < score.length; i++) {
            minHeap.offer(score[i]);

            // 힙의 크기가 k를 넘으면 가장 작은 값을 제거
            if (minHeap.size() > k) {
                minHeap.poll();
            }

            // 현재 힙의 최소값
            answer[i] = minHeap.peek();
        }

        return answer;
    }
}