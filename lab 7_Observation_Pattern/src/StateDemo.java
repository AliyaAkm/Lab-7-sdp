public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Start state
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current State: " + context.getState());

        // Stop state
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current State: " + context.getState());
    }
}