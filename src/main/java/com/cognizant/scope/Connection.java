package com.cognizant.scope;

public class Connection implements AutoCloseable {

    private boolean leased = false;
    private static int nextId = 1;
    private int id = 0;

//    private Connection(){}

    @Override
    public void close() throws Exception {
        this.leased = false;
        this.id = this.nextId - 1;
    }

    public void runQuery(String q){

    }

    public boolean isLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
        this.leased = leased;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Connection.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
