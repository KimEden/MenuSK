package kimeden.github.io.util;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_5_R3.inventory.CraftInventoryBeacon;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.BeaconInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class InventoryUtil {

    private String invTitle;
    private int invRow;
    private Map<Integer, ItemStack> slots;


    protected InventoryUtil() {
        // EMPTY CODE
    }
    public InventoryUtil(String invTitle, int invRow) {
        this.invRow = invRow < 1 ? 1:invRow;
        this.invRow = invRow > 6 ? 6:invRow;
        this.invTitle = invTitle;
        this.slots = new HashMap<>();
    }


    @Override
    public String toString() {
        return "t: "+this.invTitle+", r: "+this.invRow;
    }
    public Map<Integer, ItemStack> getInv() {
        return this.slots;
    }

}
