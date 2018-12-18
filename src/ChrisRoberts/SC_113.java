//package ChrisRoberts;
//
//import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
//import org.jsoup.Jsoup;
//
//import java.io.IOException;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//
//
//class JSoupExamples {
//
//    public static void main(String[] args) throws IOException  {
//
//        String url="https://www.w3schools.com";
//        Document doc = Jsoup.connect(url).get();
//
//        Elements links = doc.select("a");
//
//        for(Element link : links){
//
//            System.out.println("\nLink :"+link.attr("href"));
//            System.out.println("Title :"+link.text());
//        }
//
//    }
//
//}