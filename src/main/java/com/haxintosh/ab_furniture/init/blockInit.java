package com.haxintosh.ab_furniture.init;

import com.google.common.base.Function;
import com.haxintosh.ab_furniture.furniture;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class blockInit {
    // DeferredRegister
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, furniture.MOD_ID);

    // Block
    public static final RegistryObject<Block> DRAWER_OAK = BLOCKS.register("drawer_oak",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.QUARTZ)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(-1)
                    .strength(2)
                    .sound(SoundType.WOOD)));
}