package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.client.fx.SparkleParticleData;
import vazkii.botania.common.block.BlockModFlower;
import vazkii.botania.common.core.handler.ConfigHandler;

import java.util.Random;

import net.minecraft.block.AbstractBlock.Properties;

import javax.annotation.Nonnull;

public class BlockModFlowerExtended extends FlowerBlock implements IGrowable {
    public final ExtendedDyeColors color;

    protected BlockModFlowerExtended(ExtendedDyeColors color, Properties builder) {
        super(effectForFlower(color), 4, builder);
        this.color = color;
    }

    private static Effect effectForFlower(ExtendedDyeColors color) {
        switch (color) {
            case NAVY:
                return Effects.DOLPHINS_GRACE;
            case AMBER:
                return Effects.FIRE_RESISTANCE;
            case PALE_PINK:
                return Effects.HEALTH_BOOST;
            case SKY_BLUE:
                return Effects.JUMP_BOOST;
            case PALE_YELLOW:
                return Effects.ABSORPTION;
            case PALE_GREEN:
                return Effects.POISON;
            case CREAM:
                return Effects.REGENERATION;
            case SLATE_GRAY:
                return Effects.RESISTANCE;
            case BEIGE:
                return Effects.WEAKNESS;
            case INDIGO:
                return Effects.WATER_BREATHING;
            case VIOLET:
                return Effects.SPEED;
            case DARK_GREEN:
                return Effects.HASTE;
            case HOT_PINK:
                return Effects.GLOWING;
            case FOREST_GREEN:
                return Effects.HUNGER;
            case MAROON:
                return Effects.STRENGTH;
            case OLIVE:
                return Effects.LUCK;
        }
        return Effects.REGENERATION;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        int hex = color.getColorValue();
        int r = (hex & 0xFF0000) >> 16;
        int g = (hex & 0xFF00) >> 8;
        int b = hex & 0xFF;
        Vector3d offset = state.getOffset(world, pos);
        double x = pos.getX() + offset.x;
        double y = pos.getY() + offset.y;
        double z = pos.getZ() + offset.z;

        if (rand.nextDouble() < ConfigHandler.CLIENT.flowerParticleFrequency.get()) {
            SparkleParticleData data = SparkleParticleData.sparkle(rand.nextFloat(), r / 255F, g / 255F, b / 255F, 5);
            world.addParticle(data, x + 0.3 + rand.nextFloat() * 0.5, y + 0.5 + rand.nextFloat() * 0.5, z + 0.3 + rand.nextFloat() * 0.5, 0, 0, 0);
        }
    }

    @Override
    public boolean canGrow(@Nonnull IBlockReader world, @Nonnull BlockPos pos, @Nonnull BlockState state, boolean fuckifiknow) {
        return world.getBlockState(pos.up()).isAir(world, pos);
    }

    @Override
    public boolean canUseBonemeal(@Nonnull World world, @Nonnull Random rand, @Nonnull BlockPos pos, @Nonnull BlockState state) {
        return canGrow(world, pos, state, false);
    }

    @Override
    public void grow(@Nonnull ServerWorld world, @Nonnull Random rand, @Nonnull BlockPos pos, @Nonnull BlockState state) {
        Block block = BotaniaBlocksExtended.getDoubleFlower(color);
        if (block instanceof DoublePlantBlock) {
            ((DoublePlantBlock) block).placeAt(world, pos, 3);
        }
    }
}