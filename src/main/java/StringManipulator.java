public class StringManipulator {
    private String string;

    public StringManipulator(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }

    public void aToAt() {
        string = string.replaceAll("a", "@");
    }

    public void appendExclaim() {
        string = string + "!!!";
    }

    public void abc() {string = string + " abcdefghijklmnopqrstuvwxyz there is the abc i did it";}
}