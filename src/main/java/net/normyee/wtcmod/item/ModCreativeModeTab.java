package net.normyee.wtcmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_WTCMOD = new CreativeModeTab("wtcmodtab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.KAKERA.get());
    }
};
}
