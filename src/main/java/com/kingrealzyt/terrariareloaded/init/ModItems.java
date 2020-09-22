package com.kingrealzyt.terrariareloaded.init;

import com.kingrealzyt.terrariareloaded.TerrariaReloaded;
import com.kingrealzyt.terrariareloaded.entities.yoyo.YoyoType;
import com.kingrealzyt.terrariareloaded.items.GuideVoodoo;
import com.kingrealzyt.terrariareloaded.items.ItemBand;
import com.kingrealzyt.terrariareloaded.items.Lens;
import com.kingrealzyt.terrariareloaded.items.MagicMirror;
import com.kingrealzyt.terrariareloaded.items.tools.others.PickaxeAxeItem;
import com.kingrealzyt.terrariareloaded.items.weapons.ranged.repeaters.HallowedRepeaterItem;
import com.kingrealzyt.terrariareloaded.items.weapons.ranged.yoyo.YoyoItem;
import com.kingrealzyt.terrariareloaded.items.weapons.throwing.ThrowingKnifeItem;
import com.kingrealzyt.terrariareloaded.util.enums.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TerrariaReloaded.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> MAGIC_MIRROR = ITEMS.register("magic_mirror", MagicMirror::new);
    public static final RegistryObject<Item> ICE_MIRROR = ITEMS.register("ice_mirror", MagicMirror::new);
    public static final RegistryObject<Item> GUIDE_VOODOO = ITEMS.register("guide_voodoo_doll", GuideVoodoo::new);
    public static final RegistryObject<Item> BAND_REGENERATION = ITEMS.register("band_of_regeneration", ItemBand::new);
    public static final RegistryObject<Item> LENS = ITEMS.register("lens", Lens::new);

    // Tools
    public static final RegistryObject<SwordItem> COPPER_SHORTSWORD = ITEMS.register("copper_shortsword", () -> new SwordItem(ModItemTier.COPPER_SHORT, 1, 0.0F, new Item.Properties().group(TerrariaReloaded.SWORDS).setNoRepair()));
    public static final RegistryObject<SwordItem> COPPER_BROADSWORD = ITEMS.register("copper_broadsword", () -> new SwordItem(ModItemTier.COPPER_BROAD, 2, -2.4F, new Item.Properties().group(TerrariaReloaded.SWORDS).setNoRepair()));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModItemTier.COPPER_SHORT, 0, 0.0F, new Item.Properties().group(TerrariaReloaded.AXE).setNoRepair()));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModItemTier.COPPER_SHORT, 0, 0.0F, new Item.Properties().group(TerrariaReloaded.PICKAXE).setNoRepair()));
    public static final RegistryObject<HallowedRepeaterItem> HALLOWED_REPEATER_ITEM = ITEMS.register("hallowed_repeater", () -> new HallowedRepeaterItem(new Item.Properties().group(TerrariaReloaded.RANGED).setNoRepair()));

    public static final RegistryObject<PickaxeAxeItem> PICKSAW = ITEMS.register("picksaw", () -> new PickaxeAxeItem(ItemTier.DIAMOND, 0, 0.0F, new Item.Properties().group(TerrariaReloaded.PICKAXE).setNoRepair()));
    public static final RegistryObject<PickaxeAxeItem> PICKAXE_AXE = ITEMS.register("pickaxe_axe", () -> new PickaxeAxeItem(ItemTier.DIAMOND, 0, 0.0F, new Item.Properties().group(TerrariaReloaded.PICKAXE).setNoRepair()));


    // Block Items


    // Throwing weapons
    public static final RegistryObject<Item> THROWING_KNIFE_ITEM = ITEMS.register("throwing_knife_item", () -> new ThrowingKnifeItem(new Item.Properties().group(TerrariaReloaded.THROW)));
    //Yoyos
    public static final RegistryObject<Item> AMAROK_YOYO = registerYoyo("amarok", YoyoType.AMAROK);
    public static final RegistryObject<Item> AMAZON_YOYO = registerYoyo("amazon", YoyoType.AMAROK);
    public static final RegistryObject<Item> ARTERY_YOYO = registerYoyo("artery", YoyoType.ARTERY);
    public static final RegistryObject<Item> CASCADE_YOYO = registerYoyo("cascade", YoyoType.CASCADE);
    public static final RegistryObject<Item> CHICK_YOYO = registerYoyo("chick", YoyoType.CHICK);
    public static final RegistryObject<Item> CODE_1_YOYO = registerYoyo("code_1", YoyoType.CODE_1);
    public static final RegistryObject<Item> CODE_2_YOYO = registerYoyo("code_2", YoyoType.CODE_2);
    public static final RegistryObject<Item> FORMAT_C_YOYO = registerYoyo("format_c", YoyoType.FORMAT_C);
    public static final RegistryObject<Item> GRADIENT_YOYO = registerYoyo("gradient", YoyoType.GRADIENT);
    public static final RegistryObject<Item> HEL_FIRE_YOYO = registerYoyo("hel_fire", YoyoType.HEL_FIRE);
    public static final RegistryObject<Item> KRAKEN_YOYO = registerYoyo("kraken", YoyoType.KRAKEN);
    public static final RegistryObject<Item> MALAISE_YOYO = registerYoyo("malaise", YoyoType.MALAISE);
    public static final RegistryObject<Item> RALLY_YOYO = registerYoyo("rally", YoyoType.RALLY);
    public static final RegistryObject<Item> REDS_THROW_YOYO = registerYoyo("reds_throw", YoyoType.REDS_THROW);
    public static final RegistryObject<Item> TERRARIAN_YOYO = registerYoyo("terrarian", YoyoType.TERRARIAN);
    public static final RegistryObject<Item> THE_EYE_OF_CTHULHU_YOYO = registerYoyo("the_eye_of_cthulhu", YoyoType.THE_EYE_OF_CTHULHU);
    public static final RegistryObject<Item> VALKYRIE_YOYO = registerYoyo("valkyrie", YoyoType.VALKYRIE_YOYO);
    public static final RegistryObject<Item> VALOR_YOYO = registerYoyo("valor", YoyoType.VALOR);
    public static final RegistryObject<Item> WOODEN_YOYO = registerYoyo("wooden", YoyoType.WOODEN);
    public static final RegistryObject<Item> YELETS_YOYO = registerYoyo("yelets", YoyoType.YELETS);

    private static RegistryObject<Item> registerYoyo(String name, YoyoType type) {
        return ITEMS.register(name + "_yoyo", () -> new YoyoItem(type));
    }

}
