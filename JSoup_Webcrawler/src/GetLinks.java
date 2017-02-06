import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.IOException;
public class GetLinks {

	public static void main(String args[])throws IOException{
		Document doc= Jsoup.connect("http://www.javatpoint.com").get();
		Elements links=doc.select("a[href]");

		for(Element e: links){
		System.out.println("\nLink"+e.attr("href"));
		System.out.println("\nText"+e.text());
		}
	}

}
