package org.aclement;

public aspect Azpect {

    after() returning: execution(* *.main(..)) {
        System.out.println("world");
    }
    
}
