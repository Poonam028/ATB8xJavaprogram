package Oct.ex_23102024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("output.exe");
    }
}
