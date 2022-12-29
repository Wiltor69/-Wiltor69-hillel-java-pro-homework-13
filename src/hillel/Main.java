package hillel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

         FileData fd = new FileData("filename.txt");
        System.out.println("File name: " + fd.getFileName());
        System.out.println("File size: " + fd.getSize());
        System.out.println("File path: " + fd.getFilePath());

        System.out.println("---------------------------------------------------------------------------------------");
            FileNavigator fn = new FileNavigator();
            fn.add("README.md");
            fn.add("filename.txt");

        System.out.println(fn.hashMap);

        System.out.println("---------------------------------------------------------------------------------------");

        fn.find(new File("C:\\Hillel school\\HillelJavaProHomeWork13\\README.md"));
        fn.find(new File("C:\\Hillel school\\HillelJavaProHomeWork13\\filename.txt"));

        System.out.println("---------------------------------------------------------------------------------------");

        fn.filterBySize(54);

        System.out.println("---------------------------------------------------------------------------------------");

        fn.remove(new File("C:\\Hillel school\\HillelJavaProHomeWork13\\filename.txt"));

        System.out.println("---------------------------------------------------------------------------------------");

        
    }
}
