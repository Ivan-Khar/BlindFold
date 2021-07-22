package com.aqupd.blindfold.materials;

import com.aqupd.blindfold.BlindFoldMain;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class BlindFoldMaterial implements ArmorMaterial{
    private static final int[] BASE_DURABILITY = new int[] {10, 10, 10, 10};
	private static final int[] PROTECTION_VALUES = new int[] {2, 2, 2, 2}; 
    
    @Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 128;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 15;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return BlindFoldMain.BLINDFOLD_SOUND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.LEATHER);
	}
 
	@Override
	public String getName() {
		return "blindfold";
	}
 
	@Override
	public float getToughness() {
		return 2.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0.0F;
	}
}
