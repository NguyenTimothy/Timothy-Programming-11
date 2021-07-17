public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') ||
                    (s.charAt(i) == 'u') || (s.charAt(i) == 'o')) {
                answer++;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int  answer = 0;
        //your code here
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith("bob", i)){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i),
                    newString = "";
            char last = 0;
            for (int j = 0; j < substring.length(); j++) {
                char c = substring.charAt(j);
                if (last <= c) {
                    newString = newString.concat(Character.toString(c));
                    last = c;
                } else {
                    break;
                }
            }
            if (newString.length() > answer.length()) {
                answer = newString;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
