package TextFormatting;

public class TextRange {
    public int start, end;
    public boolean capitalize, bold, italic;

    public TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean covers(int position)
    {
        return position >= start && position <= end;
    }

    public boolean isCapitalize() {
        return capitalize;
    }

    public void setCapitalize(boolean capitalize) {
        this.capitalize = capitalize;
    }
}
