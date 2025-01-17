package com.hrznstudio.sandbox.mixin.fabric.networking;

import com.hrznstudio.sandbox.api.ClientConnectionInternal;
import net.minecraft.network.ClientConnection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.net.SocketAddress;

@Mixin(ClientConnection.class)
public class MixinClientConnection implements ClientConnectionInternal {
    @Shadow
    private SocketAddress address;

    @Override
    public void setSocketAddress(SocketAddress address) {
        this.address = address;
    }
}
