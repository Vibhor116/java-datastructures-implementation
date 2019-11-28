package javapatterns.adaptor;

public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;
  
    public FishingBoatAdapter() {
      boat = new FishingBoat();
    }
  
    public final void row() {
      boat.sail();
    } 
}