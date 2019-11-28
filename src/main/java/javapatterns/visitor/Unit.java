package javapatterns.visitor;

import java.util.Arrays;

// interface for the nodes in object
public abstract class Unit{

    private Unit[] children;

    Unit(Unit... children){
        this.children=children;
    }

    // accept visitor
    public void accept(UnitVisitor visitor){
        System.out.println("default");
        //Arrays.stream(children).forEach(child->child.accept(visitor));
    }
}