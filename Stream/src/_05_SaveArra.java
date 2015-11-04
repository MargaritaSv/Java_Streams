import java.io.*;
import java.util.ArrayList;

public class _05_SaveArra {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fl = new File("double.txt");
        fl.createNewFile();
        ObjectOutputStream obj;
        ObjectInputStream objIn=null;
        try {
            obj = new ObjectOutputStream(new FileOutputStream(fl));
            ArrayList<Double> enumaration = new ArrayList<>();
            enumaration.add(76.0);
            enumaration.add(7687.9890);
            enumaration.add(2132.9809);
            enumaration.add(989.54);

            obj.writeObject(enumaration);
            obj.flush();
            objIn = new ObjectInputStream(new FileInputStream(fl));

        }finally {
            System.out.println(objIn.readObject());
            objIn.close();
        }
    }
}