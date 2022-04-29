package xyz.unifycraft.template.mixins;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.unifycraft.template.TemplateMod;

@Mixin({MinecraftClient.class})
public class MinecraftMixin {
    @Inject(method = "<init>", at = @At("HEAD"))
    private static void onGameStarted(CallbackInfo ci) {
        TemplateMod.getLogger().info("Hello, Minecraft!");
    }
}