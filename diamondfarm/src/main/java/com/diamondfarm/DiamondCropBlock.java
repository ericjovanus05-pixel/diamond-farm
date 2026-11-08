package com.diamondfarm;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

/**
 * Tanaman diamond. Tumbuh 8 tahap (age 0..7) seperti gandum.
 * Panen saat age = 7 untuk mendapatkan diamond.
 */
public class DiamondCropBlock extends CropBlock {
	public static final MapCodec<DiamondCropBlock> CODEC = simpleCodec(DiamondCropBlock::new);

	public DiamondCropBlock(Properties properties) {
		super(properties);
	}

	@Override
	public MapCodec<? extends CropBlock> codec() {
		return CODEC;
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return ModItems.DIAMOND_SEEDS;
	}
}
