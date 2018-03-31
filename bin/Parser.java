import java.util.Vector;

public class Parser {

    private String [] parsed_member;
    private String [] parsed_selection;
    private FileIO fileio;
    private Vector<String> lines;
    private Vector<Mentee> mentees;
    private Vector<Mentor> mentors;


    public Parser (String path){
        fileio = new FileIO(path);
        lines = new Vector<String>();
        lines = fileio.getLines();

        mentees = new Vector<Mentee>();
        mentors = new Vector<Mentor>();
    }

    public Parser(String mem_line, String select_line){

    }

    public void parser(boolean is_mem, boolean is_select){
        if(is_mem){

        }
        else if(is_select){
            System.out.println(lines.elementAt(3));
            for(int i = 0; i < lines.size(); i++){
                String[] vote = lines.elementAt(i).split(",");

                int[] choices = new int[3];
                int m_id = Integer.parseInt(vote[0]);
                System.out.println(vote[1]);
                choices[0] = Integer.parseInt(vote[2]);
                choices[1] = Integer.parseInt(vote[3]);
                choices[2] = Integer.parseInt(vote[4]);
                System.out.println(vote[1].toString().contains("tor"));
                if (vote[1].toString().contains("tor")) {
                    mentors.add(new Mentor(m_id, choices));
                    System.out.println("torsize " + mentors.size());
                } else if (vote[1].toString().contains("tee")) {
                    mentees.add(new Mentee(m_id, choices));
                }
            }

        }
    }

    public Vector<Mentee> getMentees() {
        return mentees;
    }

    public Vector<Mentor> getMentors(){
        return mentors;
    }
}
