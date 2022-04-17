package com.potato.project.blocks;

import com.potato.project.blocks.weird.ModDoorBlock;
import com.potato.project.blocks.weird.ModPillarBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Mangrove {
    public static final ModPillarBlock MANGROVE_LOG = new ModPillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f));
    public static final Block MANGROVE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f));
    public static final Block MANGROVE_ROOTS = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque());
    public static final ModDoorBlock MANGROVE_DOOR = new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque());
    public static final Block MANGROVE_LEAVES = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f).ticksRandomly().nonOpaque().blockVision((state, world, pos) -> true));
}
