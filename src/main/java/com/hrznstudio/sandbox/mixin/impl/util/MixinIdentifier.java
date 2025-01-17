package com.hrznstudio.sandbox.mixin.impl.util;

import com.hrznstudio.sandbox.api.util.Identity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.*;

@Mixin(Identifier.class)
@Implements(@Interface(iface = Identity.class, prefix = "sbx$"))
@Unique
public abstract class MixinIdentifier {
    @Shadow
    public abstract String getNamespace();

    @Shadow
    public abstract String getPath();

    public String sbx$getNamespace() {
        return getNamespace();
    }

    public String sbx$getPath() {
        return getPath();
    }
}