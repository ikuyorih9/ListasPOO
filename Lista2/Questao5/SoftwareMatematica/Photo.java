
import java.util.*;

public class Photo {

    public Photo(Date Data, String Path) {

        this.Data = Data;
        this.Path = Path;

    }

    private Date Data;
    private String Path;

    public Date getData() {
        return Data;
    }

    public String getPath() {
        return Path;
    }

}