package org.thinkingstudio.tweakerge.compat;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkConstants;

@Mod(TweakergeCompatMod.MOD_ID)
public final class TweakergeCompatMod {
    public static final String MOD_ID = "tweakerge_compat";

    public TweakergeCompatMod() {
        ModLoadingContext.get().registerDisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true);
    }
}
