package com.cognizant.scope;

public class ConnectionPool {

    private int max;

    private Connection[] pool;

    public ConnectionPool(int max) {
        this.max = max;
        pool  = new Connection[max];
    }

    public Connection[] getPool() {
        return pool;
    }

    public Connection createConnection(){
        for (int i = 0; i < max ; i++) {
            pool[i] = new Connection();
            pool[i].setLeased(true);
        }
        return pool[0];
    }

    public int getLeasedCount(){
        int count = 0 ;
        for(Connection c : pool){
            if(c.isLeased()){
                count++;
            }
        }
        return count;
    }

    public Connection getConnection(){

        for(Connection c : pool){
            if(!c.isLeased()){
                c.setLeased(true);
                return c;
            }
        }
        return pool[0];
    }

    public void releaseConnection(Connection connection) throws Exception {
        connection.close();
    }

}
