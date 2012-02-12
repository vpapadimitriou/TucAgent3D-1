package action;

public class Dance {

	public Dance() {

	}

	public String perform(int i) {
		i += 0.09;

		double sin = Math.sin(i) * 10;
		double cos = Math.cos(i) * 5;
		// System.out.println(sin + "\t" + cos);

		String DanceSent = "";

		DanceSent = "(" + "rae1 " + (80 + cos) + ")";
		DanceSent += "(" + "lae1 " + (80 + cos) + ")";
		DanceSent += "(" + "rae2 " + (-sin) + ")";
		DanceSent += "(" + "lae2 " + (-sin) + ")";

		return (DanceSent);

		/*
		 * agentModel.getWriteableHJ(INaoConstants.RHipRoll).performAxisPosition(
		 * -sin);
		 * agentModel.getWriteableHJ(INaoConstants.LHipRoll).performAxisPosition
		 * ( -sin);
		 * agentModel.getWriteableHJ(INaoConstants.RFootRoll).performAxisPosition
		 * ( sin);
		 * agentModel.getWriteableHJ(INaoConstants.LFootRoll).performAxisPosition
		 * ( sin);
		 * 
		 * 
		 * agentModel.getWriteableHJ(INaoConstants.RHipPitch).performAxisPosition
		 * ( -cos + 35, 4);
		 * agentModel.getWriteableHJ(INaoConstants.LHipPitch).performAxisPosition
		 * ( -cos + 35, 4);
		 * agentModel.getWriteableHJ(INaoConstants.RFootPitch).performAxisPosition
		 * ( cos + 35, 4);
		 * agentModel.getWriteableHJ(INaoConstants.LFootPitch).performAxisPosition
		 * ( cos + 35, 4);
		 * 
		 * 
		 * agentModel.getWriteableHJ(INaoConstants.RKneePitch).performAxisPosition
		 * ( -65);
		 * agentModel.getWriteableHJ(INaoConstants.LKneePitch).performAxisPosition
		 * ( -65);
		 * 
		 * agentModel.getWriteableHJ(INaoConstants.RArmYaw)
		 * .performAxisPosition(0, 2);
		 * agentModel.getWriteableHJ(INaoConstants.LArmYaw)
		 * .performAxisPosition(0, 2);
		 */

	}

}
