package com.jhhe.service.impl;//
// Copyright (c) ZeroC, Inc. All rights reserved.
//

import com.zeroc.demos.IceBox.hello.Demo.*;

public class HelloI implements Hello
{
    @Override
    public void sayHello(com.zeroc.Ice.Current current) {
        System.out.println("Hejianhua, Hello World!");
    }
}
