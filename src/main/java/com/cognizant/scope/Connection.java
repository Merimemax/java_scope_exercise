package com.cognizant.scope;

public class Connection {
    boolean leased = false;
    static int nextId = 1;
    private int id = 0;

    int getid(){
        return this.id;
    }
    int runQuery(String s){
        System.out.println("Running " + s);
        return 0;
    }
    void close(){
        leased = false;
        id = nextId ++;
    }
}
