package com.test.word.proxy.test.proxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TProxy {

    /**
     *
     * @param loader
     * @param interfaces    对象所实现的所有接口
     * @param h
     * @return
     * @throws IllegalArgumentException
     */
    public static Object newProxyInstance(TClassLoader loader,
                                          Class<?>[] interfaces,
                                          TInvocationHandler h)
            throws IllegalArgumentException {
        try{
            //生成文件
            String s = generateSrc(interfaces);
            System.out.println(s);
            //输出磁盘
            String path = TProxy.class.getResource("").getPath();
            File f = new File(path + "$Proxy0.java") ;
            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.flush();
            fw.close();
            //编译java文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();
            //加载到JVM
            Class proxyClass =  loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(TInvocationHandler.class);
            f.delete();
            //返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static final String ln = "\r\n";


    private static String generateSrc(Class<?>[] interfaces){
        StringBuilder sb = new StringBuilder();
        //文件生成的位置
        sb.append(TProxy.class.getPackage() + ";" + ln);
        //引入实现类
        sb.append("import " + interfaces[0].getName() + ";" + ln);
        //引入java包
        sb.append("import java.lang.reflect.*;" + ln);
        //定义类
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        //定义Handler
        sb.append("TInvocationHandler h;" + ln);
        //定义构造方法
        sb.append("public $Proxy0(TInvocationHandler h) { " + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);
        //循环第一个接口的方法
        for (Method m : interfaces[0].getMethods()){
            //获取方法的参数
            Class<?>[] parameterTypes = m.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();
            //循环获取所有参数
            for (int i =0 ;i <parameterTypes.length;i++) {
                if(i > 0 && i < parameterTypes.length){
                    paramNames.append(",");
                    paramValues.append(",");
                    paramClasses.append(",");
                }
                Class aClass = parameterTypes[i];
                String name = aClass.getName();
                String SimpleName = aClass.getSimpleName();
                String value = aClass.getSimpleName().concat(String.valueOf(i));
                paramNames.append(SimpleName  + " " +  value);
                paramValues.append(value);
                paramClasses.append(name+".class");
            }
            //拼接方法 public 方法返回值 方法名称 参数
            sb.append("@Override" + ln);
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "("+paramNames+") {"  + ln);
            sb.append("try{ " +ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName()+"\",new Class[] {"+paramClasses+"});" + ln);
            sb.append("this.h.invoke(this,m,new Object[]{"+paramValues+"});" + ln);
            sb.append("return;"+ ln);
            sb.append("}" +ln);
            sb.append("catch(Error _ex) { }" +ln);
            sb.append("catch(Throwable throwable)" +ln);
            sb.append("{" +ln);
            sb.append(" throw new UndeclaredThrowableException(throwable);" +ln);
            sb.append("}" +ln);
            sb.append("}" + ln);
        }
        sb.append("}" + ln);
        return sb.toString();
    }

    public String paramNames(String simpleName){
        return "";
    }


}
