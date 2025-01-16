package six;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Directory implements File {
    private String name;
    private Date creationDate;
    private long fileSize; // Sum of sizes of all subfiles
    private List<File> subFiles;

    public Directory(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.fileSize = 0;
        this.subFiles = new ArrayList<>();
    }

    public void addFile(File file) {
        subFiles.add(file);
        fileSize += file.getFileSize();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public long getFileSize() {
        return fileSize;
    }

    @Override
    public RegularFile getOldestRegularFile() {
        // Initialize a variable to hold the oldest regular file found so far.
        RegularFile oldest = null;

        // Iterate over each file in the subFiles list (could be regular files or directories).
        for (File file : subFiles) {
            // Recursively find the oldest regular file in the current file or directory.
            RegularFile currentOldest = file.getOldestRegularFile();

            // If a regular file is found, check if it's the oldest.
            if (currentOldest != null) {
                // If oldest is null (no oldest found yet) or current file is older, update oldest.
                if (oldest == null || currentOldest.getCreationDate().before(oldest.getCreationDate())) {
                    oldest = currentOldest;
                }
            }
        }

        // Return the oldest regular file found, or null if no regular files exist.
        return oldest;
    }

    @Override
    public RegularFile getNewestRegularFile() {
        // Initialize a variable to hold the newest regular file found so far.
        RegularFile newest = null;

        // Iterate over each file in the subFiles list (could be regular files or directories).
        for (File file : subFiles) {
            // Recursively find the newest regular file in the current file or directory.
            RegularFile currentNewest = file.getNewestRegularFile();

            // If a regular file is found, check if it's the newest.
            if (currentNewest != null) {
                // If newest is null (no newest found yet) or current file is newer, update newest.
                if (newest == null || currentNewest.getCreationDate().after(newest.getCreationDate())) {
                    newest = currentNewest;
                }
            }
        }

        // Return the newest regular file found, or null if no regular files exist.
        return newest;
    }
}
