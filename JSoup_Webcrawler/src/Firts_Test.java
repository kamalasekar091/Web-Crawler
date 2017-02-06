import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Firts_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Document doc = Jsoup.connect("http://my.iit.edu/cp/home/displaylogin").get();
			 String title = doc.title();
             System.out.println("title is: " + title);
             System.out.println("------------------");
             System.out.println("------------------");System.out.println("------------------");
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
