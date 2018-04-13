import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;
    private ArrayList<String> answerLabels;

    public ChoiceQuestion(String questionText){
        super(questionText);
        choices = new ArrayList<String>();
        answerLabels = new ArrayList<String>();
    }

    public void addAnswerLabel(String answerLabel){
        answerLabels.add(answerLabel);
    }

    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        String label;
        if (choices.size() > answerLabels.size()){
            label = "" + choices.size();
            answerLabels.add(label);
        } else {
            label = answerLabels.get(choices.size()-1);
        }

        if (correct){
            setAnswer(label);
        }
    }

    public void display(){
        super.display();
        for (int i=0; i< choices.size(); i++){
            System.out.println(answerLabels.get(i) + ": " + choices.get(i));
        }
        System.out.println();
    }
}
