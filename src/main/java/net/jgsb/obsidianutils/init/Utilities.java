package net.jgsb.obsidianutils.init;

import net.jgsb.obsidianutils.items.ItemObsidianAxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.jgsb.obsidianutils.Reference;
import net.jgsb.obsidianutils.items.ItemObsidianArmor;
import net.jgsb.obsidianutils.items.ItemObsidianPickaxe;

public class Utilities {

	public static Item obsidian_ingot;
	public static Item obsidian_sword;
	public static Item obsidian_pickaxe;
	public static Item obsidian_axe;
	public static Item obsidian_shovel;
	public static Item obsidian_hoe;
	public static Item obsidian_helmet;
	public static Item obsidian_chestplate;
	public static Item obsidian_leggings;
	public static Item obsidian_boots;

	public static ToolMaterial enumToolMaterialOBSIDIAN = EnumHelper.addToolMaterial("Obsidian", 3, 1600, 8.0F, 3.0F, 10);
	public static ArmorMaterial enumArmorMaterialOBSIDIAN = EnumHelper.addArmorMaterial("Obsidian", "obsidian", 35, new int[]{3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public static void init(){

		obsidian_ingot = new Item().setUnlocalizedName("obsidian_ingot").setCreativeTab(CreativeTabs.MATERIALS);

		enumToolMaterialOBSIDIAN.setRepairItem(new ItemStack(obsidian_ingot));
		enumArmorMaterialOBSIDIAN.setRepairItem(new ItemStack(obsidian_ingot));

		obsidian_sword = new ItemSword(enumToolMaterialOBSIDIAN).setUnlocalizedName("obsidian_sword");
		obsidian_pickaxe = new ItemObsidianPickaxe(enumToolMaterialOBSIDIAN).setUnlocalizedName("obsidian_pickaxe");
		obsidian_axe = new ItemObsidianAxe(enumToolMaterialOBSIDIAN).setUnlocalizedName("obsidian_axe");
		obsidian_shovel = new ItemSpade(enumToolMaterialOBSIDIAN).setUnlocalizedName("obsidian_shovel");
		obsidian_hoe = new ItemHoe(enumToolMaterialOBSIDIAN).setUnlocalizedName("obsidian_hoe");
		obsidian_helmet = new ItemObsidianArmor(enumArmorMaterialOBSIDIAN, 5, EntityEquipmentSlot.HEAD).setUnlocalizedName("obsidian_helmet");
		obsidian_chestplate = new ItemObsidianArmor(enumArmorMaterialOBSIDIAN, 5, EntityEquipmentSlot.CHEST).setUnlocalizedName("obsidian_chestplate");
		obsidian_leggings = new ItemObsidianArmor(enumArmorMaterialOBSIDIAN, 5, EntityEquipmentSlot.LEGS).setUnlocalizedName("obsidian_leggings");
		obsidian_boots = new ItemObsidianArmor(enumArmorMaterialOBSIDIAN, 5, EntityEquipmentSlot.FEET).setUnlocalizedName("obsidian_boots");

	}

	public static void register(){

		GameRegistry.register(obsidian_ingot, new ResourceLocation(Reference.MOD_ID, obsidian_ingot.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_sword, new ResourceLocation(Reference.MOD_ID, obsidian_sword.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_pickaxe, new ResourceLocation(Reference.MOD_ID, obsidian_pickaxe.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_axe, new ResourceLocation(Reference.MOD_ID, obsidian_axe.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_shovel, new ResourceLocation(Reference.MOD_ID, obsidian_shovel.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_hoe, new ResourceLocation(Reference.MOD_ID, obsidian_hoe.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_helmet, new ResourceLocation(Reference.MOD_ID, obsidian_helmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_chestplate, new ResourceLocation(Reference.MOD_ID, obsidian_chestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_leggings, new ResourceLocation(Reference.MOD_ID, obsidian_leggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(obsidian_boots, new ResourceLocation(Reference.MOD_ID, obsidian_boots.getUnlocalizedName().substring(5)));

	}

	public static void registerRenders(){

		registerRender(obsidian_ingot);
		registerRender(obsidian_sword);
		registerRender(obsidian_pickaxe);
		registerRender(obsidian_axe);
		registerRender(obsidian_shovel);
		registerRender(obsidian_hoe);
		registerRender(obsidian_helmet);
		registerRender(obsidian_chestplate);
		registerRender(obsidian_leggings);
		registerRender(obsidian_boots);

	}

	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
