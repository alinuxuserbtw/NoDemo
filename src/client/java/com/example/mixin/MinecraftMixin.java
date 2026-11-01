package com.example.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(method = "isDemo", at = @At("HEAD"), cancellable = true)
    private void disableDemoMode(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
