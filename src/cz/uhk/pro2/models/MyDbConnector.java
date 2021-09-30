package cz.uhk.pro2.models;

public class MyDbConnector {
    private static String connection;

    public static String GetConnection(){
        if(connection == null)
            connection = "SPOJENO";

        return connection;
    }
}
