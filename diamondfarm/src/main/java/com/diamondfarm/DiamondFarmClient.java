package com.diamondfarm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ChunkSectionLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class DiamondFarmClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ChunkSectionLayerMap.putBlock(ModBlocks.DIAMOND_CROP, ChunkSectionLayer.CUTOUT);
	}
}
