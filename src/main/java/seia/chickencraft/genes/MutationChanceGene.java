package seia.chickencraft.genes;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Basic gene for displaying mutation chance.
 * 
 * @author Krzysztof "Sejoslaw" Dobrzynski - k.dobrzynski94@gmail.com
 */
public class MutationChanceGene extends BaseChickenGene {
	public String getDisplayName() {
		return "Mutation chance (in %)";
	}

	public void onChickenProduceEgg(EntityChicken chicken, ItemStack eggStack) {
		this.newValue = this.getNewRandomPercentage();
		this.writeNewDataToStack(eggStack);
	}

	protected String getDefaultGeneValue(NBTTagCompound tag) {
		return "50.00";
	}
}
