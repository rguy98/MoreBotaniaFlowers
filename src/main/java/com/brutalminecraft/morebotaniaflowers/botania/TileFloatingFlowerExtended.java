package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.Direction;
import net.minecraftforge.client.model.ModelDataManager;
import net.minecraftforge.client.model.data.IModelData;
import net.minecraftforge.client.model.data.ModelDataMap;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import vazkii.botania.api.capability.FloatingFlowerImpl;
import vazkii.botania.api.item.IFloatingFlower;
import vazkii.botania.api.state.BotaniaStateProps;
import vazkii.botania.api.subtile.TileEntitySpecialFlower;
import vazkii.botania.common.block.tile.ModTiles;
import vazkii.botania.common.block.tile.TileMod;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TileFloatingFlowerExtended extends TileMod {
    private static final String TAG_FLOATING_DATA = "floating";
    private final IFloatingFlower floatingData = new FloatingFlowerImpl() {
        @Override
        public ItemStack getDisplayStack() {
            Block b = getBlockState().getBlock();
            if (b instanceof BlockFloatingFlowerExtended) {
                return new ItemStack(BotaniaBlocksExtended.getShinyFlower(((BlockFloatingFlowerExtended) b).color));
            } else {
                return ItemStack.EMPTY;
            }
        }
    };
    private final LazyOptional<IFloatingFlower> floatingDataCap = LazyOptional.of(() -> floatingData);

    public TileFloatingFlowerExtended() {
        super(ModTiles.MINI_ISLAND);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == TileEntitySpecialFlower.FLOATING_FLOWER_CAP) {
            return floatingDataCap.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket packet) {
        IFloatingFlower.IslandType oldType = floatingData.getIslandType();
        super.onDataPacket(net, packet);
        if (oldType != floatingData.getIslandType()) {
            ModelDataManager.requestModelDataRefresh(this);
            world.notifyBlockUpdate(getPos(), getBlockState(), getBlockState(), 0);
        }
    }

    @Override
    public void writePacketNBT(CompoundNBT cmp) {
        cmp.put(TAG_FLOATING_DATA, TileEntitySpecialFlower.FLOATING_FLOWER_CAP.writeNBT(floatingData, null));
    }

    @Override
    public void readPacketNBT(CompoundNBT cmp) {
        TileEntitySpecialFlower.FLOATING_FLOWER_CAP.readNBT(floatingData, null, cmp.getCompound(TAG_FLOATING_DATA));
    }

    @Nonnull
    @Override
    public IModelData getModelData() {
        return new ModelDataMap.Builder()
                .withInitial(BotaniaStateProps.FLOATING_DATA, floatingData)
                .build();
    }
}
