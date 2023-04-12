import java.io.IOException;
import java.net.URI;

public class SearchEngine implements URLHandler{
    
    public String handleRequest(URI url) {
        String command = url.getPath().split("?")[0];
        
    }

}
