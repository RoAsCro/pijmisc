/**
 * represents an expression of the form (e1 / e2)
 * @author rolly
 *
 */
public class DivExpression extends BinaryExpression {

	/**
	 * Constructs a DivExpression with left and right as direct subexpressions.
	 * 
	 * @param left the left subexpression
	 * @param right the right subexpression
	 * @throws NullPointerException if left or right is null
	 */
	
	public DivExpression(Expression left, Expression right) {
		super(left, right, "/");
	}

	@Override
	public int value() {
		// TODO Auto-generated method stub
		return this.getLeft().value() / this.getRight().value();
	}

	
}
