import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class KuromojiCLI {
    public static void main(String[] args) throws IOException {
        Tokenizer tokenizer = Tokenizer.builder().build();
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
