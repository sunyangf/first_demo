package sun.yang.test.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(getClass()+"调用方法前");
        Object ret=invocation.proceed();
        System.out.println(getClass()+"调用方法后");
        return ret;
    }
}
