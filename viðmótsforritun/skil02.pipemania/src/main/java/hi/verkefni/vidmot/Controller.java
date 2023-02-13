package hi.verkefni.vidmot;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import vinnsla.Pipa;
import vinnsla.Pipemania;
import vinnsla.Pipukista;

public class Controller {

    @FXML
    private Label Stig;

    @FXML
    private GridPane fxBord;

    @FXML
    private GridPane fxKista;

    @FXML
    private Label fxStig;

    private int last_x;
    private int last_y;

    @FXML
    void VeljaReit(ActionEvent event) {
        Pipa p = Pipukista.naestaPipa();

        Button takki = (Button) ActionEvent.getSource();

        last_x = GridPane.getColumnIndex(takki);
        last_y = GridPane.getRowIndex(takki);


    }

    @FXML
    void fxAthFlaedi(ActionEvent event) {
        System.out.print("Það flæðir jibbí");

    }

    public void birtaMyndir(ObservableList<Pipa> q) {
        int i = 3;
        for (Pipa p : q) {
            fxKista.getChildren().get(i).getStyleClass().clear();
            fxKista.getChildren().get(i--).getStyleClass().add(getStyleClass().add(getMyndStyleClass(p)));
        }
    }


    private Pipemania pipemania;


    public void initialize() {
        this.pipemania = new Pipemania(4);
        fxStig.textProperty().bind(pipemania.stigProperty().asString());
        pipemania.nuverandiPipaProperty().addListener((observable, oldValue, newValue) -> {
            Button hnappur = ((Button) fxBord.getChildren().get(last_x * 5 + last_y));
            hnappur.getStyleClass().add(getStilKlasi(newValue));
        });
        pipemania.setNaestaPipa(last_x, last_y); // ekkibuin að útfæra setNaestaPipa

        ObservableList<Pipa> q = pipemania.getKista().getKista();
        q.addListener((ListChangeListener<Pipa>) change -> {
            if (change.next() && change.wasAdded()) {
                // Uppfæra lista hér;
                birtaMyndir(q);


            }
        });


    }

    public String getStilKlasi(Pipa p) {
        Pipa.Att a = p.getInn();
        Pipa.Att b = p.getUt();
        return "." + a + b;
    }

}
