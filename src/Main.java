import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
          File fileDir = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test");
        fileDir.mkdir();

        File file = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file3 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\test3.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File fileDir1 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test2");
        fileDir1.mkdir();

        File fileDir3 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test3");
        fileDir3.mkdir();
        File fileDir34 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test3\\Test4");
        fileDir34.mkdir();

        File fileDir345 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test3\\Test4\\Test5");
        fileDir345.mkdir();
        File file255= new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test3\\Test4\\Test5\\test25.txt");

        try {
            file255.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2= new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test2\\test2.txt");

        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file23= new File("C:\\Users\\Acer Nitro 5\\Desktop\\Test\\Test3\\test4.txt");

        try {
            file23.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
          ShoeAll.shoeAll(  fileDir );
        System.out.println("Hello world!");
    }
}