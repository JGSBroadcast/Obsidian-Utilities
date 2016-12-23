package net.jgsb.obsidianutils.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeManager {

	public static void register(){

		GameRegistry.addShapelessRecipe(new ItemStack(Utilities.obsidian_ingot,9), new Object[]{
			Blocks.OBSIDIAN});

		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN,1), new Object[]{
			"OOO","OOO","OOO",'O',Utilities.obsidian_ingot});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_sword,1), new Object[]{
			"O","O","S",'O',Utilities.obsidian_ingot,'S',Items.STICK});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_pickaxe,1), new Object[]{
			"OOO"," S "," S ",'O',Utilities.obsidian_ingot,'S',Items.STICK});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_axe,1), new Object[]{
			"OO","OS"," S",'O',Utilities.obsidian_ingot,'S',Items.STICK});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_shovel,1), new Object[]{
			"O","S","S",'O',Utilities.obsidian_ingot,'S',Items.STICK});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_hoe,1), new Object[]{
			"OO"," S"," S",'O',Utilities.obsidian_ingot,'S',Items.STICK});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_helmet,1), new Object[]{
			"OOO","O O",'O',Utilities.obsidian_ingot});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_chestplate,1), new Object[]{
			"O O","OOO","OOO",'O',Utilities.obsidian_ingot});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_leggings,1), new Object[]{
			"OOO","O O","O O",'O',Utilities.obsidian_ingot});

		GameRegistry.addRecipe(new ItemStack(Utilities.obsidian_boots,1), new Object[]{
			"O O","O O",'O',Utilities.obsidian_ingot});

	}

}
