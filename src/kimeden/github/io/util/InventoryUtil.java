package kimeden.github.io.util;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_5_R3.inventory.CraftInventoryBeacon;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.BeaconInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;


public class InventoryUtil {

    private String invTitle;
    private int invRow;
    private Inventory inventory;


    protected InventoryUtil() {
        // EMPTY CODE
    }
    public InventoryUtil(String invTitle, int invRow) {
        this.invTitle = invTitle;
        this.invRow = checkRow();
        this.inventory = createInv();
    }


    @Override
    public String toString() {
        return "t: "+this.invTitle+", r:"+this.invRow;
    }

    private int checkRow() {
        int result = 1;

        result = this.invRow < 1 ? 1:this.invRow;
        result = this.invRow > 6 ? 6:this.invRow;
        return result;
    }
    private Inventory createInv() {
        return Bukkit.createInventory(null, this.invRow, this.invTitle);
    }

}
