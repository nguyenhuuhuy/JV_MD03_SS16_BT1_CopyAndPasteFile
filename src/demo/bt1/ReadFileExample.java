package demo.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileExample {
    public List<String> readFileText(String filePath){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e){
            System.out.println("File không tồn tại!");
        }
    return list;
    }

    public void writeFile(String filePath,List<String> list){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("chuỗi vừa copy là: "+ list);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
