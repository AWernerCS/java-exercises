package restaurant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Amanda on 3/13/2017.
 */
public class Menu {
    String lastUpdated;
    String secondLastUpdated;
    HashMap<String, MenuItem> storedMenu;

    public String getLastUpdated() {
        return lastUpdated;
    }
    // This setter sets the Date Last Updated and Last Updated.
    // Only accessible when a new menu item is added; cannot be
    // manually updated.
    private void setLastUpdated(String lastUpdated) {
        this.setSecondLastUpdated(lastUpdated);
        this.lastUpdated = lastUpdated;
    }

    public String getSecondLastUpdated() {
        return secondLastUpdated;
    }
    // Only accessible via AddAStoredMenu -> setLastUpdated ->
    // setSecondLastUpdated.
    private void setSecondLastUpdated(String aSecondLastUpdated) {
        this.secondLastUpdated = aSecondLastUpdated;
    }

    public HashMap<String, MenuItem> getStoredMenu() {
        return storedMenu;
    }
    // When an item is added to the menu, the last updated
    // for the menu should be automatically updated.
    // Items with a date between the secondLastUpdated and lastUpdated are "new."
    // We are using a HashMap to make cash register,
    // inventory, website, and other programs more efficient
    // in the future.
    public void addAStoredMenu(MenuItem aMenuItem) {
        this.storedMenu.put(aMenuItem.getName(), aMenuItem);
        this.setLastUpdated(formatDate(new Date()));
    }

    // Formats a given date as a string (MM-dd-yyyy). We don't need
    // to store changes longer than a day, yesterday to today would be "new" but no need
    // to clear things out after 5 minutes.
    public String formatDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(date);
    }
}
