/*
 * Copyright 2022. http://devonline.academy
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package academy.devonline.java.home_section021_inheritance_and_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * 229
 *
 * Прописать ключевое слово super() и вызвать конструкторы с параметром и без из родительского класса.
 * Вывод :
 * Parent.<init>()
 * Child.<init>()
 * или
 * Parent.<init>(int)
 * Child.<init>()
 * или
 * Parent.<init>(boolean)
 * Child.<init>()
 */
public class SuperConstructor {

    private static class Parent {

        private Parent() {
            System.out.println("Parent.<init>()");
        }

        private Parent(int value) {
            System.out.println("Parent.<init>(int)");
        }

        private Parent(boolean value) {
            System.out.println("Parent.<init>(boolean)");
        }
    }

    private static class Child extends Parent {

        private Child() {
            //..
            System.out.println("Child.<init>()");
        }
    }

    public static void main(String[] args) {
        new Child();
    }
}