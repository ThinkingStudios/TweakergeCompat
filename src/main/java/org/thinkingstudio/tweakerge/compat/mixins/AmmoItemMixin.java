package org.thinkingstudio.tweakerge.compat.mixins;

import com.tacz.guns.item.AmmoItem;
import fi.dy.masa.tweakeroo.util.IItemStackLimit;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AmmoItem.class)
public abstract class AmmoItemMixin implements IItemStackLimit {
    @Shadow public abstract int getItemStackLimit(ItemStack stack);

    @Override
    public int getMaxStackSize(ItemStack itemStack) {
        return getItemStackLimit(itemStack);
    }
}
