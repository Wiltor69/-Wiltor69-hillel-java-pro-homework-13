package hillel;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

         HashMap<File, String> hashMap = new HashMap<>();

        public HashMap<File, String> add (String fileName){
           File file = new File(fileName);

           hashMap.put(new File(file.getAbsolutePath()), fileName);

            return hashMap;
        }
            public  void find (File file){
            file.getAbsolutePath();
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
}










