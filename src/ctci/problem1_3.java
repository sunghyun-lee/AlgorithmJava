package ctci;

public class problem1_3 {
    public String solution(String s) {
        char[] convertedS = s.toCharArray();
        StringBuilder retVal = new StringBuilder();

        for (char c: convertedS) {
            if (c == ' ') {
                retVal.append("%20");
            }
            else {
                retVal.append(c);
            }
        }

        return retVal.toString();
    }
}
