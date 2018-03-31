/*
	GNU General Public Licence
	@aycakckdrmz 

	*/
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args){

        /*FileIO fileio = new FileIO(
                "/home/icha/Projects/IdeaProjects/gitRepos/MIMSocietyMatchMaker/test/test_res/mem_test0.csv");
        if(fileio. != null){
            System.out.println("true");
        }
*/
        System.out.println("hello");
        //String tst = "\"AST\",\"21\",\"Mentee\","","","","10","12","11","","","","","","","""
        //tst = tst.replace("\"", "");
        //System.out.println(tst);
        try {
            File file = new File("bin/test.csv");
            Scanner scanner = new Scanner(file);
            Vector<String> lines = new Vector<String>();
            if(scanner.hasNextLine()) scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replace("\"", "").replace(",,,", "");
                line = line.substring(26);
                lines.add(line);

            }
            System.out.println(lines.elementAt(0));
            System.out.println(lines.elementAt(1).indexOf(","));

            System.out.println(lines.elementAt(4));
            String [] test =  lines.elementAt(4).split(",");
            System.out.println("Size: " + test.length);
            System.out.println(lines.capacity());
            System.out.println(lines.size());

        }catch (IOException e){
            e.printStackTrace();
        }

        //FileIO fileio = new FileIO();
        Parser parser = new Parser("bin/test.csv");
        parser.parser(false,true);
        Decision decide = new Decision(parser.getMentees(), parser.getMentors());
        System.out.println(parser.getMentees().size());
        decide.init_match();
        decide.basic_score();
        System.out.println(decide.getMatches().elementAt(1).getMentee().get_id());
        System.out.println(decide.getMatches().elementAt(1).getMentor().get_id());
        System.out.println(decide.getMatches().elementAt(1).getScore());
        decide.sort();
        decide.print();
    }


}