package com.diamondfarm;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public final class ModBlocks {
	public static final ResourceKey<Block> DIAMOND_CROP_KEY = ResourceKey.create(
			Registries.BLOCK, Identifier.fromNamespaceAndPath(DiamondFarmMod.MOD_ID, "diamond_crop"));

	public static final Block DIAMOND_CROP = Registry.register(
			BuiltInRegistries.BLOCK,
			DIAMOND_CROP_KEY,
			new DiamondCropBlock(BlockBehaviour.Properties.of()
					.setId(DIAMOND_CROP_KEY)
					.noCollision()
					.randomTicks()
					.instabreak()
					.sound(SoundType.CROP)
					.pushReaction(PushReaction.DESTROY)));

	private ModBlocks() {}

	public static void init() {}
}
