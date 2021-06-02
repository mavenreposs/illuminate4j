package io.github.mavenreposs.illuminate4j.support;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Predicate;

public class Callable<T> {

    private Callable() {
    }

    public static <T> void set(T bean, String fun, Object value) throws Exception {
        Method method = bean.getClass().getMethod(fun, Class.forName(value.getClass().getCanonicalName()));
        method.invoke(bean, value);
    }

    public static <T> Object get(T bean, String fun) throws Exception {
        Method method = bean.getClass().getMethod(fun);
        return method.invoke(bean);
    }

    protected static  <T> boolean exists(T bean, String fun) throws Exception {
        Method[] methods = bean.getClass().getMethods();
        long count = Arrays.stream(methods).filter(new Predicate<Method>() {
            @Override
            public boolean test(Method method) {
                return method.getName().equals(fun);
            }
        }).count();

        return count > 0;
    }

}
