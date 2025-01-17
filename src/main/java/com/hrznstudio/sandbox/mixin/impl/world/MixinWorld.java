package com.hrznstudio.sandbox.mixin.impl.world;

import com.hrznstudio.sandbox.api.util.Side;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(World.class)
public abstract class MixinWorld implements com.hrznstudio.sandbox.api.world.World {
    @Shadow
    public abstract net.minecraft.block.BlockState getBlockState(BlockPos blockPos_1);

    @Shadow
    public abstract boolean isClient();

    @Override
    public Side getSide() {
        return this.isClient() ? Side.CLIENT : Side.SERVER;
    }
}