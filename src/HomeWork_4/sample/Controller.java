package HomeWork_4.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    public  javafx.scene.control.TextArea chat;

    @FXML
    public javafx.scene.control.TextField text_for_chat;
    
    @FXML
    public javafx.scene.control.Button btn;

    public void send(ActionEvent actionEvent) {
        chat.appendText(text_for_chat.getText() + "\n");
        text_for_chat.clear();
        text_for_chat.requestFocus();
    }




}
