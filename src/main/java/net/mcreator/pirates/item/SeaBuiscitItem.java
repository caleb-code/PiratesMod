
package net.mcreator.pirates.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.pirates.PiratesElements;

@PiratesElements.ModElement.Tag
public class SeaBuiscitItem extends PiratesElements.ModElement {
	@ObjectHolder("pirates:seabuiscit")
	public static final Item block = null;
	public SeaBuiscitItem(PiratesElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(2).saturation(0.5f).setAlwaysEdible().build()));
			setRegistryName("seabuiscit");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
