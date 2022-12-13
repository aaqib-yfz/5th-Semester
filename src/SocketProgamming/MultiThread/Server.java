package SocketProgamming.MultiThread;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5555);
        ss.setReuseAddress(true);

        // just accepting new connections

        Socket server = ss.accept();
        System.out.println("New Client Connected " + server.getInetAddress().getHostAddress());
        ClientHandler serverSock = new ClientHandler(server);
        //background thread
         new Thread(serverSock).start();
//        if (ss != null) {
//            ss.close();
//        }
    }
    private   static class ClientHandler implements Runnable{
        private final Socket clientSocket;

        private ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }


        @Override
        public void run()  {
            PrintWriter out = null;
            BufferedReader in = null;
            try{
                out = new PrintWriter(clientSocket.getOutputStream(),true);
                in =  new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String line;
                while ((line = in.readLine()) != null){
                    System.out.println("Sent from Client" + line);

                }
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                try {
                    if(out!=null){
                        out.close();
                    }
                    if(in !=null){
                        in.close();
                        clientSocket.close();
                    }
                }catch (Exception e){

                }
            }
        }
    }

}












