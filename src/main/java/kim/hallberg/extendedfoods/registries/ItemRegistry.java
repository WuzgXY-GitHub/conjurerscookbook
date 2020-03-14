package kim.hallberg.extendedfoods.registries;

import com.google.common.base.Preconditions;
import kim.hallberg.extendedfoods.ExtendedFoods;
import kim.hallberg.extendedfoods.item.Foods;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ExtendedFoods.MODID)
public class ItemRegistry {
    @Mod.EventBusSubscriber(modid = ExtendedFoods.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    new SoupItem(new Item.Properties().group(ExtendedFoods.GROUP).maxStackSize(1).food(Foods.berry_cream).containerItem(Items.BOWL).rarity(Rarity.COMMON)).setRegistryName(ExtendedFoods.location("berry_cream")),
                    new SoupItem(new Item.Properties().group(ExtendedFoods.GROUP).maxStackSize(1).food(Foods.bamboo_curry).containerItem(Items.BOWL).rarity(Rarity.COMMON)).setRegistryName(ExtendedFoods.location("bamboo_curry")),
                    new Item((new Item.Properties()).group(ExtendedFoods.GROUP).maxStackSize(1).food(Foods.cookie_tin).rarity(Rarity.RARE)).setRegistryName(ExtendedFoods.location("cookie_tin")),
                    new Item((new Item.Properties()).group(ExtendedFoods.GROUP).maxStackSize(1).food(Foods.cake).rarity(Rarity.RARE)).setRegistryName(ExtendedFoods.location("cake")),
                    new Item((new Item.Properties()).group(ExtendedFoods.GROUP).maxStackSize(64).food(Foods.chorus).rarity(Rarity.COMMON)).setRegistryName(ExtendedFoods.location("chorus"))
            };

            for (final Item item: items) {
                Preconditions.checkNotNull(item.getRegistryName(), "Block: %s has a NULL registry name", item);
                event.getRegistry().register(item);
            }
        }

    }
}
