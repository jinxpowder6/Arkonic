package com.norako.arkonic.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab ARKONIC_TAB = new CreativeModeTab("arkonictab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
