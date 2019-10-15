package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

public class ComputerFacade{
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(1, hd.read(2, 3));
        processor.jump(1);
        processor.execute();
    }
}