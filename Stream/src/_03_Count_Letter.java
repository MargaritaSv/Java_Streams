import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _03_Count_Letter {
    public static void main(String[] args) throws IOException {
        File fl = new File("words.txt");
        fl.createNewFile();

        BufferedReader bR = new BufferedReader(new FileReader(fl));

        String line = "";
        int vowels = 0;
        int consonants = 0;
        int punctuations = 0;

        while ((line = bR.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'u' || line.charAt(i) == 'i' || line.charAt(i) == 'o') {
                    vowels++;
                } else if (line.charAt(i) == '!' || line.charAt(i) == '.' || line.charAt(i) == ',' || line.charAt(i) == '.' || line.charAt(i) == '?') {
                    punctuations++;
                }
            }
        }
        consonants = vowels - punctuations;
        System.out.printf("Vowels: %s\n", vowels);
        System.out.printf("Consonants: %s\n", Math.abs(consonants));
        System.out.printf("Punctuations: %s\n", punctuations);
    }
}
