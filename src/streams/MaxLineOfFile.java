package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MaxLineOfFile {
    public static void printMaxLine(Path f) throws IOException {
        String line=Files.lines(f).
                sorted((x,y)-> y.length()-x.length()).
                findFirst().
                get();
        System.out.println("max length " +line);
    }
}
