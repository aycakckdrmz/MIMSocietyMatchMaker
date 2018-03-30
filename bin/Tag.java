public class Tag {
    private String f_name;
    private String l_name;
    private String [] parsed; //   = new String[10]

    public Tag(String f_name, String l_name){
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public Tag(String [] parsed){
        this.parsed = parsed;
        f_name = parsed[0];
        l_name = parsed[1];
    }

}
