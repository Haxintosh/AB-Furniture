package com.haxintosh.ab_furniture.init;

import com.haxintosh.ab_furniture.furniture;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class itemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, furniture.MOD_ID);

    public static final RegistryObject<Item> improved_wood = register("improved_wood", () -> new Item(new Item.Properties().tab(furniture.FURNITURE_TAB)));
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
