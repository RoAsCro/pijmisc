import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringStackTest {
	
	private StringStack stack = new PointerStringStack();
	
	/*public StringStackTest(StringStack stack) {
		this.stack = stack;
	}*/
	
	@Test
	void testFunctions() {
		assertEquals(null,stack.peek());
		assertEquals(null,stack.pop());
		assertTrue(stack.isEmpty());
		stack.push("K");
		stack.push("Q");
		assertEquals("Q",stack.peek());
		assertFalse(stack.isEmpty());
		assertEquals("Q",stack.pop());
		assertFalse(stack.isEmpty());
		assertEquals("K",stack.peek()); 
		assertFalse(stack.isEmpty());
		assertEquals("K",stack.pop());
		assertTrue(stack.isEmpty());
		assertEquals(null,stack.peek());
		assertEquals(null,stack.pop());
		stack.push("");
		stack.push(" ");
		assertEquals(" ",stack.peek());
		assertEquals(" ",stack.pop());
		assertFalse(stack.isEmpty());
		assertEquals("",stack.peek());
		assertEquals("",stack.pop());
		assertTrue(stack.isEmpty());
		
		
		//fail("Not yet implemented");
	}

}
