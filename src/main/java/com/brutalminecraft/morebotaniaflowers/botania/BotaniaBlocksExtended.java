package com.brutalminecraft.morebotaniaflowers.botania;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.ResourceLocationHelper;

public final class BotaniaBlocksExtended {

    // amber
    // beige
    // cream
    // dark_green
    // forest_green
    // hot_pink
    // indigo
    // maroon
    // navy
    // olive
    // pale_green
    // pale_pink
    // pale_yellow
    // sky_blue
    // slate_gray
    // violet

    private static final AbstractBlock.IExtendedPositionPredicate<EntityType<?>> NO_SPAWN = (state, world, pos, et) -> false;
    private static final AbstractBlock.IPositionPredicate NO_SUFFOCATION = (state, world, pos) -> false;

    public static final Block amberFlower;
    public static final Block beigeFlower;
    public static final Block creamFlower;
    public static final Block darkGreenFlower;
    public static final Block forestGreenFlower;
    public static final Block hotPinkFlower;
    public static final Block indigoFlower;
    public static final Block maroonFlower;
    public static final Block navyFlower;
    public static final Block oliveFlower;
    public static final Block paleGreenFlower;
    public static final Block palePinkFlower;
    public static final Block paleYellowFlower;
    public static final Block skyBlueFlower;
    public static final Block slateGrayFlower;
    public static final Block violetFlower;
    
    public static final Block amberShinyFlower;
    public static final Block beigeShinyFlower;
    public static final Block creamShinyFlower;
    public static final Block darkGreenShinyFlower;
    public static final Block forestGreenShinyFlower;
    public static final Block hotPinkShinyFlower;
    public static final Block indigoShinyFlower;
    public static final Block maroonShinyFlower;
    public static final Block navyShinyFlower;
    public static final Block oliveShinyFlower;
    public static final Block paleGreenShinyFlower;
    public static final Block palePinkShinyFlower;
    public static final Block paleYellowShinyFlower;
    public static final Block skyBlueShinyFlower;
    public static final Block slateGrayShinyFlower;
    public static final Block violetShinyFlower;

    public static final Block amberBuriedPetals;
    public static final Block beigeBuriedPetals;
    public static final Block creamBuriedPetals;
    public static final Block darkGreenBuriedPetals;
    public static final Block forestGreenBuriedPetals;
    public static final Block hotPinkBuriedPetals;
    public static final Block indigoBuriedPetals;
    public static final Block maroonBuriedPetals;
    public static final Block navyBuriedPetals;
    public static final Block oliveBuriedPetals;
    public static final Block paleGreenBuriedPetals;
    public static final Block palePinkBuriedPetals;
    public static final Block paleYellowBuriedPetals;
    public static final Block skyBlueBuriedPetals;
    public static final Block slateGrayBuriedPetals;
    public static final Block violetBuriedPetals;

    public static final Block amberFloatingFlower;
    public static final Block beigeFloatingFlower;
    public static final Block creamFloatingFlower;
    public static final Block darkGreenFloatingFlower;
    public static final Block forestGreenFloatingFlower;
    public static final Block hotPinkFloatingFlower;
    public static final Block indigoFloatingFlower;
    public static final Block maroonFloatingFlower;
    public static final Block navyFloatingFlower;
    public static final Block oliveFloatingFlower;
    public static final Block paleGreenFloatingFlower;
    public static final Block palePinkFloatingFlower;
    public static final Block paleYellowFloatingFlower;
    public static final Block skyBlueFloatingFlower;
    public static final Block slateGrayFloatingFlower;
    public static final Block violetFloatingFlower;

    public static final Block petalBlockAmber;
    public static final Block petalBlockBeige;
    public static final Block petalBlockCream;
    public static final Block petalBlockDarkGreen;
    public static final Block petalBlockForestGreen;
    public static final Block petalBlockHotPink;
    public static final Block petalBlockIndigo;
    public static final Block petalBlockMaroon;
    public static final Block petalBlockNavy;
    public static final Block petalBlockOlive;
    public static final Block petalBlockPaleGreen;
    public static final Block petalBlockPalePink;
    public static final Block petalBlockPaleYellow;
    public static final Block petalBlockSkyBlue;
    public static final Block petalBlockSlateGray;
    public static final Block petalBlockViolet;

    public static final Block amberMushroom;
    public static final Block beigeMushroom;
    public static final Block creamMushroom;
    public static final Block darkGreenMushroom;
    public static final Block forestGreenMushroom;
    public static final Block hotPinkMushroom;
    public static final Block indigoMushroom;
    public static final Block maroonMushroom;
    public static final Block navyMushroom;
    public static final Block oliveMushroom;
    public static final Block paleGreenMushroom;
    public static final Block palePinkMushroom;
    public static final Block paleYellowMushroom;
    public static final Block skyBlueMushroom;
    public static final Block slateGrayMushroom;
    public static final Block violetMushroom;

