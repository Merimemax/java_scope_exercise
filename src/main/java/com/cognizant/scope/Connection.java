package com.cognizant.scope;

public class Connection {
    boolean leased = false;
    static int nextId = 1;
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    void close(){
        leased = false;
        id = nextId ++;
    }
}
