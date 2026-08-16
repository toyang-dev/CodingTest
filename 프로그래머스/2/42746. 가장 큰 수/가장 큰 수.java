import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        List<String> sortedNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .toList();

        //System.out.println(sortedNumbers);
        if(sortedNumbers.get(0).equals("0")){
            return "0";
        }
        String answer = String.join("", sortedNumbers);
        return answer;
    }
}
/**
문제풀이 방법
1.int 를 문자열로 바꿔서 접근
6 10 2 = 6102
6 2 10 = 6210
10 2 6 = 1026
10 6 2 = 1062
2 10 6 = 2106
2 6 10 = 2610
*/