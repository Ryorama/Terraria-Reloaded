package com.kingrealzyt.terrariareloaded;

import com.kingrealzyt.terrariareloaded.init.ModEntityTypes;
import com.kingrealzyt.terrariareloaded.init.ModItems;
import com.kingrealzyt.terrariareloaded.init.SoundInit;
import com.kingrealzyt.terrariareloaded.world.capability.PlayerCoinStorage;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

@Mod("terrariareloaded")
public class TerrariaReloaded {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "terrariareloaded";

    public TerrariaReloaded() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        SoundInit.SOUNDS.register(modEventBus);
        ModItems.init();
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

        //Register the capability
        CapabilityManager.INSTANCE.register(PlayerCoinStorage.class, new Capability.IStorage<PlayerCoinStorage>() {
            @Nullable
            @Override
            public INBT writeNBT(Capability<PlayerCoinStorage> capability, PlayerCoinStorage instance, Direction side) {
                return null;
            }

            @Override
            public void readNBT(Capability<PlayerCoinStorage> capability, PlayerCoinStorage instance, Direction side, INBT nbt) {

            }
        }, PlayerCoinStorage::new);

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    public static ResourceLocation rlTexture(String path) {
        return new ResourceLocation(MOD_ID, "textures/" + path);
    }


    // Tabs

    public static final ItemGroup SWORDS = new ItemGroup("Swords") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COPPER_SHORTSWORD.get());
        }
    };

    public static final ItemGroup RANGED = new ItemGroup("Ranged") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.HALLOWED_REPEATER_ITEM.get());
        }
    };

    public static final ItemGroup THROW = new ItemGroup("Throwable") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.THROWING_KNIFE_ITEM.get());
        }
    };

    public static final ItemGroup AXE = new ItemGroup("Axe") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COPPER_AXE.get());
        }
    };

    public static final ItemGroup PICKAXE = new ItemGroup("Pickaxe") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COPPER_PICKAXE.get());
        }
    };

    public static final ItemGroup BOSS = new ItemGroup("BossSpawns") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.GUIDE_VOODOO.get());
        }
    };

    public static final ItemGroup MISC = new ItemGroup("Miscellaneous") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MAGIC_MIRROR.get());
        }
    };


}
