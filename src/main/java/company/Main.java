package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryArtifact> totalLibraryCollection = new ArrayList<>();


        Hardback p1 = new Hardback("DVD","Dave","1");
        System.out.println(p1.use());
        System.out.println(p1.store());
        totalLibraryCollection.add(p1.returnItem());
        System.out.println(p1.read());
        System.out.println(totalLibraryCollection);





        Paperback p2 = new Paperback("yep","Geoff","2");
        totalLibraryCollection.add(p2.returnItem());
        System.out.println(totalLibraryCollection);

    }
}
