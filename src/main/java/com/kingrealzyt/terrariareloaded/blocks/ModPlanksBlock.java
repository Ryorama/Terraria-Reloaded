package com.kingrealzyt.terrariareloaded.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ModPlanksBlock extends Block {

    public ModPlanksBlock() {
        super(Properties.create(Material.WOOD)
            .hardnessAndResistance(1.0F, 1.0F)
            .sound(SoundType.WOOD)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE));
    }

}
