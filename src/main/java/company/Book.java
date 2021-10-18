package company;

public abstract class Book extends Paper implements Borrow{

    private String ISBN;

    protected Book(String name,String Author,String ISBN){
        super(name, Author);
        this.ISBN=ISBN;
    }

    public String read(){
        return "Wow this is a good book";
    }

    public abstract String store();

    public String borrowItem(){
        return "You have borrowed a book";
    }

    public String getISBN() {return ISBN;}

    public void setISBN(String ISBN) {this.ISBN = ISBN;}

}
