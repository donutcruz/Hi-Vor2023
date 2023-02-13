package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import vinnsla.Reiknivel;


public class ReiknivelController {

    @FXML
    private TextField fxUttak;

    private int tala;
    private int utkoma;

    private Reiknivel reiknivel;

    @FXML
    public void inntakTalaActionPerformed(ActionEvent actionEvent) {
        int tala = Integer.parseInt(((Node) actionEvent.getSource()).getId());
        reiknivel.setTala(tala);
        fxUttak.setText(fxUttak.getText() + tala);

    }


    public void initialize() {
        reiknivel = new Reiknivel();
    }

    @FXML
    private void hreinsaHandler(ActionEvent event) {
        reiknivel.hreinsa();
        fxUttak.setText("");
    }

    @FXML
    public void equalsHandler(ActionEvent actionEvent) {
        int reval = reiknivel.jafntOg();
        fxUttak.setText(reval + "");
    }

    @FXML
    public void virkiHandler(ActionEvent actionEvent) {
        int numty = Integer.parseInt(((Node) actionEvent.getSource()).getId()) - 10;
        reiknivel.setVirki(numty);
        fxUttak.setText("");
    }

    @FXML
    public void plusMinusHandler(ActionEvent actionEvent) {
        reiknivel.plusminus();
        int a = Integer.parseInt(fxUttak.getText());
        fxUttak.setText(a * -1 + "");
    }


    @FXML
    public void percentageHandler(ActionEvent actionEvent) {
    }

    @FXML
    public void dotHandler(ActionEvent actionEvent) {
    }

}
