public class Supervisor implements Runnable {

    private AbstractProgram abstractProgram;
    private Thread executableThread;

    public Supervisor(AbstractProgram abstractProgram) {
        this.abstractProgram = abstractProgram;
        executableThread = new Thread(abstractProgram);
    }

    @Override
    public void run() {
        executableThread.start();
        synchronized (abstractProgram) {
            while (!Thread.interrupted() || executableThread.isInterrupted()) {
                try {
                    abstractProgram.wait();
                    reactToStateChange(abstractProgram.getState());
                    abstractProgram.notify();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("FATAL ERROR -> abstract program is finished");
                    break;
                }
            }
        }
    }

    private void reactToStateChange(ProgramState state) throws InterruptedException {
        switch (state) {
            case FATAL_ERROR -> {
                executableThread.interrupt();
                throw new InterruptedException();
            }
            case STOPPING -> restartProgram();
            default -> System.out.println("State of abstract program is " + state);
        }
    }

    void restartProgram() {
        System.out.println("State STOPPING -> restarting abstract program " +
                "<Counter value at the moment of restarting is " + abstractProgram.getCounter() + '>');
        abstractProgram.resetCounter();
    }
}
