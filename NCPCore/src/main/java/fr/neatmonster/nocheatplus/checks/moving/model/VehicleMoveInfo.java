/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.neatmonster.nocheatplus.checks.moving.model;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import fr.neatmonster.nocheatplus.compat.MCAccess;
import fr.neatmonster.nocheatplus.utilities.RichEntityLocation;

public class VehicleMoveInfo extends MoveInfo<RichEntityLocation, Entity> {

    public VehicleMoveInfo(final MCAccess mcAccess){
        super(mcAccess, new RichEntityLocation(mcAccess, null), new RichEntityLocation(mcAccess, null));
    }

    @Override
    protected void set(RichEntityLocation rLoc, Location loc, Entity entity, double yOnGround) {
        rLoc.set(loc, entity, yOnGround);
    }

}