import java.io.IOException;
import java.net.URI;

public class SearchEngine implements URLHandler{
    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message?s=")){
            String[] splits = url.getPath().split("=");
            return String.format(splits[1]);
        }
        else {return " ";}
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}