package com.bideogaem.tecmocraft;

import com.bideogaem.tecmocraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tecmocraft implements ModInitializer {

    public static final String MOD_ID = "tutorial";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }

}
