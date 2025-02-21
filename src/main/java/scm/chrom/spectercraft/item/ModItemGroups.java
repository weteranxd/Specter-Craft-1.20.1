package scm.chrom.spectercraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import scm.chrom.spectercraft.SpecterCraft;
import scm.chrom.spectercraft.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SPECTER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpecterCraft.MOD_ID, "specter"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.specter"))
                    .icon(() -> new ItemStack(ModItems.SPECTER_INGOT)).entries((displayContext, entries) -> {
                        // Skopiuj i wklej by dodać do zakładki moda!
                        entries.add(ModItems.SPECTER_INGOT);
                        entries.add(ModItems.RAW_SOUL);
                        entries.add(ModItems.ENERGY_ORB);
                        entries.add(ModItems.SPECTER_SHOVEL);
                        entries.add(ModItems.SOUL);
                        entries.add(ModBlocks.ACID);
                        entries.add(ModBlocks.ERROR_BLOCK);
                        //=============================================================
                    }).build());

    public static void registerItemsGroups() {
        SpecterCraft.LOGGER.info("Registering Item Groups for " + SpecterCraft.MOD_ID);
    }
}
