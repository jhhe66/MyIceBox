# MyIceBox

# 使用的zeroC ice版本是3.7.2
# 这个是从官方的icebox Demo中摘取出来的，大家一起参考学习，有问题的可以提出以下。
# service中增加了server的main，并打包为jar包，可以直接java -jar target/service.jar来执行。

This demo shows how to create an [IceBox][1] service.

To run this demo, open two terminal windows. In the first window,
start the IceBox service.Server:

```
java -jar build/libs/iceboxserver.jar --Ice.Config=config.icebox
```

In the second window, run the client:

```
java -jar build/libs/client.jar
```

To shut down IceBox, use IceBox.Admin:

```
java IceBox.Admin --Ice.Config=config.admin shutdown
```

[1]: https://doc.zeroc.com/display/Ice37/IceBox
