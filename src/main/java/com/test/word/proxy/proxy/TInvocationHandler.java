package com.test.word.proxy.proxy;

import java.lang.reflect.Method;


public interface TInvocationHandler {


    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;
}
