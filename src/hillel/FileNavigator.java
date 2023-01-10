package hillel;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    public static final String PATH = "C:\\Hillel school\\HillelJavaProHomeWork13";
         HashMap<File, String> hashMap = new HashMap<>();

        public HashMap<File, String> add (String fileName){
           File file = new File(fileName);
            if(!file.isDirectory())
           hashMap.put(new File(file.getAbsolutePath()), fileName);

            return hashMap;
        }
            public  void find (File file){
            file.getParent();
                System.out.println(file.getName());

            }
            public void filterBySize(long size){
                for (Map.Entry<File,String> pair : hashMap.entrySet()){
                    if (pair.getValue().length() < size)
                    System.out.println(pair.getValue());

            }
        }

    public void remove(File file) {
            file.getAbsolutePath();
        hashMap.remove(file);
        System.out.println(hashMap);

    }
    public void readDir(){
            File dir = new File(PATH);
            File [] filles = dir.listFiles();
            if(filles==null){
                System.out.println("The file is not");
                return;
            }
        for (File file: filles) {
            System.out.println(file.getName());
        }

    }
}










