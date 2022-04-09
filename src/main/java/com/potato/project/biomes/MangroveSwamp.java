package com.potato.project.biomes;

import com.potato.project.blocks.Mud;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class MangroveSwamp {

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> OBSIDIAN_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
    .withConfig(new TernarySurfaceConfig(
            Blocks.DIRT.getDefaultState(),
            Mud.MUD_BLOCK.getDefaultState(),
            Blocks.WATER.getDefaultState()));

  public static final Biome Mangrove = createMangrove();

  private static Biome createMangrove() {
    // We specify what entities spawn and what features generate in the biome.
    // Aside from some structures, trees, rocks, plants and
    //   custom entities, these are mostly the same for each biome.
    // Vanilla configured features for biomes are defined in DefaultBiomeFeatures.

    SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
    DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
    DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

    GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
    generationSettings.surfaceBuilder(OBSIDIAN_SURFACE_BUILDER);
    DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
    DefaultBiomeFeatures.addLandCarvers(generationSettings);
    DefaultBiomeFeatures.addDefaultLakes(generationSettings);
    DefaultBiomeFeatures.addDungeons(generationSettings);
    DefaultBiomeFeatures.addMineables(generationSettings);
    DefaultBiomeFeatures.addDefaultOres(generationSettings);
    DefaultBiomeFeatures.addDefaultDisks(generationSettings);
    DefaultBiomeFeatures.addSprings(generationSettings);
    DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    DefaultBiomeFeatures.addWaterBiomeOakTrees(generationSettings);

    return (new Biome.Builder())
      .precipitation(Biome.Precipitation.RAIN)
      .category(Biome.Category.SWAMP)
      .depth(0.125F)
      .scale(0.05F)
      .temperature(0.8F)
      .downfall(0.4F)
      .effects((new BiomeEffects.Builder())
        .waterColor(0x00ff99)
        .waterFogColor(0x050533)
        .fogColor(0xc0d8ff)
        .skyColor(0x77adff)
        .build())
      .spawnSettings(spawnSettings.build())
      .generationSettings(generationSettings.build())
      .build();
  }

}
