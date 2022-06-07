package lab_06;

public class GoogleValidation {
    public static void main(String[] args) {

        extractString("https://google.com");
        extractString("http://google.com");
        extractString("https://amazon.net");

    }

    private static void extractString(String url){
        System.out.println(url);
        System.out.println(url.substring(0, url.indexOf("://")));
        System.out.println(url.substring(url.indexOf("://")+3, url.indexOf(".")));
        System.out.println(url.substring(url.indexOf(".") +1));
    }
}
