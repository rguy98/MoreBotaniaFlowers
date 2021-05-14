package com.brutalminecraft.morebotaniaflowers.botania;

import vazkii.botania.common.block.BlockMod;

public class BlockPetalBlockExtended extends BlockMod {

    public final ExtendedDyeColors color;

    public BlockPetalBlockExtended(ExtendedDyeColors color, Properties builder) {
        super(builder);
        this.color = color;
    }

    public int getColor(){
        return color.getColorValue();
    }
}
