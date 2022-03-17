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

package academy.devonline.java.home_section031_polymorphism.AbstractClassUsage254;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * (!)Абстрактный класс ссылка -> на дочерний класс ();
 * (!)Абстрактный класс можно использовать в качестве обычного родительского класса
 * <p>
 * Создать класс Child наследуемый от Example, в нем переопределить метод doSomething.
 * Создать ссылку на родит класс и присваивать ссылку на объект уже дочернего класса
 * alt+enter implements method переопределить метод
 */
public class AbstractClassUsage {
    public static void main(String[] args) {
        Example example = //....
        example.doSomething();
    }

    private static abstract class Example {

        abstract void doSomething();
    }

    private static class Child extends Example {

        @Override
        void doSomething() {

        }
    }
}
