public class TestCase {
    private final String category;
    private final String value;
    private final String note;

    public TestCase(String category, String value, String note) {
        this.category = category;
        this.value = value;
        this.note = note;
    }

    @Override
    public String toString () {
        return "[" + category + "] value=\"" + value + "\" --> " + note;
    }
}
