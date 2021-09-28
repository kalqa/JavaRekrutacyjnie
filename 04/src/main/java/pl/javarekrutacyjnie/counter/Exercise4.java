package pl.javarekrutacyjnie.counter;

import pl.javarekrutacyjnie.counter.domain.OccurrenceCounter;
import pl.javarekrutacyjnie.counter.domain.Response;

public class Exercise4 {

    public static void main(String[] args) {
        String input = "Dzień bez kodowania dniem straconym. " +
                "Nie stracę już więcej 2 dni. A za 33215 minut będę Juniorem na 5.00?";

        char[] chars = input.toCharArray();
        final OccurrenceCounter occurenceCounter = new OccurrenceCounter();
        Response response = occurenceCounter.calculateOccurrences(chars);
        response.showMessage();
    }

}
