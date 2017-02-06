import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document; 
public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document doc=null;
		try {
			doc = Jsoup.connect("http://www.javatpoint.com").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        String keywords = doc.select("meta[name=keywords]").first().attr("content");  
        System.out.println("Meta keyword : " + keywords);  
        String description = doc.select("meta[name=description]").get(0).attr("content");  
        System.out.println("Meta description : " + description);  

	}

}
