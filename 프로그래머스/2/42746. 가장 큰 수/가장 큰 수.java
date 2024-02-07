import java.util.*;

class Solution {
    public String solution(int[] numbers) {
            String answer = "";
            // 1-1단계: 정수를 문자로 바꾸어 더하기
            // 1-2단계: 다시 정수로 바꾼뒤 배열에 추가
            // 2단계: 정렬
            // 3단계: 출력

            int[] arr = new int[numbers.length];
            String[] arrStr = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arrStr[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(arrStr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

            for (String s : arrStr) {
                answer += s;
                if (answer.equals("00")) {
                    answer = "0";
                    break;
                }
            }

            return answer;
        }
}