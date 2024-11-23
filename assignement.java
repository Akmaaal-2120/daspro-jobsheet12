import java.util.Scanner;

public class assignement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respondent = 2;  
        int quest = 6;       
        double total = 0;       
        double sum = 0;        

        int[][] survey = new int[respondent][quest];

     
        for (int i = 0; i < respondent; i++) {
            System.out.println("Respondent " + (i + 1) + ": ");
            for (int k = 0; k < quest; k++) {
                System.out.println("Question " + (k + 1) + ": (1 to 5)");
                survey[i][k] = sc.nextInt();
            }
        }

    
        System.out.println("Survey Results:");
        for (int i = 0; i < respondent; i++) {
            System.out.println("Respondent " + (i + 1) + ": ");
            for (int k = 0; k < quest; k++) {
                System.out.println("Question " + (k + 1) + " : " + survey[i][k]);
            }
            System.out.println();
        }


        System.out.println("Average for each respondent:");
        for (int i = 0; i < respondent; i++) {
            sum = 0; 
            for (int k = 0; k < quest; k++) {
                sum += survey[i][k];
            }
            double average =  sum / quest;
            System.out.println("Respondent " + (i + 1) + ": " + average);
        }


        System.out.println("Average for each question:");
        for (int k = 0; k < quest; k++) {
            sum = 0;  // Reset sum for each question
            for (int i = 0; i < respondent; i++) {
                sum += survey[i][k];
            }
            double average =  sum / respondent;
            System.out.println("Question " + (k + 1) + ": " + average);
        }

        System.out.println("Overall average:");
        for (int i = 0; i < respondent; i++) {
            for (int k = 0; k < quest; k++) {
                total += survey[i][k];
            }
        }
        double overallAverage = total / (respondent * quest);
        System.out.println("Overall average value: " + overallAverage);

    }
}
