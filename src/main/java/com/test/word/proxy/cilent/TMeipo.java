package com.test.word.proxy.cilent;



import com.test.word.proxy.proxy.TClassLoader;
import com.test.word.proxy.proxy.TInvocationHandler;
import com.test.word.proxy.proxy.TProxy;

import java.lang.reflect.Method;

public class TMeipo implements TInvocationHandler {


    private Object target;

    public Object getinstance(Object target){
        this.target = target;
        Class<?> clazz =  target.getClass();
        //clazz.getInterfaces()对象所实现的所有接口
        return TProxy.newProxyInstance(new TClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("双方同意");
    }

    private void before() {
        System.out.println("已经收集到你的需求，开始物色");
    }
}
