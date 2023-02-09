public class 가장가까운같은글자 {
    public static void main(String[] args) {
        String s = "banana";
        solution(s);
    }
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i=0; i<s.length(); i++) {
            int index = i;
            int num = i;
            boolean visited = false;

            while (num>0) {
                for (int j = index -1; j>=0; j--) {
                    //System.out.println("i : "+ i + " j :" + s.charAt(j));
                    if (s.charAt(index) == s.charAt(j) && visited == false) {
                        answer[index] = index - j;
                        visited = true;
                    }
                    //System.out.println(answer[index]);
                    num--;
                }
            }
            if (index == 0) {
                answer[0] = -1;
            }
        }

        for (int i=0; i<answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
