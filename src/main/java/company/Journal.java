package company;

public class Journal extends Document implements Borrow{

    Journal(String name, String Author){
        super(name,Author);
    }


    @Override
    public String toString() {
        return "Journal{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                '}';
    }

    public String store(){
            return "Store this with the other journals";
        }


        @Override
    public String use(){
        return "What an informative journal";
    }


    public String borrowItem(){
        return "You have borrowed a journal";
    }


    public LibraryArtifact returnItem() {
        return (this);
    }
}
