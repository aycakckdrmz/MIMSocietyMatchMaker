import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileIO {

    BufferedReader reader;
    static Vector<String> out_lines;

    public FileIO(String path){
        try{
            BufferedReader bufferedReader = reader = new BufferedReader(new FileReader(
                    "/test/test_res/mem_test0.csv"));
            String line = reader.readLine();
            int counter = 0;
            while(line != null){
                out_lines.add(reader.readLine());
                counter++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }



}
