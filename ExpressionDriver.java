/**
 * Driver class ("script") for working with the Expression hierarchy.
 */
public class ExpressionDriver {

    public static void main(String[] args) {
        Expression intExp1 = new IntConstant(8);
        Expression intExp2 = new IntConstant(10);
        Expression plusExp = new PlusExpression(intExp1, intExp2);
        System.out.println("(8 + 10) = " + plusExp.value());
        System.out.println("(8 + 10) has " + plusExp.numberOfNodes() + " nodes");
        System.out.println(plusExp.toString());
        Expression timesExp = new TimesExpression(plusExp, intExp1);
        System.out.println(timesExp.value());
        System.out.println(timesExp.toString());
        
        Expression divExp = new DivExpression(timesExp, intExp2);
        System.out.println(divExp.value());
        System.out.println(divExp.toString());
        
    }
}
