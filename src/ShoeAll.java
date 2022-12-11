import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoeAll {
    public static void shoeAll(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length == 0) {
            file.delete();
            return;
        }
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                } else {
                    shoeAll(f);
                }
            }
        }
        shoeAll(file);
    }
}
