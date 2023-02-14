package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pipa {
    /*
    A.  lögun pípu - athugið að hér á ekki að geyma myndina af pípunni.
    B.  eiginleiki sem segir hvort vatn flæði í pípuna, t.d. StringProperty opin

Eftirfarandi aðferðir gætu verið í pípu

A. smiður sem setur gögnin
B. aðferð sem segir til um hvort flæði úr núverandi pípu yfir í pípu s. t.d. public boolean  flaedir (Pipa s)
C. get og set aðferðir fyrir gögnin eins og á þarf að halda
     */

    private Att inn;
    private Att ut;

    private final StringProperty opin = new SimpleStringProperty();

    public enum Att {V, N, A, S}

    ;

    public Pipa(Att x, Att y) {
        this.inn = x;
        this.ut = y;
    }

    public boolean flaedir(Pipa s) {
        if ((ut.ordinal() + 2) % 4 == s.inn.ordinal()) return true;
        else if ((ut.ordinal() + 2) % 4 == s.ut.ordinal()) {
            Att tmp = s.ut;
            s.ut = s.inn;
            s.inn = tmp;
            return true;
        }

        return false;
    }

    public Att getInn() {
        return inn;
    }

    public void setInn(Att inn) {
        this.inn = inn;
    }

    public Att getUt() {
        return ut;
    }

    public void setUt(Att ut) {
        this.ut = ut;
    }

    public String getOpin() {
        return opin.get();
    }

    public StringProperty opinProperty() {
        return opin;
    }

    public void setOpin(String opin) {
        this.opin.set(opin);
    }

}
