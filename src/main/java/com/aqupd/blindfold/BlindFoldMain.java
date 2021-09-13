package com.aqupd.blindfold;

import com.aqupd.blindfold.item.BlindFold;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.aqupd.blindfold.utils.AqLogger.*;

import com.aqupd.blindfold.materials.BlindFoldMaterial;

public class BlindFoldMain implements ModInitializer {
    public static final Identifier BLINDFOLD_EQUIP = new Identifier("aqupd:blindfold_equip");
    public static SoundEvent BLINDFOLD_SOUND = new SoundEvent(BLINDFOLD_EQUIP);

    public static final ArmorMaterial BlindFoldMaterial = new BlindFoldMaterial();
    public static final BlindFold BLINDFOLD_ITEM = new BlindFold(BlindFoldMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, BlindFoldMain.BLINDFOLD_EQUIP, BLINDFOLD_SOUND);
        Registry.register(Registry.ITEM, new Identifier("aqupd", "blindfold"), BLINDFOLD_ITEM);

        logInfo("BlindFold mod is loaded!");
    }
}
