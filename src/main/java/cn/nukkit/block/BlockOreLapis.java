/*
 * Decompiled with CFR 0.152.
 */
package cn.nukkit.block;

import cn.nukkit.block.BlockSolid;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.utils.Utils;

public class BlockOreLapis
extends BlockSolid {
    @Override
    public int getId() {
        return 21;
    }

    @Override
    public double getHardness() {
        return 3.0;
    }

    @Override
    public double getResistance() {
        return 5.0;
    }

    @Override
    public int getToolType() {
        return 3;
    }

    @Override
    public String getName() {
        return "Lapis Lazuli Ore";
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= 3) {
            if (item.hasEnchantment(16)) {
                return new Item[]{this.toItem()};
            }
            int n = 4 + Utils.random.nextInt(5);
            Enchantment enchantment = item.getEnchantment(18);
            if (enchantment != null && enchantment.getLevel() >= 1) {
                int n2 = Utils.random.nextInt(enchantment.getLevel() + 2) - 1;
                if (n2 < 0) {
                    n2 = 0;
                }
                n += n2;
            }
            return new Item[]{Item.get(351, 4, n)};
        }
        return new Item[0];
    }

    @Override
    public int getDropExp() {
        return Utils.rand(2, 5);
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public boolean canSilkTouch() {
        return true;
    }
}

