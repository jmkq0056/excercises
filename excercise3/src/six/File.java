package six;
import java.util.Date;

public interface File {
    String getName();
    Date getCreationDate();
    long getFileSize();
    RegularFile getOldestRegularFile();
    RegularFile getNewestRegularFile();
}
