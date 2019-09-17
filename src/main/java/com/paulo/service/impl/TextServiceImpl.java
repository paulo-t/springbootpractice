package com.paulo.service.impl;

import com.paulo.dataobject.User;
import com.paulo.service.TextService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class TextServiceImpl implements TextService {
    @Override
    @Async
    public Future<Boolean> sendText(User user) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<Boolean>(true);
    }
}
