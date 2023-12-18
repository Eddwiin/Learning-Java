package CopyThroughSerialization;

public class Foo {
    private long Stuff;
    private String Whatever;

    public long getStuff() {
        return Stuff;
    }

    public void setStuff(long stuff) {
        Stuff = stuff;
    }

    public String getWhatever() {
        return Whatever;
    }

    public void setWhatever(String whatever) {
        Whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "Stuff=" + Stuff +
                ", Whatever='" + Whatever + '\'' +
                '}';
    }
}

