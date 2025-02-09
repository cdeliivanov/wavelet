import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler{
    String display = "";
    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")){
            String[] splits = url.getQuery().split("=");
            display += String.format(splits[1] + "\n");
            return display;
        }
        else {return "Error: String not Found";}
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}