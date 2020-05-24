package by.gsu.pms.idz_string_processing.word_package;

public class Word {

    String word;

    public String refactor(String word) {
        StringBuilder new_word = new StringBuilder();
        new_word.append(word.charAt(0));
        for (int i = 1; i<word.length();i++) {
            if (word.charAt(i)!=word.charAt(0)
                    && word.charAt(i)!=word.charAt(word.length()-1)) {
                new_word.append(word.charAt(i));
            }
        }
        new_word.append(word.charAt(word.length()-1));
        return new_word.toString();
    }
}
