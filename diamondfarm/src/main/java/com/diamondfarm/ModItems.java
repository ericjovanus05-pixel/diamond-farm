package com.diamondfarm;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public final class ModItems {
	public static final ResourceKey<Item> DIAMOND_SEEDS_KEY = ResourceKey.create(
			Registries.ITEM, Identifier.fromNamespaceAndPath(DiamondFarmMod.MOD_ID, "diamond_seeds"));

	public static final Item DIAMOND_SEEDS = Registry.register(
			BuiltInRegistries.ITEM,
			DIAMOND_SEEDS_KEY,
			new BlockItem(ModBlocks.DIAMOND_CROP,
					new Item.Properties().setId(DIAMOND_SEEDS_KEY).useItemDescriptionPrefix()));

	private ModItems() {}

	public static void init() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
				.register(entries -> entries.accept(DIAMOND_SEEDS));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS)
				.register(entries -> entries.accept(DIAMOND_SEEDS));
	}
}
