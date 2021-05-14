package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.recipe.ICustomApothecaryColor;

import javax.annotation.Nonnull;

public class ItemPetalExtended extends BlockItem implements ICustomApothecaryColor {
    public final ExtendedDyeColors color;

    public ItemPetalExtended(Block buriedPetals, ExtendedDyeColors color, Properties props) {
        super(buriedPetals, props);
        this.color = color;
    }

    @Nonnull
    @Override
    public String getTranslationKey() {
        // Don't take name of the block
        return getDefaultTranslationKey();
    }

    @Override
    public int getParticleColor(ItemStack stack) {
        return color.getColorValue();
    }
}

