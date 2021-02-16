package com.bideogaem.tecmocraft.registry;

import com.bideogaem.tecmocraft.Tecmocraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLACK_SAND = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Tecmocraft.MOD_ID, "black_sand"), BLACK_SAND);
    }
}
