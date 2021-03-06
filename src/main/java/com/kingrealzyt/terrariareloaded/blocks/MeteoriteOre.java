package com.kingrealzyt.terrariareloaded.blocks;

import com.google.common.collect.Lists;
import com.kingrealzyt.terrariareloaded.data.ILootTableData;
import com.kingrealzyt.terrariareloaded.data.LootTableDataHelper;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraft.world.storage.loot.conditions.SurvivesExplosion;
import net.minecraft.world.storage.loot.functions.ILootFunction;
import net.minecraftforge.common.ToolType;

import java.util.List;

public class MeteoriteOre extends OreBlock implements ILootTableData {

    public MeteoriteOre() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(6.0F, 20.0F)
            .sound(SoundType.METAL)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public NonNullList<Item> getDrops() {
        return null;
    }

    @Override
    public List<ILootCondition.IBuilder> lootConditions() {
        return Lists.newArrayList(SurvivesExplosion.builder());
    }

    @Override
    public List<ILootFunction.IBuilder> lootFunctions() {
        return Lists.newArrayList(LootTableDataHelper.APPLY_BONUS, LootTableDataHelper.EXPLOSION_DECAY);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        entityIn.setFire(1);
    }


}
