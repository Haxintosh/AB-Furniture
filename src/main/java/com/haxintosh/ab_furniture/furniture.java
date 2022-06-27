package com.haxintosh.ab_furniture;

import com.haxintosh.ab_furniture.init.itemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.system.CallbackI;

@Mod("ab_furniture")
public class furniture{
    public static final String MOD_ID = "ab_furniture";
    //create tab
    public static final ItemGroup FURNITURE_TAB = new ItemGroup(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(itemInit.improved_wood.get());
        }
    };
    public furniture(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        itemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}