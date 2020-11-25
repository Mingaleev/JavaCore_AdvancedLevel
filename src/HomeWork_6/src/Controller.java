package HomeWork_6.src;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final String IP_ADDRESS = "localhost";
    private final int PORT = 8189;
    @FXML
    public TextField text_for_chat;
    @FXML
    public TextArea chat;

    DataInputStream in;
    DataOutputStream out;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Socket socket = new Socket(IP_ADDRESS, PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Thread threadReadMsg = new Thread(()->{

                    try {
                        while (true) {
                            String str = in.readUTF();
                            chat.appendText("Сервер: " + str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            });

            threadReadMsg.setDaemon(true);
            threadReadMsg.start();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    public void send(ActionEvent actionEvent) {
        try {
            out.writeUTF(text_for_chat.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        chat.appendText("Я: " + text_for_chat.getText() + "\n");
        text_for_chat.clear();
        text_for_chat.requestFocus();
    }

}
