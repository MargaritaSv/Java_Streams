import java.io.*;

public class _02_UpperCase {
    public static void main(String[] args) throws IOException {
        File fl = new File("ForUpperCase.txt");
        fl.createNewFile();

        BufferedReader bR = new BufferedReader(new FileReader("ThisFile.txt"));
        String line;
        String temp = "";

        while ((line = bR.readLine()) != null) {
            temp += line.toUpperCase() + "\n";
        }

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fl)));
        pw.write(temp);
        pw.flush();
        pw.close();
        bR.close();
    }
}
