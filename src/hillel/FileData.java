package hillel;

import java.io.File;

public class FileData {
    public static final String PATH = "C:\\Hillel school\\HillelJavaProHomeWork13";
    File file = new File(PATH);
    private long size = 0;
    private  String fileName;


    public FileData(){

    }
    public FileData(File file) {

        this.file = file;
    }

    public FileData(String fileName) {
        this.fileName = fileName;

    }

    public long getSize() {
        size = file.getName().length();
        return size;
    }



    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public String toString() {
        return "FileData{" +
                "file=" + file +
                ", size=" + size +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + PATH + '\'' +
                '}';
    }
}
