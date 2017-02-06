import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
public class GetTitle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("http://www.aswinachu.com/").get();
		String title=doc.title();
		System.out.println("Title of the page  "+title);

	}

}
