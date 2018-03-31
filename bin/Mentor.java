public class Mentor extends Member {

    public Mentor(int mim_id) {
        super(mim_id);
        choices = new int[3];
    }
    public Mentor(int mim_id, int[] choices) {
        super(mim_id);
        this.choices = choices;
    }
}
