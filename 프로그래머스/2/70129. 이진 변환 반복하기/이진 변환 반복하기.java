import java.util.ArrayList;
import java.util.List;
class Solution {
 public int[] solution(String s) {
        char[] charArray = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int temp;
        int answerA = 0;
        int answerB = 0;
        int listSize = 0;

        //초기 회차 및 0 제거 횟수
        for (char c : charArray) {
            temp = Integer.parseInt(String.valueOf(c));
            if (temp == 1) {
                list.add(temp);
            }
            else {
                answerB++;// 0이니 제거 횟수 카운트
            }
        }
        answerA++;

        while (list.size() > 1) {
            listSize = list.size();// 0 제거 후 길이
            String binaryString = Integer.toBinaryString(listSize);
            list = new ArrayList<>();
            for (char c : binaryString.toCharArray()) {
                temp = Integer.parseInt(String.valueOf(c));
                if (temp == 1) {
                    list.add(temp);
                }
                else {
                    answerB++;// 0이니 제거 횟수 카운트
                }
            }
            answerA++;
        }
        return new int[]{answerA, answerB};
    }
}