package com.brutalminecraft.morebotaniaflowers.botania;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum ExtendedDyeColors implements IStringSerializable {
    AMBER(0,"amber", 0xFFAC22, MaterialColor.ADOBE, 0xFFAC22, 0xFFAC22),
    BEIGE(1,"beige", 0xE8C07D, MaterialColor.WHITE_TERRACOTTA, 0xE8C07D, 0xE8C07D),
    CREAM(2,"cream", 0xF2F2EA, MaterialColor.QUARTZ, 0xF2F2EA, 0xF2F2EA),
    DARK_GREEN(3,"dark_green", 0x4A5B26, MaterialColor.LIME, 0x4A5B26, 0x4A5B26),
    FOREST_GREEN(4,"forest_green", 0x6CA038, MaterialColor.GREEN, 0x6CA038, 0x6CA038),
    HOT_PINK(5,"hot_pink", 0xFF91A3, MaterialColor.PINK, 0xFF91A3, 0xFF91A3),
    INDIGO(6,"indigo", 0x3E3C93, MaterialColor.CYAN_TERRACOTTA, 0x3E3C93, 0x3E3C93),
    MAROON(7,"maroon", 0x872529, MaterialColor.CRIMSON_HYPHAE, 0x872529, 0x872529),
    NAVY(8,"navy", 0x10435E, MaterialColor.BLUE_TERRACOTTA, 0x10435E, 0x10435E),
    OLIVE(9,"olive", 0x677C2F, MaterialColor.GREEN_TERRACOTTA, 0x677C2F, 0x677C2F),
    PALE_GREEN(10,"pale_green", 0xAFF446, MaterialColor.EMERALD, 0xAFF446, 0xAFF446),
    PALE_PINK(11,"pale_pink", 0xEFBDDB, MaterialColor.PINK, 0xEFBDDB, 0xEFBDDB),
    PALE_YELLOW(12,"pale_yellow", 0xFAFFA0, MaterialColor.GOLD, 0xFAFFA0, 0xFAFFA0),
    SKY_BLUE(13,"sky_blue", 0x6BD4F4, MaterialColor.LAPIS, 0x6BD4F4, 0x6BD4F4),
    SLATE_GRAY(14,"slate_gray", 0x60717F, MaterialColor.CYAN_TERRACOTTA, 0x60717F, 0x60717F),
    VIOLET(15,"violet", 0xC16A9D, MaterialColor.CRIMSON_STEM, 0xC16A9D, 0xC16A9D);

    private static final ExtendedDyeColors[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(ExtendedDyeColors::getId)).toArray((colorId) -> {
        return new ExtendedDyeColors[colorId];
    });
    private static final Int2ObjectOpenHashMap<ExtendedDyeColors> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<>(Arrays.stream(values()).collect(Collectors.toMap((color) -> {
        return color.fireworkColor;
    }, (color) -> {
        return color;
    })));
    private final int id;
    private final String translationKey;
    private final MaterialColor mapColor;
    private final int colorValue;
    private final int swappedColorValue;
    private final float[] colorComponentValues;
    private final int fireworkColor;
    private final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> tag;
    private final int textColor;

    ExtendedDyeColors(int idIn, String translationKeyIn, int colorValueIn, MaterialColor mapColorIn, int fireworkColorIn, int textColorIn) {
        this.id = idIn;
        this.translationKey = translationKeyIn;
        this.colorValue = colorValueIn;
        this.mapColor = mapColorIn;
        this.textColor = textColorIn;
        int i = (colorValueIn & 16711680) >> 16;
        int j = (colorValueIn & '\uff00') >> 8;
        int k = (colorValueIn & 255) >> 0;
        this.swappedColorValue = k << 16 | j << 8 | i << 0;
        this.tag = net.minecraft.tags.ItemTags.createOptional(new net.minecraft.util.ResourceLocation("forge", "dyes/" + translationKeyIn));
        this.colorComponentValues = new float[]{(float)i / 255.0F, (float)j / 255.0F, (float)k / 255.0F};
        this.fireworkColor = fireworkColorIn;
    }

    public int getId() {
        return this.id;
    }

    public String getTranslationKey() {
        return this.translationKey;
    }

    /**
     * Gets an array containing 3 floats ranging from 0.0 to 1.0: the red, green, and blue components of the
     * corresponding color.
     */
    public float[] getColorComponentValues() {
        return this.colorComponentValues;
    }

    public MaterialColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public static ExtendedDyeColors byId(int colorId) {
        if (colorId < 0 || colorId >= VALUES.length) {
            colorId = 0;
        }

        return VALUES[colorId];
    }

    public static ExtendedDyeColors byTranslationKey(String translationKeyIn, ExtendedDyeColors fallback) {
        for(ExtendedDyeColors dyecolor : values()) {
            if (dyecolor.translationKey.equals(translationKeyIn)) {
                return dyecolor;
            }
        }

        return fallback;
    }

    @Nullable
    public static ExtendedDyeColors byFireworkColor(int fireworkColorIn) {
        return BY_FIREWORK_COLOR.get(fireworkColorIn);
    }

    public String toString() {
        return this.translationKey;
    }

    public String getString() {
        return this.translationKey;
    }

    public int getColorValue() {
        return colorValue;
    }

    public net.minecraftforge.common.Tags.IOptionalNamedTag<Item> getTag() {
        return tag;
    }

    @Nullable
    public static ExtendedDyeColors getColor(ItemStack stack) {
        for (ExtendedDyeColors color : VALUES) {
            if (stack.getItem().isIn(color.getTag()))
                return color;
        }

        return null;
    }
}
