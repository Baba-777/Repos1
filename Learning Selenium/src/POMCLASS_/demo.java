package POMCLASS_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo {
    public static void main(String[] args) throws IOException {
	
        FileInputStream fs= new FileInputStream("./Properties/data0.properties");
	
        Properties ps = new Properties();
        ps.load(fs);

        ps.put("URL", "https://demoapps.qspiders.com/");
        ps.put("Username", "baba");
        ps.put("Password", "baba@777");
	
        System.out.println(ps.getProperty("URL"));
        System.out.println(ps.getProperty("Username"));
        System.out.println(ps.getProperty("Password"));
	
        FileOutputStream ft = new FileOutputStream("./Properties/data0.properties");
        ps.store(ft, "data is successfully written :)");
        ft.close(); // Always close the FileOutputStream after using it
        System.out.println("Data is successfully written");
    }
}
