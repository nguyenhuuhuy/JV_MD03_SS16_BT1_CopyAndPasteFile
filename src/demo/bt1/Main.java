package demo.bt1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        String PATH_FILE = "src/demo/bt1/file.text";
        String PATH_COPYFILE = "src/demo/bt1/copyFile.text";

        List<String> list = readFileExample.readFileText(PATH_FILE);

        readFileExample.writeFile(PATH_COPYFILE,list);

    }
}
