package com.cognizant.scope;

public class ConnectionPool {
    int max = 5;

    Connection[] pool = new Connection[max];

    Connection getConnetion(){
        return new Connection();
    }
    void releaseConnection(Connection connection){

    }
    int getLeasedCount(){
        return 0;
    }
}
