import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class FileIO {

    BufferedReader reader;
    static Vector<String> lines;

    public FileIO(String path){
        try {
            lines = new Vector<String>();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            if(scanner.hasNextLine()) scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replace("\"", "").replace(",,,", "");
                line = line.substring(26);
                lines.add(line);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Vector<String> getLines(){ return lines;}



}
