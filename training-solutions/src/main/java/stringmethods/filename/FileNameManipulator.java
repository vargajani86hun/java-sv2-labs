package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName) {
        int i = fileName.indexOf('.');
        return fileName.substring(i);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        int i = fileName.length() - ext.length();
        return ext.equalsIgnoreCase(fileName.substring(i));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        String extension = findFileExtension(fileName);
        return fileName.replace(extension, extension.toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present, target);
    }

    public static void main(String[] args) {
        FileNameManipulator fnm = new FileNameManipulator();
        System.out.println(fnm.findLastCharacter("Nem vagy buta kis Vuk."));
        String fileName = "executable.exe";
        System.out.println(fnm.findFileExtension(fileName));

        String otherFileName = "script.SH";
        System.out.println(fnm.identifyFilesByExtension(".sh", otherFileName));
        String anotherFileName = "executable.MSI";
        System.out.println(fnm.identifyFilesByExtension(".exe", anotherFileName));

        System.out.println(fnm.compareFilesByName("Script.SH", otherFileName));
        System.out.println(fnm.compareFilesByName(fileName, anotherFileName));

        System.out.println(fnm.changeExtensionToLowerCase(anotherFileName));

        System.out.println(fnm.replaceStringPart(anotherFileName, "able", "installer"));

    }
}
