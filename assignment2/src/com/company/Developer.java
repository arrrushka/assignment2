package com.company;

import java.util.ArrayList;
import java.util.List;

public class Developer implements Employee {
    private String name;
    private List<Developer> developers;

    public Developer(String name) {
        this.name = name;
        developers = new ArrayList<>();
    }

    @Override
    public boolean responsibility() {
        System.out.println(Developer.class + " has responsibility");
        for (Developer developer : developers) {
            developer.responsibility();
        }
        return true;
    }

    public boolean createDeveloper() {
        System.out.println("Developer created");
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public void addDeveloper (Developer developer) {
        developers.add(developer);
    }
}
