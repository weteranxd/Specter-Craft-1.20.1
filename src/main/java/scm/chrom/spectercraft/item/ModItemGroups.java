package scm.chrom.spectercraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import scm.chrom.spectercraft.SpecterCraft;

public class ModItemGroups {

    public static final ItemGroup SPECTER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpecterCraft.MOD_ID, "Specter"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.specter"))
                    .icon(() -> new ItemStack(ModItems.SPECTER_INGOT)).entries((displayContext, entries) -> {

                    }).build());

    public static void registerItemsGroups() {
        SpecterCraft.LOGGER.info("Registering Item Groups for " + SpecterCraft.MOD_ID);
    }
}
