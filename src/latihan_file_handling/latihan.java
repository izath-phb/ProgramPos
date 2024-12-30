/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_file_handling;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Lenovo
 */
public class latihan {
    public static void main(String[] args) {
        // Define the root directory and file structure
        String rootDir = "Root";

        // Define folders and files to be created
        String[] folders = {"classes", "template"};
        String[] files = {
            "project.conf",
            "manifest.mf",
            "classes/Test.java",
            "classes/TestImpl.java",
            "template/enter.txt",
            "template/exit.txt"
        };

        // Create the root directory
        File root = new File(rootDir);
        if (root.mkdir()) {
            System.out.println("Created root directory: " + root.getAbsolutePath());
        } else {
            System.out.println("Root directory already exists or could not be created.");
        }

        // Create folders inside the root directory
        for (String folder : folders) {
            File dir = new File(rootDir + File.separator + folder);
            if (dir.mkdir()) {
                System.out.println("Created folder: " + dir.getAbsolutePath());
            } else {
                System.out.println("Folder " + dir.getName() + " already exists or could not be created.");
            }
        }

        // Create files inside the root directory and subdirectories
        for (String filePath : files) {
            File file = new File(rootDir + File.separator + filePath);
            try {
                if (file.getParentFile() != null && !file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (file.createNewFile()) {
                    System.out.println("Created file: " + file.getAbsolutePath());
                } else {
                    System.out.println("File " + file.getName() + " already exists or could not be created.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + file.getName() + " - " + e.getMessage());
            }
        }

        System.out.println("File and folder structure creation completed.");
        
        // Create files inside the root directory and subdirectories
        for (String filePath : files) {
            File file = new File(rootDir + File.separator + filePath);
            try {
                if (file.getParentFile() != null && !file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (file.createNewFile()) {
                    System.out.println("Created file: " + file.getAbsolutePath());
                } else {
                    System.out.println("File " + file.getName() + " already exists or could not be created.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + file.getName() + " - " + e.getMessage());
            }
        }

        // Move "project.conf" to "template" folder
        File projectConf = new File(rootDir, "project.conf");
        File templateFolder = new File(rootDir, "template");
        if (projectConf.exists() && templateFolder.exists()) {
            File newLocation = new File(templateFolder, projectConf.getName());
            if (projectConf.renameTo(newLocation)) {
                System.out.println("Moved file: " + projectConf.getPath() + " to " + newLocation.getPath());
            } else {
                System.out.println("Failed to move file: " + projectConf.getPath());
            }
        } else {
            System.out.println("Either 'project.conf' or 'template' folder does not exist.");
        }

        // Delete "Test.java"
        File testJava = new File(rootDir + "/classes", "Test.java");
        if (testJava.exists()) {
            if (testJava.delete()) {
                System.out.println("Deleted file: " + testJava.getPath());
            } else {
                System.out.println("Failed to delete file: " + testJava.getPath());
            }
        } else {
            System.out.println("File 'Test.java' does not exist.");
        }

        System.out.println("File and folder structure update completed.");
    }
}
    
   
