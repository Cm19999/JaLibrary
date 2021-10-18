package company;

public class Paperback extends Book implements Borrow{

    public Paperback(String name,String Author,String ISBN){
        super(name,Author,ISBN);
    }


    @Override
    public String toString() {
        return "Paperback{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                " ISBN='" + this.getISBN() + '\'' +
                '}';
    }

    public String store(){ return "Put this with the paperback books";}

@Override
    public String borrowItem()  {
        return "You have borrowed a paperback";

    }
    public LibraryArtifact returnItem() {
        return (this);
    }



}
