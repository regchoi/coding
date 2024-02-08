import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
int[] arr = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] != 0) {
                arr[i] = ((100 - progresses[i]) / speeds[i]) + 1;
            } else if ((100 - progresses[i]) % speeds[i] == 0) {
                arr[i] = (100 - progresses[i]) / speeds[i];
            }
        }

        int tmp = arr[0];
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (tmp >= arr[i]) {
                count++;
            } else if (tmp < arr[i]) {
                list.add(count);
                tmp = arr[i];
                count = 1;
            }
            if (i == arr.length - 1) {
                list.add(count);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}