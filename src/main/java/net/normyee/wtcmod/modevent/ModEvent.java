package net.normyee.wtcmod.modevent;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.normyee.wtcmod.WtcMod;
import net.normyee.wtcmod.item.ModItems;

@Mod.EventBusSubscriber(modid = WtcMod.MODID)
public class ModEvent {

    @SubscribeEvent
    public static void gauntlet(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (player.isHolding(ModItems.CICONIA_GAUNTLET.get())) {
            player.getAbilities().flying = true;
            player.getAbilities().setFlyingSpeed(0.1f);



        }



    }




}

