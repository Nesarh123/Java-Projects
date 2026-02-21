package org.nesar;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiled using laptop");
    }
}
