import Data.Notes;
import database.DatabaseManager;
import views.Console;

public class Start {

    public void start() {
        DatabaseManager databaseManager = new DatabaseManager();
        Notes notes = new Notes(databaseManager);
        Console console = new Console(notes);
    }
}
