package hillel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String PATH = "C:\\Hillel school\\HillelJavaProHomeWork13";
    public static void main(String[] args) {
        File file = new File(PATH);
         FileData fd = new FileData("README.md");
        System.out.println("File name: " + fd.getFileName());
        System.out.println("File size: " + fd.getSize());
        System.out.println("File path: " + fd.PATH);


        System.out.println("---------------------------------------------------------------------------------------");
            FileNavigator fn = new FileNavigator();
            fn.add("README.md");
            fn.add("filename.txt");
            fn.add("test.txt");

        System.out.println(fn.hashMap);

        System.out.println("---------------------------------------------------------------------------------------");

        fn.find(new File(file,"README.md"));
        fn.find(new File(file, "filename.txt"));
        fn.find(new File(file, "test.txt"));

        System.out.println("---------------------------------------------------------------------------------------");

        fn.filterBySize(54);

        System.out.println("---------------------------------------------------------------------------------------");

        fn.remove(new File(file, "filename.txt"));

        System.out.println("---------------------------------------------------------------------------------------");

        fn.readDir();
        
    }
}
