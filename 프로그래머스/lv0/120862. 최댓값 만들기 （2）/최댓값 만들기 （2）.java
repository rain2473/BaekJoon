import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        if (numbers[0] * numbers[1] > answer){
            answer = numbers[0] * numbers[1];
        }
        return answer;
    }
}