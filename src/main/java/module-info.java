module com.example.java_deployment_automation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_deployment_automation to javafx.fxml;
    exports com.example.java_deployment_automation;
}