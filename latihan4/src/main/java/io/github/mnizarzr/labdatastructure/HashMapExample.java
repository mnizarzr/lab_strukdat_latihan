package io.github.mnizarzr.labdatastructure;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Mahasiswa> hmMhs = new HashMap<>();
        hmMhs.put("1", new Mahasiswa("Muhammad", "I", "Struktur Data", 2021361));
        hmMhs.put("2", new Mahasiswa("Nizar", "B", "Basis Data", 1037361));
        hmMhs.put("3", new Mahasiswa("Zulmi", "F", "Sistem Operasi", 311361));

        System.out.print("Masukkan ID: ");
        Mahasiswa selectedMhs = hmMhs.get(scanner.nextLine());
        if (selectedMhs != null) {
            System.out.println(selectedMhs);
        }
    }

}
