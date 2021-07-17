public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        // Checks every index position in a string if it is a vowel and raises 'answer' by one accordingly then returns 'answer'
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
        int answer = 0;
        //your code here
        /* Checks every index position in a string if the value and the next two values spell out 'bob'
        Raises 'answer' by one if it does then returns 'answer' */
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith("bob", i)){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        // Returns the longest substring of a string in which letters occur in alphabetical order
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            /* Creates a string that starts at 'i' and ends in the same place as the original string.
            The string gets smaller by one every loop by removing the front letter.
            Creates a placeholder string that will be used later. */
            String substring = s.substring(i),
                    newString = "";
            char last = 0;
            for (int j = 0; j < substring.length(); j++) {
                /* If the letter in the index position is equal or occurs later in the alphabet over the previous,
                the program amends it to the placeholder string */
                char c = substring.charAt(j);
                if (last <= c) {
                    newString = newString.concat(Character.toString(c));
                    last = c;
                } else {
                    // Breaks out of the nested loop if the character occurs earlier in the alphabet over the previous
                    break;
                }
            }
            /* In the first run, 'answer' is assigned the value of the placeholder string and the program loops back.
            In the next runs, if the new placeholder value is longer than the previous, 'answer' is assigned the new string. */
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
        s = "bobibobafghjlpbob";
        System.out.println(problemOne(s) + "\n" + problemTwo(s) + "\n" + problemThree(s));
    }
}
