package com.company;

public class Project {
    private final Manager manager;
    private final TesterProxy testerProxy;
    private final DeveloperProxy developerProxy;
    private boolean started;

    public Project(){
        started = false;
        manager = new Manager("Sabina");
        developerProxy = new DeveloperProxy("Karina",this.manager);
        DeveloperProxy DeveloperProxy = new DeveloperProxy("Madina",this.manager);
        developerProxy.addEmployee(DeveloperProxy);
        testerProxy = new TesterProxy("Alina",this.manager);
        TesterProxy testerProxy = new TesterProxy("Ayym", this.manager);
        testerProxy.addEmployee(testerProxy);
    }

    public Project(Manager manager){
        started = false;
        this.manager = manager;
        developerProxy = new DeveloperProxy("Sabina",manager);
        DeveloperProxy DeveloperProxy = new DeveloperProxy("Karina",manager);
        developerProxy.addEmployee(DeveloperProxy);
        testerProxy = new TesterProxy("Alina",manager);
        TesterProxy testerProxy = new TesterProxy("Madina", manager);
        testerProxy.addEmployee(testerProxy);
    }

    public void start(){
        if (testerProxy.responsibility() && developerProxy.responsibility()) started = true;
    }

    public void finish(){
        if(started && manager.finishWork(developerProxy.createDeveloper(),testerProxy.createTester())){
            System.out.println("project is finished");
        } else {
            System.out.println("project is not finished");
        }
    }
}
