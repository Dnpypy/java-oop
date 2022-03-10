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

package academy.devonline.java.home_structures_chapter09.LinkedList.remove;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * Необходимо реализовать метод boolean remove(int value),
 * который удаляет элемент из односвязного списка,
 * если данный элемент присутствует в этом списке.
 *
 * Если элемент был удален, то метод возвращает true, иначе - false!
 *
 *
 * [0, 1, 2, 3]
 * [0, 1, 2, 3] - После удаления элемента = 5
 * [1, 2, 3] - После удаления элемента = 0
 * [1, 3] - После удаления элемента = 2
 * [3]  - После удаления элемента = 1
 * []  - После удаления элемента = 3
 * [0] - После добавления двух элементов и удаления элемента = 1
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.asString());

        list.remove(5);
        // [0, 1, 2, 3]
        System.out.println(list.asString());

        list.remove(0);
        // [1, 2, 3]
        System.out.println(list.asString());

        list.remove(2);
        // [1, 3]
        System.out.println(list.asString());

        list.remove(1);
        // [3]
        System.out.println(list.asString());

        list.remove(3);
        //[]
        System.out.println(list.asString());
        ///////////////////////////////////////////
        list.add(0);
        list.add(1);

        list.remove(1);
        // [0]
        System.out.println(list.asString());
    }
}
