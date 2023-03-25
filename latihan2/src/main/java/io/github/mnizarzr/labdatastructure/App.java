package io.github.mnizarzr.labdatastructure;

import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedList<String> hewan = new LinkedList<>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));
        LinkedList<String> deletedHewan = new LinkedList<>(Arrays.asList("Kelinci", "Kambing", "Unta"));

        System.out.println("Hewan: " + hewan);
        System.out.println("Hewan yang dihapus: " + deletedHewan);

//        for (String delEl : deletedHewan) {
//            hewan.remove(delEl);
//        }

        hewan.removeAll(deletedHewan);

        System.out.println("Hasil hewan: " + hewan);

    }
}
