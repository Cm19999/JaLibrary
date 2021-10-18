package company;

public class Laptop extends Computer implements Borrow{


    Laptop(String name){
        super(name);
    }

    public String store(){
        return "Put this back with the laptops";
    }

    public String borrowItem(){
        return "You have borrowed a laptop";
    }

    public LibraryArtifact returnItem(){
        return (this);
    }
}

