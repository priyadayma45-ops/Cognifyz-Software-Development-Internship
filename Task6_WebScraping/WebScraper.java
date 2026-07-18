package Task6_WebScraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {

    public static void main(String[] args) {

        try {

            System.out.println("======================================");
            System.out.println("       JAVA WEB SCRAPER");
            System.out.println("======================================");
            System.out.println("Fetching data from website...\n");

            Document doc = Jsoup.connect("https://books.toscrape.com/")
                    .userAgent("Mozilla/5.0")
                    .get();

            Elements books = doc.select("article.product_pod");

            for (Element book : books) {

                String title = book.select("h3 a").attr("title");
                String price = book.select(".price_color").text();

                System.out.println("Book : " + title);
                System.out.println("Price: " + price);
                System.out.println("--------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}