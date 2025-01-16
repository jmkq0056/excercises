package six;
import java.util.Date;

public class RegularFile implements File {
    private String name;
    private Date creationDate;
    private long fileSize;

    public RegularFile(String name, Date creationDate, long fileSize) {
        this.name = name;
        this.creationDate = creationDate;
        this.fileSize = fileSize;
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
        return this;
    }

    @Override
    public RegularFile getNewestRegularFile() {
        return this;
    }
}
