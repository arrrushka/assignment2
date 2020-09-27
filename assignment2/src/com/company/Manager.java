package com.company;

public class Manager implements Employee {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public boolean responsibility() {
        System.out.println(Manager.class + " has responsibility");
        return true;
    }

    public boolean finishWork(boolean developer, boolean tester) {
        return developer && tester;
    }
}
