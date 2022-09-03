import java.util.Scanner;

public class Converter {
private void answerRtoI(String roman, int number) {
        System.out.println("(PT-BR) Convertido! -> " + roman + "em número é: " + number + "\n(ENG) Converted! -> " +
                "" + roman + "in number is: " + number);
    }

    public void RomanToInteger() {
        int number = 0, I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o(s) algorismo(s) romano(s) que deseja transformar em números - Enter the roman " +
                "algorithm(s) you want to convert to numbers: ");
        System.out.print("-> ");
        String roman = scanner.nextLine();
        int length = roman.length();
        roman = roman + " ";

        for (int i = 0; i < length; i++) {
            char rNumber = roman.charAt(i);
            char nextRNumber = roman.charAt(i + 1);

            if (rNumber == 'M') {
                number += M;
            } else if (rNumber == 'C') {
                if (nextRNumber == 'M') {
                    number += M - C;
                    i++;
                } else if (nextRNumber == 'D') {
                    number += D - C;
                    i++;
                } else {
                    number += C;
                }
            } else if (rNumber == 'D') {
                number += D;
            } else if (rNumber == 'X') {
                if (nextRNumber == 'C') {
                    number += C - X;
                    i++;
                } else if (nextRNumber == 'L') {
                    number += L - X;
                } else {
                    number += X;
                }
            } else if (rNumber == 'L') {
                number += L;
            } else if (rNumber == 'I') {
                if (nextRNumber == 'X') {
                    number += X - I;
                    i++;
                } else if (nextRNumber == 'V') {
                    number += V - I;
                    i++;
                } else {
                    number += I;
                }
            } else if (rNumber == 'V') {
                number += V;
            } else {
                System.out.println("Não foi possível converter! - Could not convert!");
            }
        }
        answerRtoI(roman, number);

    }
}