    public static final Block doubleFlowerAmber;
    public static final Block doubleFlowerBeige;
    public static final Block doubleFlowerCream;
    public static final Block doubleFlowerDarkGreen;
    public static final Block doubleFlowerForestGreen;
    public static final Block doubleFlowerHotPink;
    public static final Block doubleFlowerIndigo;
    public static final Block doubleFlowerMaroon;
    public static final Block doubleFlowerNavy;
    public static final Block doubleFlowerOlive;
    public static final Block doubleFlowerPaleGreen;
    public static final Block doubleFlowerPalePink;
    public static final Block doubleFlowerPaleYellow;
    public static final Block doubleFlowerSkyBlue;
    public static final Block doubleFlowerSlateGray;
    public static final Block doubleFlowerViolet;

    public static void registerBlocks(RegistryEvent.Register<Block> evt) {
        IForgeRegistry<Block> r = evt.getRegistry();
        register(r, (String)"amber_mystical_flower", amberFlower);
        register(r, (String)"beige_mystical_flower", beigeFlower);
        register(r, (String)"cream_mystical_flower", creamFlower);
        register(r, (String)"dark_green_mystical_flower", darkGreenFlower);
        register(r, (String)"forest_green_mystical_flower", forestGreenFlower);
        register(r, (String)"hot_pink_mystical_flower", hotPinkFlower);
        register(r, (String)"indigo_mystical_flower", indigoFlower);
        register(r, (String)"maroon_mystical_flower", maroonFlower);
        register(r, (String)"navy_mystical_flower", navyFlower);
        register(r, (String)"olive_mystical_flower", oliveFlower);
        register(r, (String)"pale_green_mystical_flower", paleGreenFlower);
        register(r, (String)"pale_pink_mystical_flower", palePinkFlower);
        register(r, (String)"pale_yellow_mystical_flower", paleYellowFlower);
        register(r, (String)"sky_blue_mystical_flower", skyBlueFlower);
        register(r, (String)"slate_gray_mystical_flower", slateGrayFlower);
        register(r, (String)"violet_mystical_flower", violetFlower);

        register(r, (String)"amber_shiny_flower", amberShinyFlower);
        register(r, (String)"beige_shiny_flower", beigeShinyFlower);
        register(r, (String)"cream_shiny_flower", creamShinyFlower);
        register(r, (String)"dark_green_shiny_flower", darkGreenShinyFlower);
        register(r, (String)"forest_green_shiny_flower", forestGreenShinyFlower);
        register(r, (String)"hot_pink_shiny_flower", hotPinkShinyFlower);
        register(r, (String)"indigo_shiny_flower", indigoShinyFlower);
        register(r, (String)"maroon_shiny_flower", maroonShinyFlower);
        register(r, (String)"navy_shiny_flower", navyShinyFlower);
        register(r, (String)"olive_shiny_flower", oliveShinyFlower);
        register(r, (String)"pale_green_shiny_flower", paleGreenShinyFlower);
        register(r, (String)"pale_pink_shiny_flower", palePinkShinyFlower);
        register(r, (String)"pale_yellow_shiny_flower", paleYellowShinyFlower);
        register(r, (String)"sky_blue_shiny_flower", skyBlueShinyFlower);
        register(r, (String)"slate_gray_shiny_flower", slateGrayShinyFlower);
        register(r, (String)"violet_shiny_flower", violetShinyFlower);

        register(r, (String)"amber_buried_petals", amberBuriedPetals);
        register(r, (String)"beige_buried_petals", beigeBuriedPetals);
        register(r, (String)"cream_buried_petals", creamBuriedPetals);
        register(r, (String)"dark_green_buried_petals", darkGreenBuriedPetals);
        register(r, (String)"forest_green_buried_petals", forestGreenBuriedPetals);
        register(r, (String)"hot_pink_buried_petals", hotPinkBuriedPetals);
        register(r, (String)"indigo_buried_petals", indigoBuriedPetals);
        register(r, (String)"maroon_buried_petals", maroonBuriedPetals);
        register(r, (String)"navy_buried_petals", navyBuriedPetals);
        register(r, (String)"olive_buried_petals", oliveBuriedPetals);
        register(r, (String)"pale_green_buried_petals", paleGreenBuriedPetals);
        register(r, (String)"pale_pink_buried_petals", palePinkBuriedPetals);
        register(r, (String)"pale_yellow_buried_petals", paleYellowBuriedPetals);
        register(r, (String)"sky_blue_buried_petals", skyBlueBuriedPetals);
        register(r, (String)"slate_gray_buried_petals", slateGrayBuriedPetals);
        register(r, (String)"violet_buried_petals", violetBuriedPetals);

        register(r, (String)"amber_floating_flower", amberFloatingFlower);
        register(r, (String)"beige_floating_flower", beigeFloatingFlower);
        register(r, (String)"cream_floating_flower", creamFloatingFlower);
        register(r, (String)"dark_green_floating_flower", darkGreenFloatingFlower);
        register(r, (String)"forest_green_floating_flower", forestGreenFloatingFlower);
        register(r, (String)"hot_pink_floating_flower", hotPinkFloatingFlower);
        register(r, (String)"indigo_floating_flower", indigoFloatingFlower);
        register(r, (String)"maroon_floating_flower", maroonFloatingFlower);
        register(r, (String)"navy_floating_flower", navyFloatingFlower);
        register(r, (String)"olive_floating_flower", oliveFloatingFlower);
        register(r, (String)"pale_green_floating_flower", paleGreenFloatingFlower);
        register(r, (String)"pale_pink_floating_flower", palePinkFloatingFlower);
        register(r, (String)"pale_yellow_floating_flower", paleYellowFloatingFlower);
        register(r, (String)"sky_blue_floating_flower", skyBlueFloatingFlower);
        register(r, (String)"slate_gray_floating_flower", slateGrayFloatingFlower);
        register(r, (String)"violet_floating_flower", violetFloatingFlower);

        register(r, (String)"amber_petal_block", petalBlockAmber);
        register(r, (String)"beige_petal_block", petalBlockBeige);
        register(r, (String)"cream_petal_block", petalBlockCream);
        register(r, (String)"dark_green_petal_block", petalBlockDarkGreen);
        register(r, (String)"forest_green_petal_block", petalBlockForestGreen);
        register(r, (String)"hot_pink_petal_block", petalBlockHotPink);
        register(r, (String)"indigo_petal_block", petalBlockIndigo);
        register(r, (String)"maroon_petal_block", petalBlockMaroon);
        register(r, (String)"navy_petal_block", petalBlockNavy);
        register(r, (String)"olive_petal_block", petalBlockOlive);
        register(r, (String)"pale_green_petal_block", petalBlockPaleGreen);
        register(r, (String)"pale_pink_petal_block", petalBlockPalePink);
        register(r, (String)"pale_yellow_petal_block", petalBlockPaleYellow);
        register(r, (String)"sky_blue_petal_block", petalBlockSkyBlue);
        register(r, (String)"slate_gray_petal_block", petalBlockSlateGray);
        register(r, (String)"violet_petal_block", petalBlockViolet);

        register(r, (String)"amber_mushroom", amberMushroom);
        register(r, (String)"beige_mushroom", beigeMushroom);
        register(r, (String)"cream_mushroom", creamMushroom);
        register(r, (String)"dark_green_mushroom", darkGreenMushroom);
        register(r, (String)"forest_green_mushroom", forestGreenMushroom);
        register(r, (String)"hot_pink_mushroom", hotPinkMushroom);
        register(r, (String)"indigo_mushroom", indigoMushroom);
        register(r, (String)"maroon_mushroom", maroonMushroom);
        register(r, (String)"navy_mushroom", navyMushroom);
        register(r, (String)"olive_mushroom", oliveMushroom);
        register(r, (String)"pale_green_mushroom", paleGreenMushroom);
        register(r, (String)"pale_pink_mushroom", palePinkMushroom);
        register(r, (String)"pale_yellow_mushroom", paleYellowMushroom);
        register(r, (String)"sky_blue_mushroom", skyBlueMushroom);
        register(r, (String)"slate_gray_mushroom", slateGrayMushroom);
        register(r, (String)"violet_mushroom", violetMushroom);

        register(r, (String)"amber_double_flower", doubleFlowerAmber);
        register(r, (String)"beige_double_flower", doubleFlowerBeige);
        register(r, (String)"cream_double_flower", doubleFlowerCream);
        register(r, (String)"dark_green_double_flower", doubleFlowerDarkGreen);
        register(r, (String)"forest_green_double_flower", doubleFlowerForestGreen);
        register(r, (String)"hot_pink_double_flower", doubleFlowerHotPink);
        register(r, (String)"indigo_double_flower", doubleFlowerIndigo);
        register(r, (String)"maroon_double_flower", doubleFlowerMaroon);
        register(r, (String)"navy_double_flower", doubleFlowerNavy);
        register(r, (String)"olive_double_flower", doubleFlowerOlive);
        register(r, (String)"pale_green_double_flower", doubleFlowerPaleGreen);
        register(r, (String)"pale_pink_double_flower", doubleFlowerPalePink);
        register(r, (String)"pale_yellow_double_flower", doubleFlowerPaleYellow);
        register(r, (String)"sky_blue_double_flower", doubleFlowerSkyBlue);
        register(r, (String)"slate_gray_double_flower", doubleFlowerSlateGray);
        register(r, (String)"violet_double_flower", doubleFlowerViolet);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();
        net.minecraft.item.Item.Properties props = ModItems.defaultBuilder();

        register(r, (ResourceLocation)Registry.BLOCK.getKey(amberFlower), new BlockItem(amberFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(beigeFlower), new BlockItem(beigeFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(creamFlower), new BlockItem(creamFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(darkGreenFlower), new BlockItem(darkGreenFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(forestGreenFlower), new BlockItem(forestGreenFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(hotPinkFlower), new BlockItem(hotPinkFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(indigoFlower), new BlockItem(indigoFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(maroonFlower), new BlockItem(maroonFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(navyFlower), new BlockItem(navyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(oliveFlower), new BlockItem(oliveFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleGreenFlower), new BlockItem(paleGreenFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(palePinkFlower), new BlockItem(palePinkFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleYellowFlower), new BlockItem(paleYellowFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(skyBlueFlower), new BlockItem(skyBlueFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(slateGrayFlower), new BlockItem(slateGrayFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(violetFlower), new BlockItem(violetFlower, props));

        register(r, (ResourceLocation)Registry.BLOCK.getKey(amberShinyFlower), new BlockItem(amberShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(beigeShinyFlower), new BlockItem(beigeShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(creamShinyFlower), new BlockItem(creamShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(darkGreenShinyFlower), new BlockItem(darkGreenShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(forestGreenShinyFlower), new BlockItem(forestGreenShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(hotPinkShinyFlower), new BlockItem(hotPinkShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(indigoShinyFlower), new BlockItem(indigoShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(maroonShinyFlower), new BlockItem(maroonShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(navyShinyFlower), new BlockItem(navyShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(oliveShinyFlower), new BlockItem(oliveShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleGreenShinyFlower), new BlockItem(paleGreenShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(palePinkShinyFlower), new BlockItem(palePinkShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleYellowShinyFlower), new BlockItem(paleYellowShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(skyBlueShinyFlower), new BlockItem(skyBlueShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(slateGrayShinyFlower), new BlockItem(slateGrayShinyFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(violetShinyFlower), new BlockItem(violetShinyFlower, props));

        register(r, (ResourceLocation)Registry.BLOCK.getKey(amberFloatingFlower), new BlockItem(amberFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(beigeFloatingFlower), new BlockItem(beigeFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(creamFloatingFlower), new BlockItem(creamFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(darkGreenFloatingFlower), new BlockItem(darkGreenFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(forestGreenFloatingFlower), new BlockItem(forestGreenFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(hotPinkFloatingFlower), new BlockItem(hotPinkFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(indigoFloatingFlower), new BlockItem(indigoFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(maroonFloatingFlower), new BlockItem(maroonFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(navyFloatingFlower), new BlockItem(navyFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(oliveFloatingFlower), new BlockItem(oliveFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleGreenFloatingFlower), new BlockItem(paleGreenFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(palePinkFloatingFlower), new BlockItem(palePinkFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleYellowFloatingFlower), new BlockItem(paleYellowFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(skyBlueFloatingFlower), new BlockItem(skyBlueFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(slateGrayFloatingFlower), new BlockItem(slateGrayFloatingFlower, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(violetFloatingFlower), new BlockItem(violetFloatingFlower, props));

        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockAmber), new BlockItem(petalBlockAmber, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockBeige), new BlockItem(petalBlockBeige, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockCream), new BlockItem(petalBlockCream, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockDarkGreen), new BlockItem(petalBlockDarkGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockForestGreen), new BlockItem(petalBlockForestGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockHotPink), new BlockItem(petalBlockHotPink, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockIndigo), new BlockItem(petalBlockIndigo, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockMaroon), new BlockItem(petalBlockMaroon, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockNavy), new BlockItem(petalBlockNavy, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockOlive), new BlockItem(petalBlockOlive, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockPaleGreen), new BlockItem(petalBlockPaleGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockPalePink), new BlockItem(petalBlockPalePink, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockPaleYellow), new BlockItem(petalBlockPaleYellow, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockSkyBlue), new BlockItem(petalBlockSkyBlue, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockSlateGray), new BlockItem(petalBlockSlateGray, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(petalBlockViolet), new BlockItem(petalBlockViolet, props));

        register(r, (ResourceLocation)Registry.BLOCK.getKey(amberMushroom), new BlockItem(amberMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(beigeMushroom), new BlockItem(beigeMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(creamMushroom), new BlockItem(creamMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(darkGreenMushroom), new BlockItem(darkGreenMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(forestGreenMushroom), new BlockItem(forestGreenMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(hotPinkMushroom), new BlockItem(hotPinkMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(indigoMushroom), new BlockItem(indigoMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(maroonMushroom), new BlockItem(maroonMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(navyMushroom), new BlockItem(navyMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(oliveMushroom), new BlockItem(oliveMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleGreenMushroom), new BlockItem(paleGreenMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(palePinkMushroom), new BlockItem(palePinkMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(paleYellowMushroom), new BlockItem(paleYellowMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(skyBlueMushroom), new BlockItem(skyBlueMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(slateGrayMushroom), new BlockItem(slateGrayMushroom, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(violetMushroom), new BlockItem(violetMushroom, props));

        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerAmber), new BlockItem(doubleFlowerAmber, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerBeige), new BlockItem(doubleFlowerBeige, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerCream), new BlockItem(doubleFlowerCream, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerDarkGreen), new BlockItem(doubleFlowerDarkGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerForestGreen), new BlockItem(doubleFlowerForestGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerHotPink), new BlockItem(doubleFlowerHotPink, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerIndigo), new BlockItem(doubleFlowerIndigo, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerMaroon), new BlockItem(doubleFlowerMaroon, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerNavy), new BlockItem(doubleFlowerNavy, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerOlive), new BlockItem(doubleFlowerOlive, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerPaleGreen), new BlockItem(doubleFlowerPaleGreen, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerPalePink), new BlockItem(doubleFlowerPalePink, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerPaleYellow), new BlockItem(doubleFlowerPaleYellow, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerSkyBlue), new BlockItem(doubleFlowerSkyBlue, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerSlateGray), new BlockItem(doubleFlowerSlateGray, props));
        register(r, (ResourceLocation)Registry.BLOCK.getKey(doubleFlowerViolet), new BlockItem(doubleFlowerViolet, props));

    }

    public static Block getFlower(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return amberFlower;
            case BEIGE:
                return beigeFlower;
            case CREAM:
            default:
                return creamFlower;
            case DARK_GREEN:
                return darkGreenFlower;
            case FOREST_GREEN:
                return forestGreenFlower;
            case HOT_PINK:
                return hotPinkFlower;
            case INDIGO:
                return indigoFlower;
            case MAROON:
                return maroonFlower;
            case NAVY:
                return navyFlower;
            case OLIVE:
                return oliveFlower;
            case PALE_GREEN:
                return paleGreenFlower;
            case PALE_PINK:
                return palePinkFlower;
            case PALE_YELLOW:
                return paleYellowFlower;
            case SKY_BLUE:
                return skyBlueFlower;
            case SLATE_GRAY:
                return slateGrayFlower;
            case VIOLET:
                return violetFlower;
        }
    }

    public static Block getMushroom(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return amberMushroom;
            case BEIGE:
                return beigeMushroom;
            case CREAM:
            default:
                return creamMushroom;
            case DARK_GREEN:
                return darkGreenMushroom;
            case FOREST_GREEN:
                return forestGreenMushroom;
            case HOT_PINK:
                return hotPinkMushroom;
            case INDIGO:
                return indigoMushroom;
            case MAROON:
                return maroonMushroom;
            case NAVY:
                return navyMushroom;
            case OLIVE:
                return oliveMushroom;
            case PALE_GREEN:
                return paleGreenMushroom;
            case PALE_PINK:
                return palePinkMushroom;
            case PALE_YELLOW:
                return paleYellowMushroom;
            case SKY_BLUE:
                return skyBlueMushroom;
            case SLATE_GRAY:
                return slateGrayMushroom;
            case VIOLET:
                return violetMushroom;
        }
    }

    public static Block getBuriedPetal(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return amberBuriedPetals;
            case BEIGE:
                return beigeBuriedPetals;
            case CREAM:
            default:
                return creamBuriedPetals;
            case DARK_GREEN:
                return darkGreenBuriedPetals;
            case FOREST_GREEN:
                return forestGreenBuriedPetals;
            case HOT_PINK:
                return hotPinkBuriedPetals;
            case INDIGO:
                return indigoBuriedPetals;
            case MAROON:
                return maroonBuriedPetals;
            case NAVY:
                return navyBuriedPetals;
            case OLIVE:
                return oliveBuriedPetals;
            case PALE_GREEN:
                return paleGreenBuriedPetals;
            case PALE_PINK:
                return palePinkBuriedPetals;
            case PALE_YELLOW:
                return paleYellowBuriedPetals;
            case SKY_BLUE:
                return skyBlueBuriedPetals;
            case SLATE_GRAY:
                return slateGrayBuriedPetals;
            case VIOLET:
                return violetBuriedPetals;
        }
    }

    public static Block getShinyFlower(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return amberShinyFlower;
            case BEIGE:
                return beigeShinyFlower;
            case CREAM:
            default:
                return creamShinyFlower;
            case DARK_GREEN:
                return darkGreenShinyFlower;
            case FOREST_GREEN:
                return forestGreenShinyFlower;
            case HOT_PINK:
                return hotPinkShinyFlower;
            case INDIGO:
                return indigoShinyFlower;
            case MAROON:
                return maroonShinyFlower;
            case NAVY:
                return navyShinyFlower;
            case OLIVE:
                return oliveShinyFlower;
            case PALE_GREEN:
                return paleGreenShinyFlower;
            case PALE_PINK:
                return palePinkShinyFlower;
            case PALE_YELLOW:
                return paleYellowShinyFlower;
            case SKY_BLUE:
                return skyBlueShinyFlower;
            case SLATE_GRAY:
                return slateGrayShinyFlower;
            case VIOLET:
                return violetShinyFlower;
        }
    }

    public static Block getFloatingFlower(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return amberFloatingFlower;
            case BEIGE:
                return beigeFloatingFlower;
            case CREAM:
            default:
                return creamFloatingFlower;
            case DARK_GREEN:
                return darkGreenFloatingFlower;
            case FOREST_GREEN:
                return forestGreenFloatingFlower;
            case HOT_PINK:
                return hotPinkFloatingFlower;
            case INDIGO:
                return indigoFloatingFlower;
            case MAROON:
                return maroonFloatingFlower;
            case NAVY:
                return navyFloatingFlower;
            case OLIVE:
                return oliveFloatingFlower;
            case PALE_GREEN:
                return paleGreenFloatingFlower;
            case PALE_PINK:
                return palePinkFloatingFlower;
            case PALE_YELLOW:
                return paleYellowFloatingFlower;
            case SKY_BLUE:
                return skyBlueFloatingFlower;
            case SLATE_GRAY:
                return slateGrayFloatingFlower;
            case VIOLET:
                return violetFloatingFlower;
        }
    }

    public static Block getDoubleFlower(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return doubleFlowerAmber;
            case BEIGE:
                return doubleFlowerBeige;
            case CREAM:
            default:
                return doubleFlowerCream;
            case DARK_GREEN:
                return doubleFlowerDarkGreen;
            case FOREST_GREEN:
                return doubleFlowerForestGreen;
            case HOT_PINK:
                return doubleFlowerHotPink;
            case INDIGO:
                return doubleFlowerIndigo;
            case MAROON:
                return doubleFlowerMaroon;
            case NAVY:
                return doubleFlowerNavy;
            case OLIVE:
                return doubleFlowerOlive;
            case PALE_GREEN:
                return doubleFlowerPaleGreen;
            case PALE_PINK:
                return doubleFlowerPalePink;
            case PALE_YELLOW:
                return doubleFlowerPaleYellow;
            case SKY_BLUE:
                return doubleFlowerSkyBlue;
            case SLATE_GRAY:
                return doubleFlowerSlateGray;
            case VIOLET:
                return doubleFlowerViolet;
        }
    }

    public static Block getPetalBlock(ExtendedDyeColors color) {
        switch(color) {
            case AMBER:
                return petalBlockAmber;
            case BEIGE:
                return petalBlockBeige;
            case CREAM:
            default:
                return petalBlockCream;
            case DARK_GREEN:
                return petalBlockDarkGreen;
            case FOREST_GREEN:
                return petalBlockForestGreen;
            case HOT_PINK:
                return petalBlockHotPink;
            case INDIGO:
                return petalBlockIndigo;
            case MAROON:
                return petalBlockMaroon;
            case NAVY:
                return petalBlockNavy;
            case OLIVE:
                return petalBlockOlive;
            case PALE_GREEN:
                return petalBlockPaleGreen;
            case PALE_PINK:
                return petalBlockPalePink;
            case PALE_YELLOW:
                return petalBlockPaleYellow;
            case SKY_BLUE:
                return petalBlockSkyBlue;
            case SLATE_GRAY:
                return petalBlockSlateGray;
            case VIOLET:
                return petalBlockViolet;
        }
    }

    static{
        amberFlower = new BlockModFlowerExtended(ExtendedDyeColors.AMBER, Properties.from(ModBlocks.whiteFlower));
        beigeFlower = new BlockModFlowerExtended(ExtendedDyeColors.BEIGE, Properties.from(amberFlower));
        creamFlower = new BlockModFlowerExtended(ExtendedDyeColors.CREAM, Properties.from(amberFlower));
        darkGreenFlower = new BlockModFlowerExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(amberFlower));
        forestGreenFlower = new BlockModFlowerExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(amberFlower));
        hotPinkFlower = new BlockModFlowerExtended(ExtendedDyeColors.HOT_PINK, Properties.from(amberFlower));
        indigoFlower = new BlockModFlowerExtended(ExtendedDyeColors.INDIGO, Properties.from(amberFlower));
        maroonFlower = new BlockModFlowerExtended(ExtendedDyeColors.MAROON, Properties.from(amberFlower));
        navyFlower = new BlockModFlowerExtended(ExtendedDyeColors.NAVY, Properties.from(amberFlower));
        oliveFlower = new BlockModFlowerExtended(ExtendedDyeColors.OLIVE, Properties.from(amberFlower));
        paleGreenFlower = new BlockModFlowerExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(amberFlower));
        palePinkFlower = new BlockModFlowerExtended(ExtendedDyeColors.PALE_PINK, Properties.from(amberFlower));
        paleYellowFlower = new BlockModFlowerExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(amberFlower));
        skyBlueFlower = new BlockModFlowerExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(amberFlower));
        slateGrayFlower = new BlockModFlowerExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(amberFlower));
        violetFlower = new BlockModFlowerExtended(ExtendedDyeColors.VIOLET, Properties.from(amberFlower));

        amberShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.whiteShinyFlower));
        beigeShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.BEIGE, Properties.from(amberShinyFlower));
        creamShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.CREAM, Properties.from(amberShinyFlower));
        darkGreenShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(amberShinyFlower));
        forestGreenShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(amberShinyFlower));
        hotPinkShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.HOT_PINK, Properties.from(amberShinyFlower));
        indigoShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.INDIGO, Properties.from(amberShinyFlower));
        maroonShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.MAROON, Properties.from(amberShinyFlower));
        navyShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.NAVY, Properties.from(amberShinyFlower));
        oliveShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.OLIVE, Properties.from(amberShinyFlower));
        paleGreenShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(amberShinyFlower));
        palePinkShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.PALE_PINK, Properties.from(amberShinyFlower));
        paleYellowShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(amberShinyFlower));
        skyBlueShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(amberShinyFlower));
        slateGrayShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(amberShinyFlower));
        violetShinyFlower = new BlockShinyFlowerExtended(ExtendedDyeColors.VIOLET, Properties.from(amberShinyFlower));

        amberBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.whiteBuriedPetals));
        beigeBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.BEIGE, Properties.from(amberBuriedPetals));
        creamBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.CREAM, Properties.from(amberBuriedPetals));
        darkGreenBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(amberBuriedPetals));
        forestGreenBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(amberBuriedPetals));
        hotPinkBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.HOT_PINK, Properties.from(amberBuriedPetals));
        indigoBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.INDIGO, Properties.from(amberBuriedPetals));
        maroonBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.MAROON, Properties.from(amberBuriedPetals));
        navyBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.NAVY, Properties.from(amberBuriedPetals));
        oliveBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.OLIVE, Properties.from(amberBuriedPetals));
        paleGreenBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(amberBuriedPetals));
        palePinkBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.PALE_PINK, Properties.from(amberBuriedPetals));
        paleYellowBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(amberBuriedPetals));
        skyBlueBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(amberBuriedPetals));
        slateGrayBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(amberBuriedPetals));
        violetBuriedPetals = new BlockBuriedPetalsExtended(ExtendedDyeColors.VIOLET, Properties.from(amberBuriedPetals));

        amberFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.whiteFloatingFlower));
        beigeFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.BEIGE, Properties.from(amberFloatingFlower));
        creamFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.CREAM, Properties.from(amberFloatingFlower));
        darkGreenFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(amberFloatingFlower));
        forestGreenFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(amberFloatingFlower));
        hotPinkFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.HOT_PINK, Properties.from(amberFloatingFlower));
        indigoFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.INDIGO, Properties.from(amberFloatingFlower));
        maroonFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.MAROON, Properties.from(amberFloatingFlower));
        navyFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.NAVY, Properties.from(amberFloatingFlower));
        oliveFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.OLIVE, Properties.from(amberFloatingFlower));
        paleGreenFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(amberFloatingFlower));
        palePinkFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.PALE_PINK, Properties.from(amberFloatingFlower));
        paleYellowFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(amberFloatingFlower));
        skyBlueFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(amberFloatingFlower));
        slateGrayFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(amberFloatingFlower));
        violetFloatingFlower = new BlockFloatingFlowerExtended(ExtendedDyeColors.VIOLET, Properties.from(amberFloatingFlower));

        petalBlockAmber = new BlockPetalBlockExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.petalBlockWhite));
        petalBlockBeige = new BlockPetalBlockExtended(ExtendedDyeColors.BEIGE, Properties.from(petalBlockAmber));
        petalBlockCream = new BlockPetalBlockExtended(ExtendedDyeColors.CREAM, Properties.from(petalBlockAmber));
        petalBlockDarkGreen = new BlockPetalBlockExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(petalBlockAmber));
        petalBlockForestGreen = new BlockPetalBlockExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(petalBlockAmber));
        petalBlockHotPink = new BlockPetalBlockExtended(ExtendedDyeColors.HOT_PINK, Properties.from(petalBlockAmber));
        petalBlockIndigo = new BlockPetalBlockExtended(ExtendedDyeColors.INDIGO, Properties.from(petalBlockAmber));
        petalBlockMaroon = new BlockPetalBlockExtended(ExtendedDyeColors.MAROON, Properties.from(petalBlockAmber));
        petalBlockNavy = new BlockPetalBlockExtended(ExtendedDyeColors.NAVY, Properties.from(petalBlockAmber));
        petalBlockOlive = new BlockPetalBlockExtended(ExtendedDyeColors.OLIVE, Properties.from(petalBlockAmber));
        petalBlockPaleGreen = new BlockPetalBlockExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(petalBlockAmber));
        petalBlockPalePink = new BlockPetalBlockExtended(ExtendedDyeColors.PALE_PINK, Properties.from(petalBlockAmber));
        petalBlockPaleYellow = new BlockPetalBlockExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(petalBlockAmber));
        petalBlockSkyBlue = new BlockPetalBlockExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(petalBlockAmber));
        petalBlockSlateGray = new BlockPetalBlockExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(petalBlockAmber));
        petalBlockViolet = new BlockPetalBlockExtended(ExtendedDyeColors.VIOLET, Properties.from(petalBlockAmber));

        amberMushroom = new BlockModMushroomExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.whiteMushroom));
        beigeMushroom = new BlockModMushroomExtended(ExtendedDyeColors.BEIGE, Properties.from(amberMushroom));
        creamMushroom = new BlockModMushroomExtended(ExtendedDyeColors.CREAM, Properties.from(amberMushroom));
        darkGreenMushroom = new BlockModMushroomExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(amberMushroom));
        forestGreenMushroom = new BlockModMushroomExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(amberMushroom));
        hotPinkMushroom = new BlockModMushroomExtended(ExtendedDyeColors.HOT_PINK, Properties.from(amberMushroom));
        indigoMushroom = new BlockModMushroomExtended(ExtendedDyeColors.INDIGO, Properties.from(amberMushroom));
        maroonMushroom = new BlockModMushroomExtended(ExtendedDyeColors.MAROON, Properties.from(amberMushroom));
        navyMushroom = new BlockModMushroomExtended(ExtendedDyeColors.NAVY, Properties.from(amberMushroom));
        oliveMushroom = new BlockModMushroomExtended(ExtendedDyeColors.OLIVE, Properties.from(amberMushroom));
        paleGreenMushroom = new BlockModMushroomExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(amberMushroom));
        palePinkMushroom = new BlockModMushroomExtended(ExtendedDyeColors.PALE_PINK, Properties.from(amberMushroom));
        paleYellowMushroom = new BlockModMushroomExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(amberMushroom));
        skyBlueMushroom = new BlockModMushroomExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(amberMushroom));
        slateGrayMushroom = new BlockModMushroomExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(amberMushroom));
        violetMushroom = new BlockModMushroomExtended(ExtendedDyeColors.VIOLET, Properties.from(amberMushroom));

        doubleFlowerAmber = new BlockModDoubleFlowerExtended(ExtendedDyeColors.AMBER,  Properties.from(ModBlocks.doubleFlowerWhite));
        doubleFlowerBeige = new BlockModDoubleFlowerExtended(ExtendedDyeColors.BEIGE, Properties.from(doubleFlowerAmber));
        doubleFlowerCream = new BlockModDoubleFlowerExtended(ExtendedDyeColors.CREAM, Properties.from(doubleFlowerAmber));
        doubleFlowerDarkGreen = new BlockModDoubleFlowerExtended(ExtendedDyeColors.DARK_GREEN, Properties.from(doubleFlowerAmber));
        doubleFlowerForestGreen = new BlockModDoubleFlowerExtended(ExtendedDyeColors.FOREST_GREEN, Properties.from(doubleFlowerAmber));
        doubleFlowerHotPink = new BlockModDoubleFlowerExtended(ExtendedDyeColors.HOT_PINK, Properties.from(doubleFlowerAmber));
        doubleFlowerIndigo = new BlockModDoubleFlowerExtended(ExtendedDyeColors.INDIGO, Properties.from(doubleFlowerAmber));
        doubleFlowerMaroon = new BlockModDoubleFlowerExtended(ExtendedDyeColors.MAROON, Properties.from(doubleFlowerAmber));
        doubleFlowerNavy = new BlockModDoubleFlowerExtended(ExtendedDyeColors.NAVY, Properties.from(doubleFlowerAmber));
        doubleFlowerOlive = new BlockModDoubleFlowerExtended(ExtendedDyeColors.OLIVE, Properties.from(doubleFlowerAmber));
        doubleFlowerPaleGreen = new BlockModDoubleFlowerExtended(ExtendedDyeColors.PALE_GREEN, Properties.from(doubleFlowerAmber));
        doubleFlowerPalePink = new BlockModDoubleFlowerExtended(ExtendedDyeColors.PALE_PINK, Properties.from(doubleFlowerAmber));
        doubleFlowerPaleYellow = new BlockModDoubleFlowerExtended(ExtendedDyeColors.PALE_YELLOW, Properties.from(doubleFlowerAmber));
        doubleFlowerSkyBlue = new BlockModDoubleFlowerExtended(ExtendedDyeColors.SKY_BLUE, Properties.from(doubleFlowerAmber));
        doubleFlowerSlateGray = new BlockModDoubleFlowerExtended(ExtendedDyeColors.SLATE_GRAY, Properties.from(doubleFlowerAmber));
        doubleFlowerViolet = new BlockModDoubleFlowerExtended(ExtendedDyeColors.VIOLET, Properties.from(doubleFlowerAmber));

    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, ResourceLocation name, IForgeRegistryEntry<V> thing) {
        reg.register((V) thing.setRegistryName(name));
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, String name, IForgeRegistryEntry<V> thing) {
        register(reg, ResourceLocationHelper.prefix(name), thing);
    }
}
