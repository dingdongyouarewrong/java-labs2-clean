package by.gsu.pms.idz_string_processing;



import by.gsu.pms.idz_string_processing.word_package.Word;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Runner {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = new BufferedReader(new FileReader("mytext.txt"));
        StringBuilder builder = new StringBuilder();
        String currentLine;
        try {
            currentLine = reader.readLine();
            while (currentLine != null) {
                builder.append(currentLine);
                builder.append("n");
                currentLine = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(builder.toString());
        ArrayList<String> words = new ArrayList<>();
        for (String str_word:builder.toString().split(" ")) {
            Word w = new Word();
            words.add(w.refactor(str_word));
        }
        System.out.println(words);
    }
}