import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * this is a test file for socket server.
 *
 * @author jeffw
 * @since 2019.12.3
 */

public class SocketServer {
    public static void main(String args[]) throws IOException {
        int port = 1234;
        ServerSocket server = new ServerSocket(port);
        System.out.println("start listening the port "+port+"...");
        // keep listening port
        while (true) {
            Socket socket = server.accept();
            // access the input stream.
            InputStream inputStream = socket.getInputStream();
            // set up buffer
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(bytes)) != -1) {
                // string transfer.
                sb.append(new String(bytes, 0, len, "UTF-8"));
            }
            System.out.println("get message from client: " + sb);
            inputStream.close();
            socket.close();
        }
    }
}
