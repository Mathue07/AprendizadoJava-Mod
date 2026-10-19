package net.TestMod.Items;

import net.TestMod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BANANA_BOMB = RegisterItem("banana_bomb", new Item(new Item.Settings()));
    public static final Item RAW_BANANA = RegisterItem("raw_banana", new Item(new Item.Settings()));

    private static Item RegisterItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    public static  void RegisterModItems() {
        TestMod.LOGGER.info("Registering Mod Items for "+ TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(BANANA_BOMB);
            entries.add(RAW_BANANA);
        });
    }
}
