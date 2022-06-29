package com.haxintosh.ab_furniture.init;

import com.google.common.base.Function;
import com.haxintosh.ab_furniture.furniture;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.function.Supplier;

public class blockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            furniture.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = itemInit.ITEMS;

    public static final RegistryObject<Block> DRAWER_OAK = register("drawer_oak",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.QUARTZ)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(2)
                    .strength(2)
                    .sound(SoundType.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }




}