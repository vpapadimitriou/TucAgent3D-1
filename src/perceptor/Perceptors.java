package perceptor;

import java.util.Vector;

import javax.vecmath.Vector3d;

import org.apache.commons.math.geometry.Vector3D;

//import org.apache.commons.math.geometry.Vector3D;
import connection.Connection;
import worldState.ServerTime;
import worldState.GameState;

public class Perceptors {

	public Perceptors() {

	}

	public void GetPerceptors(Connection con) {

		Vector<String> message = con.GetVector();

		// print message from server

		boolean iSeeTheBall = false;
		int i = 0;
		do {

			// System.out.println("--"+message.elementAt(i));
			if (!message.elementAt(i).equalsIgnoreCase(null)) {

				if (message.elementAt(i).equalsIgnoreCase("time")) {

					ServerTime.setName(message.elementAt(i + 1).toString());
					float time = Float.parseFloat(message.elementAt(i + 2)
							.toString());
					ServerTime.setTime(time);
					// System.out.println("time @ "+i);
					i = i + 3;

				} else if (message.elementAt(i).equalsIgnoreCase("B")) {

					iSeeTheBall = true;
					float distance = Float.parseFloat(message.elementAt(i + 2)
							.toString());
					Ball.setDistance(distance);
					float angleX = Float.parseFloat(message.elementAt(i + 3)
							.toString());
					Ball.setAngleX(angleX);
					float angleY = Float.parseFloat(message.elementAt(i + 4)
							.toString());
					Ball.setAngleY(angleY);
					// System.out.println("ball @ "+i);
					i = i + 5;

				} else if (message.elementAt(i).equalsIgnoreCase("GS")) {

					float time = Float.parseFloat(message.elementAt(i + 2)
							.toString());
					GameState.setGameTime(time);
					GameState.setGameState(message.elementAt(i + 4).toString());
					// System.out.println("game state @ "+i);
					i = i + 5;

				} else if (message.elementAt(i).equalsIgnoreCase("GYR")) {

					float anglex = Float.parseFloat(message.elementAt(i + 4)
							.toString());
					GyroScope.setAngleX(anglex);
					float angley = Float.parseFloat(message.elementAt(i + 5)
							.toString());
					GyroScope.setAngleY(angley);
					float anglez = Float.parseFloat(message.elementAt(i + 6)
							.toString());
					GyroScope.setAngleZ(anglez);
					// System.out.println("gyroscope @ "+i);
					i = i + 7;

				} else if (message.elementAt(i).equalsIgnoreCase("ACC")) {

					float accX = Float.parseFloat(message.elementAt(i + 4)
							.toString());
					Accelerometer.setAccX(accX);
					float accY = Float.parseFloat(message.elementAt(i + 5)
							.toString());
					Accelerometer.setAccX(accY);
					float accZ = Float.parseFloat(message.elementAt(i + 6)
							.toString());
					Accelerometer.setAccX(accZ);
					// System.out.println("accelerometer @ "+i);
					i = i + 7;

				} else if (message.elementAt(i).equalsIgnoreCase("UJ")) {

					// System.out.println("univ joint @ "+i);
					i = i + 1;

				} else if (message.elementAt(i).equalsIgnoreCase("TCH")) {

					// System.out.println("touch perceptor @ "+i);
					i = i + 1;

				} else if (message.elementAt(i).equalsIgnoreCase("HJ")) {
					float axis = 0;
					if (message.elementAt(i + 2).equalsIgnoreCase("hj1")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setHj1(axis);
					} else if (message.elementAt(i + 2).equalsIgnoreCase("hj2")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setHj2(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("laj1")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLaj1(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("laj2")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLaj2(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("laj3")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLaj3(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("laj4")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLaj4(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj1")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj1(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj2")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj2(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj3")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj3(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj4")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj4(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj5")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj5(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("llj6")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setLlj6(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj1")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj1(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj2")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj2(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj3")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj3(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj4")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj4(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj5")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj5(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("rlj6")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRlj6(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("raj1")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRaj1(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("raj2")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRaj2(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("raj3")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRaj3(axis);
					} else if (message.elementAt(i + 2)
							.equalsIgnoreCase("raj4")) {
						axis = Float.parseFloat(message.elementAt(i + 4)
								.toString());
						HingeJointPerceptor.setRaj4(axis);
					}

					//System.out.println("hint joint @ " + axis);
					i = i + 5;

				} else if (message.elementAt(i).equalsIgnoreCase("hear")) {

					// System.out.println("hear perceptor @ "+i);
					i = i + 1;

				} else if (message.elementAt(i).equalsIgnoreCase("see")) {

					// System.out.println("see perceptor @ "+i);
					i = i + 1;

				} else if (message.elementAt(i).equalsIgnoreCase("FRP")) {

					ForceResistancePerceptor.setName(message.elementAt(i+2).toString());
					Vector3d forceOr= new Vector3d();
					Vector3d force= new Vector3d();
					forceOr.x=Float.parseFloat(message.elementAt(i+4).toString());
					forceOr.y=Float.parseFloat(message.elementAt(i+5).toString());
					forceOr.z=Float.parseFloat(message.elementAt(i+6).toString());
					force.x=Float.parseFloat(message.elementAt(i+8).toString());
					force.y=Float.parseFloat(message.elementAt(i+9).toString());
					force.z=Float.parseFloat(message.elementAt(i+10).toString());
					ForceResistancePerceptor.setForceOrigin(forceOr);
					ForceResistancePerceptor.setForce(force);
					//System.out.println("force res perce @ "+i);
					i = i + 11;

				} else {
					i++;
				}
			}
		} while (i < message.size());

		Ball.setSeeTheBall(iSeeTheBall);
	}

}
