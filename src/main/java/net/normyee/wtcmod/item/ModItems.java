package net.normyee.wtcmod.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.normyee.wtcmod.WtcMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, WtcMod.MODID);

    public static final RegistryObject<Item> KAKERA = ITEMS.register("kakera",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_WTCMOD)));

    public static final RegistryObject<Item> RENA_AXE = ITEMS.register("rena_axe",
            () -> new AxeItem(ModTiers.KAKERA, 7, 0f, new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_WTCMOD)));

    public static final RegistryObject<Item> SATOSHI_BAT = ITEMS.register("satoshi_bat",
            () -> new AxeItem(ModTiers.KAKERA, 7, 0f, new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_WTCMOD)));

    public static final RegistryObject<Item> CICONIA_GAUNTLET = ITEMS.register("ciconia_gauntlet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_WTCMOD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
