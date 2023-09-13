package net.antonio.spice_n_pies.item;

import net.antonio.spice_n_pies.SpiceNPies;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiceNPies.MOD_ID);

    public static RegistryObject<Item> GARLIC = ITEMS.register("garlic", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build())));

    public static RegistryObject<Item> BASIL = ITEMS.register("basil", () ->
            new Item(new Item.Properties().fireResistant().stacksTo(44)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
