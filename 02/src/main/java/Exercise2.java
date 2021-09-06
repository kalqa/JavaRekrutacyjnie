public class Exercise2 {

    private static final String LETTERS_MSG = "litery";
    private static final String SPACES_MSG = "spacje";
    private static final String NUMBERS_MSG = "liczby";
    private static final String OTHERS_MSG = "inne";

    public static void main(String[] args) {
        String input = "Dzień bez kodowania dniem straconym. " +
                "Nie stracę już więcej 2 dni. A za 33215 minut będę Juniorem na 5.00?";

        char[] chars = input.toCharArray();

        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int other = 0;

        for (char i : chars) {
            if (Character.isLetter(i)) {
                letters++;
            } else if (Character.isDigit(i)) {
                numbers++;
            } else if (Character.isSpaceChar(i)) {
                spaces++;
            } else if (Character.isSpaceChar(i)) {
                spaces++;
            } else {
                other++;
            }
        }

        showMessage(letters, LETTERS_MSG);
        showMessage(spaces, SPACES_MSG);
        showMessage(numbers, NUMBERS_MSG);
        showMessage(other, OTHERS_MSG);
    }

    private static void showMessage(int other, String s) {
        System.out.printf(s + ": %d%n", other);
    }
}