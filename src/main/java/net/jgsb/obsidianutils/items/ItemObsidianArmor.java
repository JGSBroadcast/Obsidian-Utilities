package net.jgsb.obsidianutils.items;

import net.jgsb.obsidianutils.Reference;
import net.jgsb.obsidianutils.init.Utilities;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemObsidianArmor extends ItemArmor {

	private String texturePath = Reference.MOD_ID + ":" + "textures/models/armor/";

	public ItemObsidianArmor(ArmorMaterial armorMaterial, int renderIndex, EntityEquipmentSlot armorType) {
		super(armorMaterial, renderIndex, armorType);

		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot armorType, String layer) {
		if(armorType == EntityEquipmentSlot.HEAD || armorType == EntityEquipmentSlot.CHEST || armorType == EntityEquipmentSlot.FEET) {
			return texturePath + "obsidian_layer_1.png";
		}

		if(armorType == EntityEquipmentSlot.LEGS) {
			return texturePath + "obsidian_layer_2.png";
		}

		else return null;
	}
}

