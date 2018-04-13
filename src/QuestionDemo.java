import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args){
        Question[] quiz = new Question[1];

        File inputFile = new File("test_questions.txt");
        System.out.println(inputFile.getAbsolutePath());
        Scanner in = null;
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.startsWith("weight")){
                // do nothing
            } else{
                String[] questionParts = line.split("\\t");
                String questionText = questionParts[1].toUpperCase() + "  Multiple Choice  " + questionParts[2];
                ScienceBowlMultipleChoiceQuestion question = new ScienceBowlMultipleChoiceQuestion(questionText);
                question.addChoice(questionParts[3],questionParts[7].equalsIgnoreCase("W"));
                question.addChoice(questionParts[4],questionParts[7].equalsIgnoreCase("X"));
                question.addChoice(questionParts[5],questionParts[7].equalsIgnoreCase("Y"));
                question.addChoice(questionParts[6],questionParts[7].equalsIgnoreCase("Z"));
                quiz[i] = question;
                i++;
            }
        }
        in.close();

        in = new Scanner(System.in);
        for (Question q : quiz){
            q.display();
            System.out.print("Your answer: ");
            String response = in.nextLine();
            System.out.println(q.isCorrect(response) + "\n");
        }

       in.close();
    }
}
