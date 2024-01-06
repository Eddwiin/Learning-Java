package TextFormatting;

public class FormattedText {
    private String plainText;
    private boolean[] capitalize;

    public FormattedText(String plainText) {
        this.plainText = plainText;
        capitalize = new boolean[plainText.length()];
    }

    public void capitalize(int start, int end) {
        for (int i = start; i <= end; i++) {
            capitalize[i] = true;
        }
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        for (var i = 0; i < plainText.length(); i++)
        {
            var c = plainText.charAt(i);
            sb.append(capitalize[i] ? Character.toUpperCase(c) : c);
        }
        return sb.toString();
    }
}
