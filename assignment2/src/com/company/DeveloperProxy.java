package com.company;

public class DeveloperProxy implements Proxy, Employee {
    public Developer developer;
    public Manager manager;

    public DeveloperProxy(String name, Manager manager) {
        this.manager = manager;
        developer = new Developer(name);
    }

    public boolean haveManager() {
        return manager != null;
    }

    @Override
    public boolean responsibility() {
        if (haveManager()) {
            return developer.responsibility();
        }
        return false;
    }

    @Override
    public void addEmployee(Proxy employee) {
        if (employee instanceof DeveloperProxy) developer.addDeveloper(((DeveloperProxy) employee).developer);
    }

    public boolean createDeveloper() {
        if (haveManager())
            return developer.createDeveloper();
        return false;
    }

}
