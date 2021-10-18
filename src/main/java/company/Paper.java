package company;

public abstract class Paper extends Physical{

    private String Author;
    private int pages;

    protected Paper(String name, String[] Author) {
        super(name);
    }

    protected Paper (String name, String Author){
        super(name);
        this.Author=Author;
    }


    public String use(){
        return  "Flicks through pages...";
    }


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPages() {return pages;}

    public void setPages(int pages) {this.pages = pages;}
}
