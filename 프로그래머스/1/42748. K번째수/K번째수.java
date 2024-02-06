import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        // 1단계: 2차원 배열을 1차원 배열로 쪼개기
        // 2-1단계: 정해진 규칙대로 하여 값 도출
        // 2-2단계: answer 배열에 삽입
        // 3단계: 출력
        int[] arr = new int[3];
        for (int i = 0; i < commands.length; i++) {

            for (int j = 0; j < 3; j++) {
                arr[j] = commands[i][j];
            }

            for (int k = arr[0]; k < arr[1] + 1; k++) {
                list.add(array[k-1]);
            }
            Collections.sort(list);

            tmp.add(list.get(arr[2]-1));
            list.clear();
        }

        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}