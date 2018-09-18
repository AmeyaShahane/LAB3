import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        String word = "";
        String newword = "";
        String anotherString = "";
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        for (int i = 0; i < contents.length(); i++) {
            while((int) contents.charAt(i) != (int) ' ') {
                if (i == contents.length() - 1) {
                    break;
                }
                newword = newword + contents.charAt(i); // b + u + r + g + e + r
                i++;
            }
                if (word.equalsIgnoreCase("officer")) {
                        newword = word + anotherString;
                }
            }
        }
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {

        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }
}
