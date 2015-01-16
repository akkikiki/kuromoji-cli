import org.apache.commons.cli.ParseException;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class KuromojiCLITest {
    @Ignore
    @Test
    public void testUserDictionary() throws IOException, ParseException {
        String fileName = this.getClass().getClassLoader().getResource("userdic.txt").getPath();
        String[] args = { "-u", fileName};

        KuromojiCLI kuromojiCLI = new KuromojiCLI();
        kuromojiCLI.main(args);
    }

}