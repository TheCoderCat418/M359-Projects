module com.thecodercat418.TTTSimple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thecodercat418.TTTSimple to javafx.fxml;
    exports com.thecodercat418.TTTSimple;
}