package mapler.model.Entities;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizScore {
    @Getter
    private int score;
    @Getter
    private int questionsQuantity;
    @Setter @Getter
    private int mistakes;
    @Setter @Getter
    private double percentScore;
    @Getter
    private List<Quiz> wrongAnswers;

    public void increaseScore(){
        this.score += 1;
    }

    public void add(Quiz wrongAnswer){
        this.wrongAnswers.add(wrongAnswer);
    }

    public void resolveQuizScore(){
        mistakes = questionsQuantity - score;
        percentScore = ((double) score / (double) questionsQuantity) * 100;
    }
}
