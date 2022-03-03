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

package academy.devonline.java.home_structures_chapter09;

import academy.devonline.java.home_structures_chapter09.LinkedListToArray.LinkedListVer2;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 *
 * #182
 * Практика: Метод LinkedList.asString
 * Необходимо создать метод asString() в классе HomeSolution03.
 *
 * Данный метод будет возвращать строковое представление объекта класса LinkedListв следующем формате:
 *
 * сначала обязательная открывающая квадратная скобка;
 *
 * дальше все элементы динамического массива, разделенные запятой и пробелом;
 *
 * в конце обязательная закрывающая квадратная скобка скобка.
 *
 * Примеры результатов метода asString():
 *
 * LinkedList list = new LinkedList();
 * for (int i = 1; i <= 3; i++) {
 *      list.add(i);
 * }
 * System.out.println(list.asString());
 * Результат будет: [1, 2, 3]
 *
 *
 *
 * LinkedList list = new LinkedList();
 * System.out.println(list.asString());
 * Результат будет: []
 */
class HomeSolution03 {

    public static void main(String[] args) {
        // создали объект нашего списка
        LinkedListVer2 list = new LinkedListVer2();
        for(int i = 1; i <= 3; i++) {
            list.add(i);
        }

    }

    void asString() {

    }

}
