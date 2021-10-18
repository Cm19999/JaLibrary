package company;

public abstract class Computer extends Physical{

    Computer(String name){
        super(name);
    }


    public String use(){
        return "The internet is cool";
    }
}
