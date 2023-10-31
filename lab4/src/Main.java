import com.sun.source.tree.Tree;
import exceptions.FileReadException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static String readFile(String path, Charset encoding) throws FileReadException {
        try {
            return Files.readString(Paths.get(path), encoding);
        } catch (IOException e) {
            throw new FileReadException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File dictionaryFile = new File("dictionary.txt");
        String textFile = "text.txt";
        try {
            Dictionary d = new Dictionary(dictionaryFile);
            d.printDictionary();
            String text = readFile(textFile, StandardCharsets.UTF_8);
            System.out.println("--------------------------------\n");

            Translator translator = new Translator(dictionaryFile);
            System.out.println(translator.translate(text));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}