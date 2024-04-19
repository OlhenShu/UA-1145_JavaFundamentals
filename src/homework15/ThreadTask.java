package homework15;

public class ThreadTask extends Thread {
    private String message;
    private int amount;

    public ThreadTask(String message, int amount) {
        this.message = message;
        this.amount = amount;
    }
    @Override
    public void run(){
        for(int i=0;i<amount;i++){
            System.out.println(message);
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
