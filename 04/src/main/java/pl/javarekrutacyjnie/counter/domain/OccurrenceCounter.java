package pl.javarekrutacyjnie.counter.domain;

public class OccurrenceCounter {

    private final LetterCounter letterCounter;
    private final NumberCounter numberCounter;
    private final SpaceCounter spaceCounter;
    private final OtherCounter otherCounter;

    public OccurrenceCounter() {
        this.letterCounter = new LetterCounter(0);
        this.numberCounter = new NumberCounter(0);
        this.spaceCounter = new SpaceCounter(0);
        this.otherCounter = new OtherCounter(0);
    }

    public Response calculateOccurrences(char[] chars) {
        for (char i : chars) {
            if (Character.isLetter(i)) {
                letterCounter.increment();
            } else if (Character.isDigit(i)) {
                numberCounter.increment();
            } else if (Character.isSpaceChar(i)) {
                spaceCounter.increment();
            } else {
                otherCounter.increment();
            }
        }

        return new Response(
                letterCounter.getCounter(),
                numberCounter.getCounter(),
                spaceCounter.getCounter(),
                otherCounter.getCounter()
        );
    }

    private class LetterCounter {
        private int counter;

        public LetterCounter(int counter) {
            this.counter = counter;
        }

        public int getCounter() {
            return counter;
        }

        public void increment() {
            counter++;
        }
    }

    private class NumberCounter {
        private int counter;

        public NumberCounter(int counter) {
            this.counter = counter;
        }

        public int getCounter() {
            return counter;
        }

        public void increment() {
            counter++;
        }
    }

    private class SpaceCounter {
        private int counter;

        public SpaceCounter(int counter) {
            this.counter = counter;
        }

        public int getCounter() {
            return counter;
        }

        public void increment() {
            counter++;
        }
    }

    private class OtherCounter {
        private int counter;

        public OtherCounter(int counter) {
            this.counter = counter;
        }

        public int getCounter() {
            return counter;
        }

        public void increment() {
            counter++;
        }
    }

}
