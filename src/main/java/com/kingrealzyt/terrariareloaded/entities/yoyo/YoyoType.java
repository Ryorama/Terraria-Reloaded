package com.kingrealzyt.terrariareloaded.entities.yoyo;

import com.kingrealzyt.terrariareloaded.TerrariaReloaded;
import net.minecraft.util.ResourceLocation;

public enum YoyoType {

    //=========PRE_HARDMODE=========
    AMAZON(9, 3.75F, 6.5, 160, TerrariaReloaded.rlTexture("items/yoyo_amazon.png")),
    ARTERY(8, 4, 6.25, 120, TerrariaReloaded.rlTexture("items/yoyo_artery.png")),
    MALAISE(7, 4.5F, 7, 140, TerrariaReloaded.rlTexture("items/yoyo_malaise.png")),
    RALLY(6.0F, 3.5F, 5, 100, TerrariaReloaded.rlTexture("items/yoyo_rally.png")),
    WOODEN(4, 2.5F, 4.5F, 80, TerrariaReloaded.rlTexture("items/yoyo_wooden.png")),
    CODE_1(10, 3.25F, 6.75, 180, TerrariaReloaded.rlTexture("items/yoyo_code_1.png")),
    VALOR(10, 3.85F, 7, 220, TerrariaReloaded.rlTexture("items/yoyo_valor.png")),
    CASCADE(12, 4.3F, 7.75, 320, TerrariaReloaded.rlTexture("items/yoyo_cascade.png")),

    //=========HARDMODE=========
    FORMAT_C(16, 3.25F, 8, 160, TerrariaReloaded.rlTexture("items/yoyo_format_c.png")),
    CHICK(17, 3.3F, 8.5, 320, TerrariaReloaded.rlTexture("items/yoyo_chick.png")),
    GRADIENT(20, 3.8F, 7.75, 200, TerrariaReloaded.rlTexture("items/yoyo_gradient.png")),
    HEL_FIRE(21, 4.5F, 8.5, 210, TerrariaReloaded.rlTexture("items/yoyo_hel_fire.png")),
    AMAROK(21, 2.8F, 8.25, 300, TerrariaReloaded.rlTexture("items/yoyo_amarok.png")),
    CODE_2(24, 3.8F, 9, 1200, TerrariaReloaded.rlTexture("items/yoyo_code_2.png")),
    YELETS(18, 3.1F, 15, 280, TerrariaReloaded.rlTexture("items/yoyo_yelets.png")),
    REDS_THROW(32, 4.5F, 11.5, 1200, TerrariaReloaded.rlTexture("items/yoyo_reds_throw.png")),
    VALKYRIE_YOYO(32, 4.5F, 11.5, 1200, TerrariaReloaded.rlTexture("items/yoyo_valkyrie_yoyo.png")),
    KRAKEN(43, 4.3F, 10.5D, 1200, TerrariaReloaded.rlTexture("items/yoyo_kraken.png")),
    THE_EYE_OF_CTHULHU(52, 3.5F, 11.5, 1200, TerrariaReloaded.rlTexture("items/yoyo_the_eye_of_cthulu.png")),
    TERRARIAN(86, 6.5F, 22.5, 1200, TerrariaReloaded.rlTexture("items/yoyo_terrarian.png"));

    public static final YoyoType[] VALUES = values();

    private final ResourceLocation texture;
    private final float damage;
    private final float knockback;
    private final double length;
    private final int duration;

    YoyoType(float damage, float knockback, double length, int duration, ResourceLocation texture) {
        this.texture = texture;
        this.damage = damage;
        this.knockback = knockback;
        this.length = length;
        this.duration = duration;
    }

    public double getLength() {
        return length;
    }

    public float getKnockback() {
        return knockback / 10; //It have to be very low.
    }

    public int getDuration() {
        return duration;
    }

    public float getDamage() {
        return damage;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public static YoyoType getByName(String name) {
        switch (name) {
            case "amarok_yoyo":
                return AMAROK;
            case "amazon_yoyo":
                return AMAZON;
            case "artery_yoyo":
                return ARTERY;
            case "cascade_yoyo":
                return CASCADE;
            case "chick_yoyo":
                return CHICK;
            case "code_1_yoyo":
                return CODE_1;
            case "code_2_yoyo":
                return CODE_2;
            case "format_c_yoyo":
                return FORMAT_C;
            case "gradient_yoyo":
                return GRADIENT;
            case "hel_fire_yoyo":
                return HEL_FIRE;
            case "kraken_yoyo":
                return KRAKEN;
            case "malaise_yoyo":
                return MALAISE;
            case "rally_yoyo":
                return RALLY;
            case "reds_throw_yoyo":
                return REDS_THROW;
            case "terrarian_yoyo":
                return TERRARIAN;
            case "the_eye_of_cthulhu_yoyo":
                return THE_EYE_OF_CTHULHU;
            case "valkyrie_yoyo":
                return VALKYRIE_YOYO;
            case "valor_yoyo":
                return VALOR;
            case "wooden_yoyo":
                return WOODEN;
            case "yelets_yoyo":
                return YELETS;
            default:
                throw new IllegalStateException("Yoyotype not found");
        }
    }
}
