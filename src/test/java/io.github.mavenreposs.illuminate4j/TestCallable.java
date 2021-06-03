package io.github.mavenreposs.illuminate4j;

import io.github.mavenreposs.illuminate4j.support.Callable;
import org.junit.jupiter.api.Test;

public class TestCallable {

    @Test
    public void test_CallableGet() throws Exception {
        User user = new User("张三", 18);

        System.out.println(Callable.get(user, "getName"));
        System.out.println(Callable.get(user, User::getName));
    }

    @Test
    public void test_CallableSet() throws Exception {
        User user = new User("张三", 18);
        System.out.println(user);

        Callable.set(user, "setAge", 28);
        System.out.println(user);

        Callable.set(user, User::setAge, 38);
        System.out.println(user);
    }


    public static class User {
        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
