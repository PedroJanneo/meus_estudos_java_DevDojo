package estudos.java.maratonajava.javacore.Minterfaces.test;


import estudos.java.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import estudos.java.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import estudos.java.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DatabaseLoader db = new DatabaseLoader();
        FileLoader fl = new FileLoader();
        db.load();
        fl.load();
        db.remove();
        fl.remove();

        db.checkPermission();
        fl.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
