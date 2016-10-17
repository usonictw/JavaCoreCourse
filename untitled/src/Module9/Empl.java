package Module9;

/**
 * Created by user on 17.10.2016.
 */
public class Empl {

    private long emplId;
    private String discription;

    public Empl() {
    }

    public Empl(long emplId, String discription) {
        this.emplId = emplId;
        this.discription = discription;
    }

    public long getEmplId() {
        return emplId;
    }

    public String getDiscription() {
        return discription;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "emplId=" + emplId +
                ", discription='" + discription + '\'' +
                '}';
    }
}
