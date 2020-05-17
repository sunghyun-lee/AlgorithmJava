package ctci;


public class Main {
    public static void main(String[] args) {
        problem1_1 prob1_1 = new problem1_1();
        problem1_2 prob1_2 = new problem1_2();
        problem1_3 prob1_3 = new problem1_3();

        // 1.1
        System.out.println(prob1_1.solution("ab"));
        System.out.println(prob1_1.solution_without_ds("aa"));

        // 1.2
        System.out.println(prob1_2.solution("asdfzxcv", "vcxzasfd"));

        // 1.3
        System.out.println(prob1_3.solution("I'm new to this Java world!"));
    }
}
