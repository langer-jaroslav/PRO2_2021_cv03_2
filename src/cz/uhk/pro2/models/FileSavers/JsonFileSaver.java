package cz.uhk.pro2.models.FileSavers;

import cz.uhk.pro2.models.MyDbConnector;

public class JsonFileSaver implements FileSaver {
    private int myNumber;

    @Override
    public void SaveToFile(int a) {
        String spojeni = MyDbConnector.GetConnection();

        myNumber = a;
        System.out.println("saved to JSON");
    }

    @Override
    public int ReadFromFile() {
        return myNumber;
    }
}
