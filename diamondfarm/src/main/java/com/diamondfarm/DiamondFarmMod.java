package com.diamondfarm;

import net.fabricmc.api.ModInitializer;

public class DiamondFarmMod implements ModInitializer {
	public static final String MOD_ID = "diamondfarm";

	@Override
	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();
	}
}
