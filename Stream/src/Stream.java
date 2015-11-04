import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Margarita on 21-Oct-15.
 */
public class Stream {
    public static void main(String[] args) throws IOException {
        File fl = new File("Tova.txt");

        fl.createNewFile();

        FileWriter wr = new FileWriter(fl);
        wr.write("This is an\neaxm");
        wr.flush();
        wr.close();

        FileReader fr = new FileReader(fl);
        char[] ch= new char[50];
        fr.read(ch);

        for(char c:ch){
            System.out.print(c);
            fr.close();  // no ne spira sled print na vsi4ko
        }
    }
}
