package net.la.lega.mod.item;

import net.la.lega.mod.initializer.LItems;
import net.la.lega.mod.loader.LLoader;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class RiceOilBottle extends Item
{
    public static final Identifier ID = new Identifier(LLoader.MOD_ID, "rice_oil_bottle");
    
    public RiceOilBottle()
    {
        super(new Settings().group(LItems.JAPAN_RELATED));
    }
}
