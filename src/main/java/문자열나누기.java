public class 문자열나누기 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int index = 0;
        int answer = 0;

        while (index < s.length()) {
            //System.out.println("index: " + index);
            char c = s.charAt(index);
            int ncount = 1;
            int next = 0;
            for (int i = index+1; i<s.length(); i++) {
                char h = s.charAt(i);
                if (ncount == next) {
                    break;
                }
                if (c != h) {
                    next++;
                } else{
                    ncount++;
                }
                //System.out.println("next: "+next);
                //System.out.println("ncount: "+ncount);
            }
            index += ncount+next;
            answer++;
        }
        return answer;
    }
}
