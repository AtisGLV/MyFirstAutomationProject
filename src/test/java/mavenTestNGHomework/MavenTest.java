package mavenTestNGHomework;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        String asciiArt1 = FigletFont.convertOneLine("Atis Gutmanis");
        System.out.println(asciiArt1);
    }
}