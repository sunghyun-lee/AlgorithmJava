package ctci;

import java.util.HashMap;

public class problem1_1 {
    private final HashMap<Character, Boolean> memo = new HashMap<>();

    public boolean solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (memo.containsKey(s.charAt(i))) {
                return true;
            }
            else {
                memo.put(s.charAt(i), true);
            }
        }

        return false;
    }

    public boolean solution_without_ds(String s) {
        for (int i = 0; i < s.length(); i++) {
            char pivot = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == pivot) return true;
            }
        }
        return false;
    }
}
