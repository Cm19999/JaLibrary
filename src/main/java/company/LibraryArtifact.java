package company;

import java.util.ArrayList;

public abstract class LibraryArtifact {



    protected ArrayList<Object> libraryCollection= new ArrayList<>();

    private String name;

    protected LibraryArtifact(String name){this.name = name;}


    public abstract String use();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getLibraryCollection() {
        return libraryCollection;
    }

    public void setLibraryCollection(ArrayList<Object> libraryCollection) {
        this.libraryCollection = libraryCollection;
    }
}
