public class StrategyDemo {
    public static void main(String[] args) {
        Context2 context2 = new Context2(new OperationAdd());
        System.out.println("10 + 5 = " + context2.executeStrategy(10, 5));
        context2 = new Context2(new OperationSubtract());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5));
        context2 = new Context2(new OperationMultiply());
        System.out.println("10 * 5 = " + context2.executeStrategy(10, 5));
    }
}