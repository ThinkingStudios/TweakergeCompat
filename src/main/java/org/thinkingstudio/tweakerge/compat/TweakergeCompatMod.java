package org.thinkingstudio.tweakerge.compat;

import net.minecraftforge.fml.common.Mod;

@Mod(TweakergeCompatMod.MOD_ID)
public final class TweakergeCompatMod {
    public static final String MOD_ID = "tweakerge_compat";

    public TweakergeCompatMod() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like registries and resources) may still be uninitialized.
        // Proceed with mild caution.
    }
}
