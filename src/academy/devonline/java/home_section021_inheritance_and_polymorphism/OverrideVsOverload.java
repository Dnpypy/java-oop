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
 * #217 повтор
 *   В дочернем классе(наследнике) переопределить метод method1 и перегрузить
 *
 * Если в дочернем классе присутствует метод с точно такой же сигнатурой как и в родительском классе,
 * то такой метод в дочернем классе переопределяет метод из родительского класса.
 *
 * Если в дочернем классе присутствует метод с таким же именем как и в родительском классе,
 * но с разными типами, порядком или количеством параметров,
 * то такой метод в дочернем классе перегружает метод из родительского класса.
 *
 * Аннотация @Override не является обязательной, но настойчиво РЕКОМЕНДУЕТСЯ при переопределении метода,
 * так как кроме описательной характеристики,
 * активирует возможность компилятора проверять факт переопределения в процессе компиляции кода.
 */
public class OverrideVsOverload {
    private static class Parent {

        void method1() {

        }
    }

    private static class Child extends Parent {


    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        //child.method1(12);
    }

}
