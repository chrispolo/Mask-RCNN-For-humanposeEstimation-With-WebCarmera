import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * this is a test file for socket client
 * @author jeffw
 * @since 2019.12.3
 */

public class SocketClient {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 1234;
        // actively connect the host.port
        Socket socket = new Socket(host, port);
        // set up output stream
        OutputStream outputStream = socket.getOutputStream();
        String message = "java awesome, python sucks.";
        byte[] sendBytes = message.getBytes("UTF-8");
        // send len, so that the server can prepare for receiving.
        outputStream.write(sendBytes.length >>8);
        outputStream.write(sendBytes.length);
        // send string.
        outputStream.write(sendBytes);
        outputStream.flush();
        outputStream.close();
        socket.close();
    }
}
