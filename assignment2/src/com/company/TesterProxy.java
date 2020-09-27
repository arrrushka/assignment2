package com.company;

public class TesterProxy implements Proxy, Employee {
    public Tester tester;
    public Manager manager;

    public TesterProxy(String name, Manager manager){
        tester = new Tester(name);
        this.manager = manager;
    }

    public boolean haveManager(){
        return manager != null;
    }

    @Override
    public boolean responsibility(){
        if (haveManager()) {
            tester.responsibility();
            return true;
        }
        return false;
    }

    @Override
    public void addEmployee(Proxy employee) {
        if (employee instanceof TesterProxy) tester.addTester(((TesterProxy) employee).tester);

    }

    public boolean createTester(){
        if (haveManager())
            return tester.createTester();
        return false;
    }
}
