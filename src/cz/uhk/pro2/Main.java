package cz.uhk.pro2;

import cz.uhk.pro2.models.CalculationHistory;
import cz.uhk.pro2.models.FileSavers.CsvFileSaver;
import cz.uhk.pro2.models.FileSavers.FileSaver;
import cz.uhk.pro2.models.FileSavers.JsonFileSaver;
import cz.uhk.pro2.models.Helper;
import cz.uhk.pro2.models.MyDbConnector;
import cz.uhk.pro2.models.geometry.GeometryObject;
import cz.uhk.pro2.models.geometry.SquareGeometryObject;
import cz.uhk.pro2.models.geometry.TriangelGeometryObject;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    private static boolean SaveToJson = true;
    public static void main(String[] args) {
	// write your code here
        String spojeni = MyDbConnector.GetConnection();

        FileSaver saver;
        if(SaveToJson){
            saver = new JsonFileSaver();
        }
        else{
            saver = new CsvFileSaver();
        }
        saver.SaveToFile(10);
        System.out.println(saver.ReadFromFile());



        SquareGeometryObject square = new SquareGeometryObject(5,10);
        System.out.println("Obsah: "+square.obsah());

        TriangelGeometryObject triangel = new TriangelGeometryObject(1,2,3);
        System.out.println("Obsah: "+triangel.obsah());

        System.out.println(10);
        System.out.println("text");

        Helper.print(99);
        Helper.print("text");

        System.out.println(LocalDateTime.now());

        System.out.println(Helper.Sum(10,15));
        System.out.println(Helper.Sum(13,19));
        System.out.println(Helper.Sum(16,20));

        List<CalculationHistory> history = Helper.history;


        System.out.println(Helper.Sum(15.9,6));

    }
}
