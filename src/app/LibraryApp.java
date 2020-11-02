package app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v1.4";
        LibraryControl libraryControl = new LibraryControl();
        System.out.println(appName);
        libraryControl.controlLoop();
    }
}
