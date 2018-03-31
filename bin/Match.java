public class Match {
    private Mentee mentee;
    private Mentor mentor;

    private int score;

    public Match(Mentor mentor, Mentee mentee){
        this.mentor = mentor;
        this.mentee = mentee;
        score = 1;
    }

    public void add_score(int score){
        this.score += score;
    }

    public void mult_score(int score){
        this.score *= score;
    }

    public Mentor getMentor (){
        return mentor;
    }

    public Mentee getMentee () {
        return mentee;
    }

    public int getScore() {
        return score;
    }
    public String print(){
        String print = "";
        print = "Mentee "+ mentee.get_id() + "   ";
        print += "Mentor "+ mentor.get_id() + "   ";
        print += "Score "+ score + "\n";
        return print;
    }
}
