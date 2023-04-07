package date_04_06.Builder;

public abstract class Builder {
    protected Bike mBike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}