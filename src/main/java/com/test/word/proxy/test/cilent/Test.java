package com.test.word.proxy.test.cilent;

public class Test {



    public static void main(String[] args) {
        TMeipo tMeipo = new TMeipo();
        IPerson getinstance = (IPerson)tMeipo.getinstance(new Zhangsan());
        getinstance.findlove((byte)1,(short) 2,3,4,5.5F,6.6,'a',true);

       /* Animal animal = (Animal)tMeipo.getinstance(new Dog());
        animal.findlove("黑狗","红狗",12,13);*/


        /*IPerson getinstance1 = jdkMeipo.getinstance(new Lisi());
        getinstance1.findlove();
        getinstance1.buyInsure();*/

        /*byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("F://$proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }

}
