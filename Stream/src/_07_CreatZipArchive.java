import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _07_CreatZipArchive {
    public static void main(String[] args) throws IOException {

        File fl = new File("words1.txt");
        fl.createNewFile();
        File fl1 = new File("count-chars.txt");
        fl1.createNewFile();
        File fl2 = new File("lines1.txt");
        fl2.createNewFile();

        String[] srcFiles = {"D:\\Download\\SoftwareUniversity\\Fundamental\\Java\\Stream\\words1.txt",
                "D:\\Download\\SoftwareUniversity\\Fundamental\\Java\\Stream\\count-chars.txt",
                "D:\\Download\\SoftwareUniversity\\Fundamental\\Java\\Stream\\lines1.txt"};
        String zipFile = "D:\\Download\\SoftwareUniversity\\Fundamental\\Java\\Stream\\text-files.zip";

        try {
            byte[] buffer = new byte[1024];
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);

            for (int i = 0; i < srcFiles.length; i++) {

                File srcFile = new File(srcFiles[i]);
                FileInputStream fis = new FileInputStream(srcFile);

                zos.putNextEntry(new ZipEntry(srcFile.getName()));

                int length;

                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
                fis.close();
            }
            zos.close();
        } catch (IOException ioe) {
            System.err.println("Error creating zip file: " + ioe);
        }

    }
}
