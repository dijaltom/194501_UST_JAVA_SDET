package mockito;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertTrue;
import java.lang.ExceptionInInitializerError;
import java.util.List;

import org.mockito.Mockito;
import org.testng.annotations.Test;

public class saa {

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		// using Mockito.mock() method
		try {
			List<String> mockList = Mockito.mock(List.class);
			when(mockList.size()).thenReturn(5);
			assertTrue(mockList.size() == 5);

		} catch (ExceptionInInitializerError r) {
		}
	}

}
