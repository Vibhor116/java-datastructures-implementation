package javapatterns.adaptor;

public final class Captain {

    private RowingBoat rowingBoat;
  
    public Captain() {
    }
  
    public Captain(final RowingBoat boat) {
      this.rowingBoat = boat;
    }
  
    void setRowingBoat(final RowingBoat boat) {
      this.rowingBoat = boat;
    }
  
    void row() {
      rowingBoat.row();
    }

}