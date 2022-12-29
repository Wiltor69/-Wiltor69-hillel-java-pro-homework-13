package hillel;

import java.io.File;

public class FileData {
    File file = new File("filename.txt");
    private long size;
    private  String fileName;
    private String filePath;

    public FileData(){

    }
    public FileData(File file) {

        this.file = file;
    }

    public FileData(String fileName) {
        this.fileName = fileName;

    }

    public long getSize() {

        return file.length();
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {

        return file.getAbsolutePath();
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "file=" + file +
                ", size=" + size +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
