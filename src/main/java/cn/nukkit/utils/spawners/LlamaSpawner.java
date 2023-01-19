/*
 * Decompiled with CFR 0.152.
 */
package cn.nukkit.utils.spawners;

import cn.nukkit.Player;
import cn.nukkit.entity.BaseEntity;
import cn.nukkit.level.Level;
import cn.nukkit.level.Position;
import cn.nukkit.utils.AbstractEntitySpawner;
import cn.nukkit.utils.SpawnerTask;
import cn.nukkit.utils.Utils;

public class LlamaSpawner
extends AbstractEntitySpawner {
    public LlamaSpawner(SpawnerTask spawnerTask) {
        super(spawnerTask);
    }

    @Override
    public void spawn(Player player, Position position, Level level) {
        int n;
        if (Utils.rand(1, 3) == 1) {
            return;
        }
        int n2 = level.getBiomeId((int)position.x, (int)position.z);
        if (!(n2 != 35 && n2 != 36 && n2 != 163 && n2 != 164 || !level.isAnimalSpawningAllowedByTime() || (n = level.getBlockIdAt((int)position.x, (int)position.y, (int)position.z)) != 2 && n != 78)) {
            BaseEntity baseEntity = this.spawnTask.createEntity("Llama", position.add(0.5, 1.0, 0.5));
            if (baseEntity == null) {
                return;
            }
            if (Utils.rand(1, 20) == 1) {
                baseEntity.setBaby(true);
            }
        }
    }

    @Override
    public final int getEntityNetworkId() {
        return 29;
    }
}

