package streams;


import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String []args) throws IOException {
        MaxLineOfFile.printMaxLine(Paths.get("src//streams//input.txt"));
    }
}
