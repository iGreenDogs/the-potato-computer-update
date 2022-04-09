package com.potato.project.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Mud{
    public static final Block MUD_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).strength(1.0f));
}
