package day44_map_and_functions.enum_example;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;

        switch (browser) {
            case CHROME:
                System.out.println("Opening Chrome browser");
                break;
            case FIREFOX:
                System.out.println("Opening Firefox browser");
                break;
            case OPERA:
                System.out.println("Opening Opera browser");
                break;
            default:
                System.out.println("Unknown browser");
        }

        // using this regular constant
        System.out.println(Test.BROWSER);
    }
}
