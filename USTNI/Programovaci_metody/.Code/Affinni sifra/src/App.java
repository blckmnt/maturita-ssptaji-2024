import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class App {

    static HashMap<Character, Integer> zn2int = new HashMap<>();
    static HashMap<Integer, Character> int2zn = new HashMap<>();

    static {    // naplneni hashmap
        zn2int.put(' ', 26);
        zn2int.put('.', 27);
        zn2int.put(',', 28);
        for (char i = 'A'; i < 'Z'; i++)
            zn2int.put(i, (int) i - 65);

        // opacne
        int2zn.put(26, ' ');
        int2zn.put(27, '.');
        int2zn.put(28, ',');
        for (int i = 0; i < 26; i++)
            int2zn.put(i, (char) (i + 65));
    }

    public static void main(String[] args) throws IOException {
        FileReader fi = new FileReader("src/vstup.txt");
        int zn;

        int a = 23;
        int b = 18;
        int mod = 29;

        while ((zn = fi.read()) != -1) {                // jede to do eof (-1)
            if (zn2int.get((char) zn) == null) {
                System.out.print((char) zn);
            } else {
                int Ci;

                // sifruj
                Ci = (a * zn2int.get((char) zn)) % mod; // nasobeni
                Ci = (Ci + b) % mod; // scitani

                System.out.print(int2zn.get(Ci));
            }
        }
        fi.close();
    }
}
