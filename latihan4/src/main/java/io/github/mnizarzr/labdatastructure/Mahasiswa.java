package io.github.mnizarzr.labdatastructure;

import java.lang.reflect.Field;

public class Mahasiswa {

    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nama, String kelas, String matkulPraktikum, int nim) {
        this.nama            = nama;
        this.kelas           = kelas;
        this.matkulPraktikum = matkulPraktikum;
        this.nim             = nim;
    }

    @Override
    public String toString() {
        StringBuilder result  = new StringBuilder();
        String        newLine = System.getProperty("line.separator");

        result.append(this.getClass().getSimpleName());
        result.append(" {");
        result.append(newLine);

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            result.append("\t");
            try {
                result.append(field.getName());
                result.append(": ");
                result.append(field.get(this));
            } catch (IllegalAccessException ex) {
                System.err.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }
}
