package TextFormatting;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {
    private String plainText;
    private List<TextRange> formatting = new ArrayList<TextRange>();

    public BetterFormattedText(String plainText) {
        this.plainText = plainText;
    }

    public TextRange getRange(int start, int end) {
        var range = new TextRange(start, end);
        this.formatting.add(range);
        return range;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i) && range.isCapitalize()) {
                    c = Character.toUpperCase(c);
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
