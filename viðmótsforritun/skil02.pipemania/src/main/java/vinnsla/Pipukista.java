package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import vinnsla.Pipa.Att;

import java.util.Random;

public class Pipukista {
    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();


    public Pipukista(int fjoldi) {
        for (int i = 0; i < fjoldi; i++) {
            kista.add(nyPipa());
        }
    }

    private Pipa nyPipa() {
        int a = 0, b = 0;
        Random random = new Random();
        a = random.nextInt((3 - 0) + 1) + 0;
        b = random.nextInt((3 - 0) + 1) + 0;
        while (a == b) {
            b = random.nextInt((3 - 0) + 1) + 0;
        }
        Att c = Att.values()[a];
        Att d = Att.values()[b];
        Pipa temp_pipa = new Pipa(c, d);
        return temp_pipa;
    }

    public Pipa naestaPipa() {
        Pipa naesti = kista.get(0);
        //Ny pipa i stadinn
        Pipa nyr = nyPipa();
        //tokum gomlu ur listanum
        kista.remove(0, 1);
        //baetum nyju pipunni aftast
        kista.add(nyr);
        //skilum pipunni sem a ad fara a bordid
        return naesti;
    }

    public ObservableList<Pipa> getKista() {
        return kista;
    }
}
