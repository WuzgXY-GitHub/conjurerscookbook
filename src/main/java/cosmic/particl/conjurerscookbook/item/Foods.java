package cosmic.particl.conjurerscookbook.item;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("ALL")
public class Foods {
    public static final Food bamboo_curry = (new Food.Builder()).hunger(7).saturation(0.5F).effect(new EffectInstance(Effects.SPEED, 400, 1), 1.0F).build();
    public static final Food berry_cream = (new Food.Builder()).hunger(5).saturation(0.3F).effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1.0F).build();
    public static final Food cookie_tin = (new Food.Builder()).hunger(6).saturation(0.3F).effect(new EffectInstance(Effects.REGENERATION, 500, 0), .5F).effect(new EffectInstance(Effects.STRENGTH, 500, 0), .3F).effect(new EffectInstance(Effects.RESISTANCE, 500, 0), .3F).effect(new EffectInstance(Effects.INVISIBILITY, 500, 0), 0.3F).effect(new EffectInstance(Effects.HASTE, 500, 0), 0.5F).effect(new EffectInstance(Effects.GLOWING, 500, 0), 0.5F).setAlwaysEdible().build();
    public static final Food cake = (new Food.Builder()).hunger(1).saturation(1F).effect(new EffectInstance(Effects.SATURATION, 25, 0), 1.0F).effect(new EffectInstance(Effects.WEAKNESS, 6000, 2), 1.0F).effect(new EffectInstance(Effects.SLOWNESS, 6000, 0), 1.0F).setAlwaysEdible().build();
    public static final Food chorus = (new Food.Builder()).hunger(2).saturation(.3F).effect(new EffectInstance(Effects.LEVITATION, 160, 0), 1.0F).setAlwaysEdible().build();
    public static final Food mandrake_root = (new Food.Builder()).hunger(1).saturation(.5F).effect(new EffectInstance(Effects.BLINDNESS, 200, 0), 1.0F).effect(new EffectInstance(Effects.POISON, 300, 1), 1.0F).build();
    public static final Food neptune_stew = (new Food.Builder()).hunger(8).saturation(1F).effect(new EffectInstance(Effects.DOLPHINS_GRACE, 300, 0), 1.0F).setAlwaysEdible().build();
    public static final Food witchs_stew = (new Food.Builder()).hunger(2).saturation(4.0F).effect(new EffectInstance(Effects.SPEED, 100, 3), 1.0F).effect(new EffectInstance(Effects.JUMP_BOOST, 100, 30), 1.0F).effect(new EffectInstance(Effects.SLOW_FALLING, 500, 0), 1.0F).build();
    public static final Food sacrifice_stew = (new Food.Builder()).hunger(1).saturation(6.0F).effect(new EffectInstance(Effects.STRENGTH, 800, 2), 1.0F).effect(new EffectInstance(Effects.POISON, 800, 0), 1.0F).build();
    public static final Food undead_delicacy = (new Food.Builder()).hunger(1).saturation(6.0F).effect(new EffectInstance(Effects.SATURATION, 20, -2), 1.0F).effect(new EffectInstance(Effects.INSTANT_HEALTH, 40, 0), 1.0F).effect(new EffectInstance(Effects.RESISTANCE, 60, 10), 1.0F).build();
    public static final Food veggie_mix = (new Food.Builder()).hunger(5).saturation(1F).effect(new EffectInstance(Effects.NIGHT_VISION, 1200, 0), 1.0F).build();
}
