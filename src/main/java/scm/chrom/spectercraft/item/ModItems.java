package scm.chrom.spectercraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import scm.chrom.spectercraft.SpecterCraft;
import net.minecraft.util.Identifier;


public class ModItems {
    //Itemy (Skopiuj by dodać nowy):
    public static final Item SPECTER_INGOT = registerItem("specter_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_SOUL = registerItem("raw_soul", new Item(new FabricItemSettings()));
    //===================================================================================================
    private static void addItemsToIgredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPECTER_INGOT);
        entries.add(RAW_SOUL);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SpecterCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SpecterCraft.LOGGER.info("Registering Mod Items for " + SpecterCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIgredientItemGroup);
    }
}
