package com.paulo.service;

import com.paulo.dataobject.User;

import java.util.concurrent.Future;

public interface TextService {
    Future<Boolean> sendText(User user);
}
