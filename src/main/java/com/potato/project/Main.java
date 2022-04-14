package com.potato.project;

import com.potato.project.biomes.MangroveSwamp;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import com.potato.project.blocks.*;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class Main implements ModInitializer {

	public static final RegistryKey<Biome> MANGROVE_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("potato", "mangrove"));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("potato", "mud"), Mud.MUD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("potato", "mud"), new BlockItem(Mud.MUD_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("potato", "mangrove_log"), Mangrove.MANGROVE_LOG);
		Registry.register(Registry.ITEM, new Identifier("potato", "mangrove_log"), new BlockItem(Mangrove.MANGROVE_LOG, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("potato", "mangrove_leaves"), Mangrove.MANGROVE_LEAVES);
		Registry.register(Registry.ITEM, new Identifier("potato", "mangrove_leaves"), new BlockItem(Mangrove.MANGROVE_LEAVES, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("potato", "mangrove_roots"), Mangrove.MANGROVE_ROOTS);
		Registry.register(Registry.ITEM, new Identifier("potato", "mangrove_roots"), new BlockItem(Mangrove.MANGROVE_ROOTS, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("potato", "mangrove_planks"), Mangrove.MANGROVE_PLANKS);
		Registry.register(Registry.ITEM, new Identifier("potato", "mangrove_planks"), new BlockItem(Mangrove.MANGROVE_PLANKS, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("potato", "mangrove_door"), Mangrove.MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("potato", "mangrove_door"), new BlockItem(Mangrove.MANGROVE_DOOR, new FabricItemSettings().group(ItemGroup.MISC)));

		BlockRenderLayerMap.INSTANCE.putBlock(Mangrove.MANGROVE_DOOR, RenderLayer.getCutout());


		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("tutorial", "obsidian"), MangroveSwamp.OBSIDIAN_SURFACE_BUILDER);
		Registry.register(BuiltinRegistries.BIOME, MANGROVE_KEY.getValue(), MangroveSwamp.Mangrove);
		OverworldBiomes.addContinentalBiome(MANGROVE_KEY, OverworldClimate.TEMPERATE, 2D);
		OverworldBiomes.addContinentalBiome(MANGROVE_KEY, OverworldClimate.COOL, 2D);
	}
}
