package activities;

public class Activity7 {

    public static void main(String[] args) {
        MountainBike mBike = new MountainBike(3,0,25);
        System.out.println(mBike.bicycleDesc());
        mBike.speedUp(20);
        mBike.applyBrake(5);
    }
}
