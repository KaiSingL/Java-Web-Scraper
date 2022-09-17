package webscrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Shane - shanelee.co.uk
*/


public class WebScrape {
    public static void main(String[] args) {
        final String url = 
                "https://unwire.hk/";

        try {
            final Document document = Jsoup.connect(url).get();

//            System.out.println(document.outerHtml());

            System.out.println("\n\n====== Web Scraper ======");
            System.out.println("url: " + url + "\n");

            for (Element row: document.select("div.post-content")) {
                String link = row.select("div.title a").attr("abs:href");
                String title = row.select("div.title a").text();
                System.out.println(title + "  " + link);
            }

//            for (Element row : document.select(
//                "table.tablesorter.full tr")) {
//                if (row.select("td:nth-of-type(1)").text().equals("")) {
//                    continue;
//                }
//                else {
//                   final String ticker =
//                           row.select("td:nth-of-type(1)").text();
//                   final String name =
//                           row.select("td:nth-of-type(2)").text();
//                   final String tempPrice =
//                           row.select("td.right:nth-of-type(3)").text();
//                   final String tempPrice1 =
//                           tempPrice.replace(",", "");
////                    final double price = Double.parseDouble(tempPrice1);
//
//                    System.out.println(ticker + " " + name + " " + tempPrice1);
//                }
//            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
