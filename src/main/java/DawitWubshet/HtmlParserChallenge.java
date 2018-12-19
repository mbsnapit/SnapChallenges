/*
Given a URL, it parses the HTML and extracts the script tags and other tags,
and returns them as string.
 */

package DawitWubshet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HtmlParserChallenge {
    // Extracts script tags from the document located at the provided URL
    public String extractScriptTags(String url) {
        StringBuilder scripts = new StringBuilder();

        try {
            Document doc = Jsoup.connect(url).get();

            Elements scriptsList = doc.getElementsByTag("script");
            for (Element script : scriptsList) {
                scripts.append(script.data());
            }
        } catch (IOException ioe) {
            scripts = new StringBuilder();
            scripts.append("Invalid input data.");
        }

        return scripts.toString();
    }

    // Extracts all occurrences of the provided tag from
    // the document located at the provided URL
    public String extractTags(String url, String tagName) {
        StringBuilder scripts = new StringBuilder();

        try {
            Document doc = Jsoup.connect(url).get();

            Elements scriptsList = doc.getElementsByTag(tagName);
            for (Element script : scriptsList) {
                scripts.append(script.data());
            }
        } catch (IOException ioe) {
            scripts = new StringBuilder();
            scripts.append("Invalid input data.");
        }

        return scripts.toString();
    }
}
