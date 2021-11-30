import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class spider {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://rule.nkust.edu.tw/").get();
            System.out.println("doc.title(): " + doc.title());
            Elements newsHeadlines = doc.select("#Dyn_2_2 a");//document.querySelector("#Dyn_2_2 > div > div > section")
            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                System.out.println(headline.absUrl("href"));

            }
        }catch(Exception e){
            System.out.println("error: " + e);
        }
    }
}
