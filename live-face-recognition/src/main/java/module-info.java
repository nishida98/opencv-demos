module com.live.facerecognition.livefacerecognition {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.live.facerecognition.livefacerecognition to javafx.fxml;
    exports com.live.facerecognition.livefacerecognition;
}