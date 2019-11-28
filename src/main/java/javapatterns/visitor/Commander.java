package javapatterns.visitor;

public class Commander extends Unit {

    public Commander(Unit... children) {
      super(children);
    }
  
    @Override
    public void accept(UnitVisitor visitor) {
      System.out.println(visitor.getClass());
      visitor.visitCommander(this);
      super.accept(visitor);
    }
  
    @Override
    public String toString() {
      return "commander";
    }
  }