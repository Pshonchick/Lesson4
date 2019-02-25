import java.io.File;

public class Newfolder {
    public static void main(String[] args) {
        String lookingFor = "ДЗ.txt";
        final String FOLDER_NAME = "C:\\GoIT\\Домашка";
        File folder = new File(FOLDER_NAME);
        String result = findFile(lookingFor, folder);
        if ("".equals(result)) {
            System.out.println("File doesn't exist");
        } else {
            System.out.println("File path is:" + result);
        }
    }
    private static String findFile(String lookingFor, File folder) {
        String found = "";
        for (File f : folder.listFiles()) {
            if (f.isDirectory()) {
                found = findFile(lookingFor, f);
            } else {
                if (lookingFor.equals(f.getName())) {
                    found = folder.getAbsolutePath();
                    break;
                }

            }

        }
        return found;
    }
}
