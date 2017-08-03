package kimeden.github.io.skr;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import kimeden.github.io.util.InventoryUtil;
import org.bukkit.event.Event;
import org.bukkit.inventory.Inventory;


public class EffCreateMenu extends SimpleExpression<InventoryUtil> {


    @Override
    protected InventoryUtil[] get(Event event) {
        return new InventoryUtil[0];
    }

    @Override
    public boolean isSingle() {
        return false;
    }

    @Override
    public Class<? extends InventoryUtil> getReturnType() {
        return InventoryUtil.class;
    }

    @Override
    public String toString(Event event, boolean b) {
        return null;
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        return false;
    }

}