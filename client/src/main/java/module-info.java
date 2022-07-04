module ru.kosarev.cloud5.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kosarev.cloud5.client to javafx.fxml;
    exports ru.kosarev.cloud5.client;
}