package 입문;

import java.util.Scanner;

class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        System.out.println(solution.Solution());
    }
    public String Solution()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어 점수");
        int korean = scanner.nextInt();
        System.out.println("수학 점수");
        int math = scanner.nextInt();
        System.out.println("영어 점수");
        int english = scanner.nextInt();
        String answer = String.format(
            "**************************************************\n"+
            "국어 : %d 영어 : %d 수학 : %d\n"+
            "**************************************************"
        , korean, english, math54
        );

        return answer;
    }
}
