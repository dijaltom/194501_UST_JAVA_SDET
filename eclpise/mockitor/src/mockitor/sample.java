package mockitor;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;

public class sample {

	@SuppressWarnings("unchecked")
	public List<String> mockList = mock(List.class);;

	@Test
	public void test() {
		// using Mockito.mock() method

		System.out.println("sc");
		System.out.println("sc");
		when(mockList.size()).thenReturn(5);
		System.out.println("sc");
		assertTrue(mockList.size() == 5);
		System.out.println("sc");

	}

}