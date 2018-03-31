public abstract class Member {

    protected int mim_id;
    protected   int [] choices;


    public Member (int mim_id){
        this.mim_id = mim_id;
        choices = new int[3];
    }
    public Member (int mim_id, int []choices){
        this.mim_id = mim_id;
        this.choices = choices;
    }

    public int get_id (){return mim_id;}

    public int[] getChoices() {
        return choices;
    }
}
