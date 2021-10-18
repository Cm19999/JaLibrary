package company;

import java.util.ArrayList;

public abstract class LibraryArtifact {


    private String name;

    protected LibraryArtifact(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
