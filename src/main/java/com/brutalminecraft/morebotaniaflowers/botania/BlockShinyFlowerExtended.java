package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import vazkii.botania.api.item.IHornHarvestable;

import javax.annotation.Nonnull;

import net.minecraft.block.AbstractBlock.Properties;
import vazkii.botania.api.item.IHornHarvestable.EnumHornType;
import vazkii.botania.common.block.decor.BlockShinyFlower;

public class BlockShinyFlowerExtended extends BlockModFlowerExtended implements IHornHarvestable {

    public BlockShinyFlowerExtended(ExtendedDyeColors color, Properties builder) {
        super(color, builder);
    }

    @Override
    public boolean canGrow(@Nonnull IBlockReader world, @Nonnull BlockPos pos, @Nonnull BlockState state, boolean fuckifiknow) {
        return false;
    }

    @Override
    public boolean canHornHarvest(World world, BlockPos pos, ItemStack stack, EnumHornType hornType) {
        return false;
    }

    @Override
    public boolean hasSpecialHornHarvest(World world, BlockPos pos, ItemStack stack, EnumHornType hornType) {
        return false;
    }

    @Override
    public void harvestByHorn(World world, BlockPos pos, ItemStack stack, EnumHornType hornType) {}

}
