import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        while (priorityQueue.peek() < K) {
            if (priorityQueue.size() == 1) {
                return -1;
            }
            priorityQueue.add(priorityQueue.poll() + priorityQueue.poll() * 2);
            answer++;
        }
        return answer;
    }
}