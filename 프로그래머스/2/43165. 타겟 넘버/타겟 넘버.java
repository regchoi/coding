class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {    
        dfs(0, numbers, target, 0);
        return answer;
    }
    
    private static void dfs(int check, int[] numbers, int target, int sum) {
        if (check == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        dfs(check + 1, numbers, target, sum + numbers[check]);
        dfs(check + 1, numbers, target, sum - numbers[check]);
    }
}