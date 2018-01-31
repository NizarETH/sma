package ma.beyondcom.sma.model;

/**
 * Created by pc hp on 13/09/2017.
 */

public class Choix {


    private Long id;

    private String choixname;

    public Choix() {
    }

    public Choix(Long id, String choixname) {
        this.id = id;
        this.choixname = choixname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChoixname() {
        return choixname;
    }

    public void setChoixname(String choixname) {
        this.choixname = choixname;
    }
}
