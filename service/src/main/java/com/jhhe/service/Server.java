package com.jhhe.service;

public class Server {

    public static void main(String[] args) {
        System.out.println("Service start.......");
        com.zeroc.IceBox.Server server = new com.zeroc.IceBox.Server();

        server.main(new String[]{"--Ice.Config=config.icebox"});
    }
}
