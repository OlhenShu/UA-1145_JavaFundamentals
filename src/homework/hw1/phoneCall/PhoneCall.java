package homework.hw1.phoneCall;

public class PhoneCall {
    public double duration;

    public double costPerMinute;

    public PhoneCall(double duration, double costPerMinute) {
        this.duration = duration;
        this.costPerMinute = costPerMinute;
    }

    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getCostPerMinute() {
        return costPerMinute;
    }

    public void setCostPerMinute(double costPerMinute) {
        this.costPerMinute = costPerMinute;
    }
}
