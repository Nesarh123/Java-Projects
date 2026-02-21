package org.nesar;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop Object created");
    }
    @Override
    public void compile() {
        System.out.println("Compiled using desktop");
    }
}
