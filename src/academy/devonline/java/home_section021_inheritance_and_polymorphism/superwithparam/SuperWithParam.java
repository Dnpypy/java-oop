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

package academy.devonline.java.home_section021_inheritance_and_polymorphism.superwithparam;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * Создать наследование(3 приват. статич. класса
 * GrandP -> Par -> Ch, в каждом конструктор с методом super() в который передаем value)
 * 1 поле у класса GrandP value
 * В конце передать число 12
 * На вывод число 12
 */
public class SuperWithParam {

    private static class GrandP{
        int value;

        public GrandP(int value) {
            this.value = value;
        }
    }

    private static class Par extends GrandP{
        public Par(int value) {
            super(value);
        }
    }

    private static class Ch extends Par{
        public Ch(int i) {
            super(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Ch(12).value);
    }
}
