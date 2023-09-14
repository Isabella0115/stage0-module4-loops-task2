package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        if (chars.length == 0) {
            System.out.println("No characters provided");
            return;
        }

        // Create a StringBuilder to build the phrase
        StringBuilder phraseBuilder = new StringBuilder();

        // Append each character to the StringBuilder
        for (char c : chars) {
            phraseBuilder.append(c);
        }

        // Convert the StringBuilder to a String and print the phrase
        String phrase = phraseBuilder.toString();
        System.out.print(phrase);
    }
}