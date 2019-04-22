package com.cognizant.scope;

public class ConnectionPool {
    private static final int MAX = 5;

    Connection[] pool = new Connection[MAX];

    private Connection createConnection(){
        Connection c;
        for(int i = 0; i < MAX; i++){
            c = new Connection();
            pool[i] = c;
        }
    }

    private Connection getConnection(){

        for(Connection c : pool){
            if(c.leased == false){
                c.leased = true;
                return c;
            }
        }
        return null;
    }

    void releaseConnection(Connection connection){

    }

    int getLeasedCount(){
        int count = 0 ;
        for(Connection c : pool){
            if(!c.leased){
                count++;
            }
        }
        return count;
    }
}
