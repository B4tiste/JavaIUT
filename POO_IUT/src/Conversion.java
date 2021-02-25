
public class Conversion {

	public static double toRpm(double radPerSec) // Conversion de radians par secondes en tours par minute
	{
		return (radPerSec * (30 / Math.PI));
	}

	public static double toRadPerSec(double rpm) // Conversion de tours par minute en radians par secondes
	{
		return (rpm * (Math.PI / 30));
	}

}
