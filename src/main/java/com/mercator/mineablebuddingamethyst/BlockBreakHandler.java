package com.mercator.mineablebuddingamethyst;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakHandler implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();
        Material blockMaterial = blockBroken.getType();
        World world = blockBroken.getWorld();

        if (blockMaterial == Material.BUDDING_AMETHYST) {
            world.dropItemNaturally(blockBroken.getLocation(), new ItemStack(Material.BUDDING_AMETHYST, 1));
        }
    }
}
