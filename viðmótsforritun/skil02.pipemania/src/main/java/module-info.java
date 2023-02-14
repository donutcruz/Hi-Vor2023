module hi.verkefni.s02pipemania {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vidmot to javafx.fxml;
    exports hi.verkefni.vidmot;
}
