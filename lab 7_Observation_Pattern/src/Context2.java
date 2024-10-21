public class Context2 {
    private Strategy strategy;
    public Context2(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
