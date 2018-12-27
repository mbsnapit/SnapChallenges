/*Given a URL, create a Java method to parse the HTML, extract the script tags, and print them out as Strings. Google will be your best friend here :}

        URL: https://www.w3schools.com/

        Hint: you will need to include dependencies in a pom.xml file
        Another hint: which means it will need to be a "Maven" project.

        The target deadline on this will be 12/28/18
        */
package NathanThomas;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class HtmlParserChallenge {

    public static void main(String[] args) throws IOException {

        String webPage = "https://www.w3schools.com/";

        String html = Jsoup.connect(webPage).get().html();

        Document doc = Jsoup.parse(html);

        Elements scriptTags = doc.getElementsByTag("script");

        System.out.println(scriptTags);
    }
}
