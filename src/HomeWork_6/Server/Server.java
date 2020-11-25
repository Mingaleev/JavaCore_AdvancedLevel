package HomeWork_6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scan = new Scanner(System.in);

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            //Запуск потока посылки сообщений
            Thread threadSendMsg = new Thread(()->{
                try {
                    while (true) {
                        out.writeUTF(scan.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadSendMsg.setDaemon(true);
            threadSendMsg.start();


            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    break;
                }
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
