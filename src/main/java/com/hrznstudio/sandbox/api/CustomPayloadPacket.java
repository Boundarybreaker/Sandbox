package com.hrznstudio.sandbox.api;

import net.minecraft.util.Identifier;
import net.minecraft.util.PacketByteBuf;

public interface CustomPayloadPacket {
    Identifier channel();

    PacketByteBuf data();

    interface LoginQueryPacket {
        int getQueryId();

        PacketByteBuf getBuffer();
    }

    interface Handshake {
        String getPassword();
    }
}