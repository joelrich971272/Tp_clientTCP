module org.example.tp_clienttcp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens org.example.tp_clienttcp to javafx.fxml;
    exports org.example.tp_clienttcp;
}