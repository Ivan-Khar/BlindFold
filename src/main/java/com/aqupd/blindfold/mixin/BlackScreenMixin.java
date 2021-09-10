package com.aqupd.blindfold.mixin;

import com.aqupd.blindfold.BlindFoldMain;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class BlackScreenMixin {
    private static final Identifier BLACK = new Identifier("aqupd:textures/misc/black.png");
    private final MinecraftClient client;
    public BlackScreenMixin(MinecraftClient client) {
        this.client = client;
    }

    @Inject(method = "render", at = @At("HEAD"))
    public void render(CallbackInfo info){
        if (this.client.options.getPerspective().isFirstPerson()) {
            ItemStack itemStack = this.client.player.getInventory().getArmorStack(3);
            if (itemStack.isOf(BlindFoldMain.BLINDFOLD_ITEM.asItem())) {
                this.renderOverlay(BLACK, 1.0F);
            }
        }
    }

    @Shadow
    private void renderOverlay(Identifier pumpkinBlur, float v) {}
}
