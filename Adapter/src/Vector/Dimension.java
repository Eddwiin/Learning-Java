package Vector;

public class Dimension {
    public static class Two implements IInteger {
        @Override
        public int getValue() {
            return 2;
        }
    }

    public static class Three implements IInteger {

        @Override
        public int getValue() {
            return 3;
        }
    }
}
