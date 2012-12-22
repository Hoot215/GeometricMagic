package me.cakenggt.GeometricMagic;

import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

/**
 * Class, that allows setting and getting color of the leather armor.
 */
public class Armor {

	/**
	 * Checks if item is applicable.
	 * 
	 * @param item the item to check
	 * @return true, if is applicable
	 */
	public static boolean isApplicable(ItemStack item) {
		switch (item.getType()) {
		case LEATHER_BOOTS:
		case LEATHER_CHESTPLATE:
		case LEATHER_HELMET:
		case LEATHER_LEGGINGS:
			return true;
		default:
			return false;
		}
	}

	/**
	 * Sets the color.
	 * 
	 * @param item item to color
	 * @param color color
	 * @return colored item
	 * @throws Exception thrown, when item is not applicable
	 */
	public static ItemStack setColor(ItemStack item, Color color) throws Exception {
		if (!isApplicable(item)) return null;

		LeatherArmorMeta lam = (LeatherArmorMeta) item.getItemMeta();
		lam.setColor(color);
		item.setItemMeta(lam);
		
		return item;
	}

	/**
	 * Gets the color.
	 * 
	 * @param item colored item
	 * @return color
	 */
	public static Color getColor(ItemStack item) {
		if (!isApplicable(item)) return null;
		
		LeatherArmorMeta lam = (LeatherArmorMeta) item.getItemMeta();
		Color color = lam.getColor();
		
		return color;
	}
}
