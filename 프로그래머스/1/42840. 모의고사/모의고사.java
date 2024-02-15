import java.util.*;

class Solution {
public int[] solution(int[] answers) {
        int[] student = new int[3];
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (student1[i % student1.length] == answers[i]) {
                student[0]++;
            }
            if (student2[i % student2.length] == answers[i]) {
                student[1]++;
            }

            if (student3[i % student3.length] == answers[i]) {
                student[2]++;
            }
        }

        int max = Arrays.stream(student).max().getAsInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < student.length; i++) {
            if (max == student[i]) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}