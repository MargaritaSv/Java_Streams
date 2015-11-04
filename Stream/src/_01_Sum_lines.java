import java.io.*;
import java.util.ArrayList;

public class _01_Sum_lines {
    public static void main(String[] args) throws IOException {
        File fl = new File("ThisFile.txt");
        fl.createNewFile();

        ArrayList<Integer> result =new ArrayList<>();

        try(BufferedReader bR = new BufferedReader(new FileReader(fl)))
        {
            String line;
            while((line=bR.readLine())!=null){
                int currSum =0;
                for (int i = 0; i <line.length() ; i++) {
                    currSum+=line.charAt(i);
                }
                result.add(currSum);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
