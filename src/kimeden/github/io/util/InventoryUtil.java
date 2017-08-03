package kimeden.github.io.util;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_5_R3.inventory.CraftInventoryBeacon;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.BeaconInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;


public class InventoryUtil {

    private String invKey;
    private String invTitle;
    private int invRow;
    private Inventory inventory;


    protected InventoryUtil() {
        // EMPTY CODE
    }
    public InventoryUtil(String invTitle, int invRow) {
        this.invRow = invRow < 1 ? 1:invRow;
        this.invRow = invRow > 6 ? 6:invRow;
        this.invTitle = invTitle;
        this.inventory = Bukkit.createInventory(null, this.invRow, this.invTitle);

        StringBuffer sb = new StringBuffer(100);
        sb.append(invTitle.hashCode()+(char)64);
        sb.append(invRow+(char)64);
        sb.append(UUID.randomUUID());
        this.invKey = sb.toString().trim();
    }


    @Override
    public String toString() {
        return "t: "+this.invTitle+", r: "+this.invRow;
    }
    public String getKey() {
        return this.invKey;
    }
    public Inventory getInv() {
        return this.inventory;
    }

}
