import TextFormatting.FormattedText;
import TextFormatting.BetterFormattedText;

public class Main {

    static void print() {
        var ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);

        var bft = new BetterFormattedText("This is a brave new world");
        bft.getRange(10, 15).capitalize = true;
        System.out.println(bft);
    }
    public static void main(String[] args) {
        print();
    }
}