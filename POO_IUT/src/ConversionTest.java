import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversionTest {

	private static final double delta = 1e-8;

	@Test
	public void testToRpm() {
		assertEquals(95.4929658551372, Conversion.toRpm(10), delta);
	}

	@Test
	public void testToRadPerSec() {
		assertEquals(10, Conversion.toRadPerSec(95.4929658551372), delta);
	}

}
