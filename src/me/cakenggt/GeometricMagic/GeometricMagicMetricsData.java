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

public class GeometricMagicMetricsData {
	private Object dataLock = new Object();
	private int microCircleCount = 0;
	private int teleportCircleCount = 0;
	private int transmutationCircleCount = 0;
	private int setCircleCount = 0;
	private int storageCircleCount = 0;
	
	public Object getLock() {
		return dataLock;
	}
	
	public int getMicroCircleCount() {
		return microCircleCount;
	}
	
	public int getTeleportCircleCount() {
		return teleportCircleCount;
	}
	
	public int getTransmutationCircleCount() {
		return transmutationCircleCount;
	}
	
	public int getSetCircleCount() {
		return setCircleCount;
	}
	
	public int getStorageCircleCount() {
		return storageCircleCount;
	}
	
	public void incrementMicroCircleCount(int i) {
		microCircleCount = microCircleCount + i;
	}
	
	public void incrementTeleportCircleCount(int i) {
		teleportCircleCount = teleportCircleCount + i;
	}
	
	public void incrementTransmutationCircleCount(int i) {
		transmutationCircleCount = transmutationCircleCount + i;
	}
	
	public void incrementSetCircleCount(int i) {
		setCircleCount = setCircleCount + i;
	}
	
	public void incrementStorageCircleCount(int i) {
		storageCircleCount = storageCircleCount + i;
	}
}