import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_Copy_jpgFile {
    public static void main(String[] args) throws IOException{
        FileInputStream fIn = new FileInputStream("Cool-Quotes-5.jpg");
        FileOutputStream fOut = new FileOutputStream("my-copyed-pictures.jpg");

        int byteC;
        while((byteC=fIn.read())!=-1){
            fOut.write(byteC);
        }
        fIn.close();
        fOut.close();
    }
}
