/*******************************************************************************
 * Copyright 2008, 2011 Hochschule Offenburg
 * Klaus Dorer, Mathias Ehret, Stefan Glaser, Thomas Huber, Fabian Korak,
 * Simon Raffeiner, Srinivasa Ragavan, Thomas Rinklin,
 * Joachim Schilling, Ingo Schindler, Rajit Shahi, Bjoern Weiler
 *
 * This file is part of magmaOffenburg.
 *
 * magmaOffenburg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * magmaOffenburg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with magmaOffenburg. If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package perceptor;


//import javax.vecmath.Vector3d;

import javax.vecmath.Vector3d;

//import org.apache.commons.math.geometry.Vector3D;


public class ForceResistancePerceptor {
	// point where the force acts
	public static Vector3d forceOrigin;

	// the force itself
	public static Vector3d force;
	
	public static String name;

	/**
	 * Default constructor, initializes origin and force to (0.0, 0.0, 0.0)
	 * @param name the name of the sensor
	 */	
	public ForceResistancePerceptor(String name, float fox, float foy,
			float foz, float fx, float fy, float fz)
	{
		name = ForceResistancePerceptor.name;
		forceOrigin = new Vector3d(fox, foy, foz);
		force = new Vector3d(fx, fy, fz);
	}

	public Vector3d getForceOrigin()
	{
		return forceOrigin;
	}

	public Vector3d getForce()
	{
		return force;
	}

	public static void setForceOrigin(Vector3d forceOr) {
		ForceResistancePerceptor.forceOrigin = forceOr;
	}

	public static void setForce(Vector3d force) {
		ForceResistancePerceptor.force = force;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		ForceResistancePerceptor.name = name;
	}

	
	
}