package com.aqupd.blindfold;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
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
    public static final Item BLINDFOLD_ITEM = new ArmorItem(BlindFoldMaterial, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.MISC));
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, BlindFoldMain.BLINDFOLD_EQUIP, BLINDFOLD_SOUND);
        Registry.register(Registry.ITEM, new Identifier("aqupd", "blindfold"), BLINDFOLD_ITEM);

        logInfo("BlindFold mod is loaded!");
    }
}
