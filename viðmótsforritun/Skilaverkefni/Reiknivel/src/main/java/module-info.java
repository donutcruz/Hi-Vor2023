module hi.verkefni.reiknivel {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.spotbugs.annotations;


    opens vidmot to javafx.fxml;
    exports vidmot;
    
}
