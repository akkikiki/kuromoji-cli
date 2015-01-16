import org.apache.commons.cli.*;
import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class KuromojiCLI {

    public static void main(String[] args) throws IOException, ParseException {

        CommandLineParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("u", "userDic", true, "select a path to user dictionary");

        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Tokenizer tokenizer = Tokenizer.builder()
                .userDictionary(commandLine.getOptionValue("u"))
                .build();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);

        String line;
        while ((line = br.readLine()) != null) {
            List<Token> tokens = tokenizer.tokenize(line);

            for (Token token : tokens) {
                System.out.println(token.getSurfaceForm() + "\t" + token.getAllFeatures());
            }
        }
    }
}
