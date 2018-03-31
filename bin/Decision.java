import java.util.Collections;
import java.util.Vector;

public class Decision {
    private Vector<Mentee> mentees;
    private Vector<Mentor> mentors;

    private Vector<Match> matches;

    Decision(Vector<Mentee> mentees, Vector<Mentor> mentors){
        this.mentees = mentees;
        this.mentors = mentors;
        matches = new Vector<Match>();
    }

    public void init_match(){

        for(int i = 0; i < mentors.size(); i++){
            for(int j = 0; j < mentees.size(); j++){
                matches.add(new Match(mentors.elementAt(i), mentees.elementAt(j)));
            }
        }
    }

    public void basic_score(){
        for(int i = 0; i < mentees.size(); i++){
            int index = find_match(get_mentor_by_id(mentees.elementAt(i).getChoices()[0]), mentees.elementAt(i));
            if(index != -1) {
                matches.elementAt(index).mult_score(3);
                index = find_match(get_mentor_by_id(mentees.elementAt(i).getChoices()[1]), mentees.elementAt(i));
                matches.elementAt(index).mult_score(2);
                index = find_match(get_mentor_by_id(mentees.elementAt(i).getChoices()[2]), mentees.elementAt(i));
                matches.elementAt(index).mult_score(1);
            }
        }

        for(int j = 0; j < mentors.size(); j++){
            int index = find_match(mentors.elementAt(j), get_mentee_by_id(mentors.elementAt(j).getChoices()[0]));
            if(index != -1) {
                matches.elementAt(index).mult_score(3);
                index = find_match(mentors.elementAt(j), get_mentee_by_id(mentors.elementAt(j).getChoices()[1]));
                matches.elementAt(index).mult_score(2);
                index = find_match(mentors.elementAt(j), get_mentee_by_id(mentors.elementAt(j).getChoices()[2]));
                matches.elementAt(index).mult_score(1);
            }
        }
    }


    public Mentee get_mentee_by_id(int mid){
        Mentee tee = new Mentee(0);

        for(int j = 0; j < mentees.size(); j++){
            if(mentees.elementAt(j).get_id() == mid){
                tee = mentees.elementAt(j);
            }
        }
        return tee;
    }

    public Mentor get_mentor_by_id(int mid) {
        Mentor tor = new Mentor(0);
        for (int i = 0; i < mentors.size(); i++) {
            if (mentors.elementAt(i).get_id() == mid) {
                tor = mentors.elementAt(i);
            }
        }
        return tor;
    }

    public int find_match(Mentor tor, Mentee tee){
        int index = -1;
        for(int i = 0; i < mentors.size() * mentees.size(); i++){
            if(matches.elementAt(i).getMentor() == tor && matches.elementAt(i).getMentee() == tee)
                index = i;

        }
        return index;
    }

    public Vector<Match> getMatches() {
        return matches;
    }

    public void print(){
        for (int i = 0; i<matches.size(); i++){
            System.out.println(matches.elementAt(i).print());
        }
    }

    public void sort(){
        for(int i = 0; i < matches.size(); i++){
            for(int j = 0; j < matches.size(); j++){
                if (matches.elementAt(i).getScore() > matches.elementAt(j).getScore()) {
                    Match temp = matches.elementAt(j);
                    matches.setElementAt(matches.elementAt(i), j);
                    matches.setElementAt(temp, i);
                }

            }
        }
    }

}
