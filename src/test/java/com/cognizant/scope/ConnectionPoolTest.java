package com.cognizant.scope;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectionPoolTest {
    private static final int CONN_SIZE = 5;

    ConnectionPool connectionPool;

    @Before
    public void setup(){
        connectionPool = new ConnectionPool(CONN_SIZE);
    }
    @Test
    public void createConnection() {

        Connection actual = connectionPool.createConnection();

        int actual_size = CONN_SIZE;

        int expected = connectionPool.getPool().length;

        assertEquals(expected, actual_size);
    }

    @Test
    public void isLeased() {

        int actual_count = CONN_SIZE;

        connectionPool.createConnection();
        int expected = connectionPool.getLeasedCount();

        assertEquals(expected, actual_count);
    }

    @Test
    public void releaseConnection() throws Exception {

        connectionPool.createConnection();

        Connection c = connectionPool.getConnection();


        int countbefore  = connectionPool.getLeasedCount();


        connectionPool.releaseConnection(c);

        int countafter  = connectionPool.getLeasedCount();

        assertEquals(countbefore, countafter + 1);

    }
}
