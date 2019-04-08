package com.jhhe.service.impl;//
// Copyright (c) ZeroC, Inc. All rights reserved.
//

public class HelloServiceI implements com.zeroc.IceBox.Service
{
    @Override
    public void start(String name, com.zeroc.Ice.Communicator communicator, String[] args)
    {
        System.out.println("HelloServiceI start.......");
        _adapter = communicator.createObjectAdapter(name);
        _adapter.add(new HelloI(), com.zeroc.Ice.Util.stringToIdentity("hello"));
        _adapter.activate();
    }

    @Override
    public void stop()
    {
        System.out.println("HelloServiceI stop.......");
        _adapter.destroy();
    }

    private com.zeroc.Ice.ObjectAdapter _adapter;
}
