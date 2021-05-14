package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.client.fx.SparkleParticleData;
import vazkii.botania.common.block.decor.BlockBuriedPetals;

import javax.annotation.Nonnull;
import java.util.Random;

public class BlockBuriedPetalsExtended extends BushBlock implements IGrowable {

    private static final VoxelShape SHAPE = makeCuboidShape(0, 0, 0, 16, 1.6, 16);
    public final ExtendedDyeColors color;

    public BlockBuriedPetalsExtended(ExtendedDyeColors color, Properties builder) {
        super(builder);
        this.color = color;
    }

    @Nonnull
    public VoxelShape getShape(BlockState state, @Nonnull IBlockReader world, @Nonnull BlockPos pos, ISelectionContext ctx) {
        return SHAPE;
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        int hex = this.color.getColorValue();
        int r = (hex & 16711680) >> 16;
        int g = (hex & '\uff00') >> 8;
        int b = hex & 255;
        SparkleParticleData data = SparkleParticleData.noClip(rand.nextFloat(), (float)r / 255.0F, (float)g / 255.0F, (float)b / 255.0F, 5);
        world.addParticle(data, (double)pos.getX() + 0.3D + (double)rand.nextFloat() * 0.5D, (double)pos.getY() + 0.1D + (double)rand.nextFloat() * 0.1D, (double)pos.getZ() + 0.3D + (double)rand.nextFloat() * 0.5D, 0.0D, 0.0D, 0.0D);
    }

    @Nonnull
    public BlockRenderType getRenderShape(BlockState state) {
        return BlockRenderType.INVISIBLE;
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
