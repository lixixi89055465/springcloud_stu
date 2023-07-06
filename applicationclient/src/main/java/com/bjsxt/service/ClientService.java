package com.bjsxt.service;

import java.util.concurrent.Future;

public interface ClientService {
    String client();

    Future<String> demo3(String name);

    String thread1();

    String thread2();

    String semaphore();
}
