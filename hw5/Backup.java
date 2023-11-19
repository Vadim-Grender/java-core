import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Backup {

    public static void main(String[] args) {
        createBackup();
    }
    public static void createBackup() {

        String currentDirectory = ".";

        File backupDir = new File("D:", "backup");
        if (!backupDir.exists()) {
            if (backupDir.mkdir()) {
                System.out.println("Папка backup успешно создана.");
            } else {
                System.out.println("Ошибка при создании папки backup.");
                return;
            }
        }

        processDirectory(new File(currentDirectory), backupDir);

        System.out.println("Резервные копии созданы в папке backup.");
    }

    private static void processDirectory(File sourceDir, File targetDir) {
        File[] files = sourceDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    copyFile(file, new File(targetDir, file.getName()));
                } else if (file.isDirectory()) {
                    File newTargetDir = new File(targetDir, file.getName());
                    if (newTargetDir.mkdir()) {
                        processDirectory(file, newTargetDir);
                    }
                }
            }
        }
    }

    private static void copyFile(File source, File target) {
        try {
            Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Создана копия файла: " + source.getName());
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла " + source.getName() + ": " + e.getMessage());
        }
    }
}