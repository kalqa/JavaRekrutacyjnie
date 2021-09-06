public class Response {

    private static final String LETTERS_MSG = "litery";
    private static final String SPACES_MSG = "spacje";
    private static final String NUMBERS_MSG = "liczby";
    private static final String OTHERS_MSG = "inne";
    public static final String NEW_LINE = "\n";

    private final String value;

    public Response(int letters, int numbers, int spaces, int others) {
        value = addLine(letters, LETTERS_MSG) +
                addLine(spaces, SPACES_MSG) +
                addLine(numbers, NUMBERS_MSG) +
                addLine(others, OTHERS_MSG);
    }


    private String addLine(int occurences, String message) {
        return message + ": " + occurences + NEW_LINE;
    }

    public void showMessage() {
        System.out.println(this.value);
    }

}