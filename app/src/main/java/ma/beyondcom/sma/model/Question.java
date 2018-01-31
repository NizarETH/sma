package ma.beyondcom.sma.model;

import java.util.List;

/**
 * Created by pc hp on 13/09/2017.
 */

public class Question {

    private Long id;
    private String question;
    private List<Choix> mchoix;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Choix> getMchoix() {
        return mchoix;
    }

    public Question() {
    }

    public Question(long id, List<Choix> mchoix, String question) {
        this.id = id;
        this.mchoix = mchoix;
        this.question = question;
    }

    public void setMchoix(List<Choix> mchoix) {
        this.mchoix = mchoix;
    }


}
