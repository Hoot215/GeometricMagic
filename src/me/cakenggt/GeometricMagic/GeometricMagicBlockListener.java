/**
 * GeometricMagic allows players to draw redstone circles on the ground to do things such as teleport and transmute blocks.
 * Copyright (C) 2012  Alec Cox (cakenggt), Andrew Stevanus (Hoot215) <hoot893@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.cakenggt.GeometricMagic;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

public class GeometricMagicBlockListener implements Listener {
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onBlockPhysics(BlockPhysicsEvent event) {
		event.setCancelled(true);
	}
}