package org.JUnitTest.databaseConnection;

public class DatabaseConnection {
    public boolean isConnected;
   public  void connect() {
        isConnected = true;
        System.out.println("Database connected");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected");
    }

     public boolean isConnected() {
        return isConnected;
    }
}
