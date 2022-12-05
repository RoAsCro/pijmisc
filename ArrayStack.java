public class ArrayStack<T> {
private T[] contents;
private int headIndex;



public void push(T newElement) {
contents[headIndex] = newElement;
headIndex++;
}
public T pop() {
if (headIndex == 0) {
return null;
}
headIndex--;
T result = contents[headIndex];
contents[headIndex] = null;
return result;
}
// ... constructor and other methods would be here ...
}