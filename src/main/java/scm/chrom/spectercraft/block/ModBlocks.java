package scm.chrom.spectercraft.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import scm.chrom.spectercraft.SpecterCraft;


public class ModBlocks {

    public static final Block ACID = registerBlock("acid",
            new Block(AbstractBlock.Settings.create()
                    .strength(1F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SpecterCraft.MOD_ID, name), block);
    }

    private  static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SpecterCraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SpecterCraft.LOGGER.info("Registering Mod Blocks for" + SpecterCraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ACID);
        });
    }
}
