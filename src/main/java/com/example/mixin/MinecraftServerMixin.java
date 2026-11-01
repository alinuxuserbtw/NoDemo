package com.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @Inject(
        method = "isDemo",
        at = @At("HEAD"),
        cancellable = true
    )
    private void disableDemo(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
