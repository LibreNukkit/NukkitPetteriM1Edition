/*
 * Decompiled with CFR 0.152.
 */
package cn.nukkit.event.block;

import cn.nukkit.block.Block;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.event.block.BlockEvent;

public class WaterFrostEvent
extends BlockEvent
implements Cancellable {
    private static final HandlerList b = new HandlerList();

    public static HandlerList getHandlers() {
        return b;
    }

    public WaterFrostEvent(Block block) {
        super(block);
    }
}

