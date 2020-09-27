package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tester implements Employee {
    private String name;
    private List<Tester> testers;

    public Tester(String name) {
        this.name = name;
        testers = new ArrayList<>();
    }

    @Override
    public boolean responsibility() {
        System.out.println(Tester.class + " has responsibility");
        for (Tester tester : testers) {
            tester.responsibility();
        }
        return true;
    }

    public boolean createTester() {
        System.out.println("Tester created");
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tester> getTesters() {
        return testers;
    }

    public void setTesters(List<Tester> testers) {
        this.testers = testers;
    }

    public void addTester (Tester tester) {
        testers.add(tester);
    }

}
