package WorkingWithAbstractionExcercise.CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        Arrays.stream(CardRanks.values())
                .forEach(cardRanks -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardRanks.ordinal(), cardRanks.name()));
    }
}
