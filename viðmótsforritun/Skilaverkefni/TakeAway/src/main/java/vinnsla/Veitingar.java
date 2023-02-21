package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Veitingar {
    private StringProperty veitingar;
    private int verd;

    public Veitingar(String nafn, int verd) {
        this.veitingar = new SimpleStringProperty(nafn);
        this.verd = verd;
    }

    public StringProperty nafnProperty() {
        return veitingar;
    }

    public String getNafn() {
        return veitingar.get();
    }

    public void setNafn(String nafn) {
        this.veitingar.set(nafn);
    }

    public int getVerd() {
        return verd;
    }

    public void setVerd(int verd) {
        this.verd = verd;
    }

    @Override
    public String toString() {
        return veitingar.get() + ", " + verd;
    }
}

