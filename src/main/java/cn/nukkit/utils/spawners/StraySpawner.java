/*
 * Decompiled with CFR 0.152.
 */
package cn.nukkit.utils.spawners;

import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Position;
import cn.nukkit.utils.AbstractEntitySpawner;
import cn.nukkit.utils.SpawnerTask;

public class StraySpawner
extends AbstractEntitySpawner {
    public StraySpawner(SpawnerTask spawnerTask) {
        super(spawnerTask);
    }

    @Override
    public void spawn(Player player, Position position, Level level) {
        int n = level.getBiomeId((int)position.x, (int)position.z);
        if ((n == 12 || n == 30) && level.getBlockLightAt((int)position.x, (int)position.y, (int)position.z) <= 7 && level.isMobSpawningAllowedByTime()) {
            this.spawnTask.createEntity("Stray", position.add(0.5, 1.0, 0.5));
        }
    }

    @Override
    public final int getEntityNetworkId() {
        return 46;
    }
}

