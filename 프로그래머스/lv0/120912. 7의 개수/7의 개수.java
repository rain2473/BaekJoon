class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array){
            sb.append(String.valueOf(i));
        }
        return sb.toString().length() - sb.toString().replaceAll("7","").length();
    }
}