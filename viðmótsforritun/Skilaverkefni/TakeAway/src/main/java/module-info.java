module hi.verkefni.takeaway {
    requires javafx.controls;
    requires javafx.fxml;


    opens vidmot to javafx.fxml;
    exports vidmot;
}