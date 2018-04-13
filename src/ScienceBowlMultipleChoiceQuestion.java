public class ScienceBowlMultipleChoiceQuestion extends ChoiceQuestion {
    private String[] scienceBowlAnswerLabels = {"W", "X", "Y", "Z"};

    public ScienceBowlMultipleChoiceQuestion(String questionText){
        super(questionText);
        for (int i=0; i<scienceBowlAnswerLabels.length; i++){
            addAnswerLabel(scienceBowlAnswerLabels[i]);
        }
    }

}
