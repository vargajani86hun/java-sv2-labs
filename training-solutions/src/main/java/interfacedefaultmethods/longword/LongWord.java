package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements  FileOperations {
    private Path longWordPath;

    public LongWord(Path longWordPath) {
        this.longWordPath = longWordPath;
    }

    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        List<String> lines = readFromFile(longWordPath);
        sb.append(lines.get(0));
        for (int i = 1; i < lines.size(); i++) {
            int lastCharIndex = lines.get(i).length() - 1;
            sb.append(lines.get(i).charAt(lastCharIndex));
        }
        return sb.toString();
    }
}
