public class Mentee extends Member {

    public Mentee(int mim_id) {
        super(mim_id);
        choices = new int[3];
    }

    public Mentee(int mim_id, int[] choices) {
        super(mim_id);
        this.choices = choices;
    }





}
