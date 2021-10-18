package company;

public class Audiobook extends Digital{

    public Audiobook(String name){
        super(name);
    }

    public String use(){
        return "Wow that sounds very interesting!";
    }
}
