package ma.beyondcom.sma2018.m_Model;

/**
 * Created by pc hp on 17/04/2017.
 */

public class EposterModel {

    private String title;
    private String cout;
    private String pdf;

    public String getPdf() {
        return pdf;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCout() {
        return cout;
    }

    public void setCout(String cout) {
        this.cout = cout;
    }

    public EposterModel(String title, String cout, String pdf) {
        this.title = title;
        this.cout = cout;
        this.pdf = pdf;
    }
}
