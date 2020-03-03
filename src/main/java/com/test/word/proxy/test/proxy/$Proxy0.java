package com.test.word.proxy.test.proxy;
import com.test.word.proxy.test.cilent.IPerson;
import java.lang.reflect.*;
public class $Proxy0 implements com.test.word.proxy.test.cilent.IPerson{
    TInvocationHandler h;
    public $Proxy0(TInvocationHandler h) {
        this.h = h;
    }
    @Override
    public void findlove(byte byte0,short short1,int int2,long long3,float float4,double double5,char char6,boolean boolean7) {
        try{
            Method m = com.test.word.proxy.test.cilent.IPerson.class.getMethod("findlove",new Class[] {byte.class,short.class,int.class,long.class,float.class,double.class,char.class,boolean.class});
            this.h.invoke(this,m,new Object[]{byte0,short1,int2,long3,float4,double5,char6,boolean7});
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
    @Override
    public void buyInsure(String String0,String String1,int int2,int int3) {
        try{
            Method m = com.test.word.proxy.test.cilent.IPerson.class.getMethod("buyInsure",new Class[] {java.lang.String.class,java.lang.String.class,int.class,int.class});
            this.h.invoke(this,m,new Object[]{String0,String1,int2,int3});
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}