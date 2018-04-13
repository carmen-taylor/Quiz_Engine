public class Question {
    private String text;
    private String answer;

    public Question(String questionText){
        text = questionText;
    }

    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }

    public String isCorrect(String response){
        if (response.equalsIgnoreCase(answer)) return "Correct";
        return "Incorrect";
    }

    public void display(){
        System.out.println(text + "\n");
    }
}
