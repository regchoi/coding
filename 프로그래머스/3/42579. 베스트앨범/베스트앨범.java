import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> hashMapPlays = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
            hashMapPlays.put(i, plays[i]);
        }

        List<String> sortedGenres = new ArrayList<>(hashMap.keySet());
        Collections.sort(sortedGenres, ((o1, o2) -> (hashMap.get(o2).compareTo(hashMap.get(o1)))));

        List<Integer> sortedPlays = new ArrayList<>(hashMapPlays.keySet());
        Collections.sort(sortedPlays, ((o1, o2) -> (hashMapPlays.get(o2).compareTo(hashMapPlays.get(o1)))));

        List<Integer> answerList = new ArrayList<>();
        
        for (String s : sortedGenres) {
            int count = 0;
            for (Integer integer : sortedPlays) {
                if (genres[integer].equals(s) && count < 2) {
                    answerList.add(integer);
                    count++;
                }
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}