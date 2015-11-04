package Vutre_Vun;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Margarita on 21-Oct-15.
 */
public class ReadT {
    public static void main(String[] args) throws IOException{
        InputStreamReader cin =null;

        try {
            cin = new InputStreamReader(System.in);
        System.out.println("Enter \"q\" to quir");

            char ch;
            do{
                ch=(char)cin.read();
                System.out.print(ch);
            }while(ch!='q');
        }finally {
            if(cin!=null) cin.close();
        }
    }
}
