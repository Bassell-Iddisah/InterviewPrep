module com.systems.interviewprep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.systems.interviewprep to javafx.fxml;
    exports com.systems.interviewprep;
}