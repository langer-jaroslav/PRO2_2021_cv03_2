package cz.uhk.pro2.models.FileSavers;

public class CsvFileSaver implements FileSaver {
    private int number;
    @Override
    public void SaveToFile(int a) {
        number = a;
        System.out.println("saved");
    }

    @Override
    public int ReadFromFile() {
        return number;
    }

    public void foo(){

    }
}
