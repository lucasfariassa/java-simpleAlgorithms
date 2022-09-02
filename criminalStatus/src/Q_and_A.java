import java.util.Scanner;

public class Q_and_A {
    public void questions() {
        String q1, q2, q3, q4, q5;
        int count = 0;
        System.out.println("##### SISTEMA DE DETECÇÃO DE SUSPEITO - SUSPECT DETECTION SYSTEM #####");
        System.out.println();

        q1 = "Telefonou para a vítima? (S) ou (N) - Did you call the victim? (Y) or (N) -> ";
        System.out.print(q1);
        count += countAnswer(getAnswer());

        q2 = "Esteve no local do crime? (S) ou (N) - Were you at the crime scene? (Y) or (N) -> ";
        System.out.print(q2);
        count += countAnswer(getAnswer());

        q3 = "Mora perto da vítima? (S) ou (N) - Do you live near the victim? (Y) or (N) -> ";
        System.out.print(q3);
        count += countAnswer(getAnswer());

        q4 = "Devia para a vítima? (S) ou (N) - Did it owe the victim? (Y) or (N) -> ";
        System.out.print(q4);
        count += countAnswer(getAnswer());

        q5 = "Já trabalhou com a vítima? (S) ou (N) - Have you ever worked with the victim? (Y) or (N) -> ";
        System.out.print(q5);
        count += countAnswer(getAnswer());

        conclusion(count);
    }

    public String getAnswer() {
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        return answer;
    }

    public int countAnswer(String answer) {
        if(answer.equals("Y") || answer.equals("y") || answer.equals("S") || answer.equals("s")) {
            return 1;
        } else {
            return 0;
        }
    }

    public void conclusion(int count) {
        System.out.println();
        if (count == 2) {
            System.out.println("STATUS: Suspeito(a) - Suspicious");
        } else if (count == 3 || count == 4) {
            System.out.println("STATUS: Cúmplice - Accomplice");
        } else if (count == 5) {
            System.out.println("STATUS: Assassino(a) - Murderer");
        } else {
            System.out.println("STATUS: Inocente - Innocent");
        }
    }
}
