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

package academy.devonline.java.structures.inClassLinkedList;

import academy.devonline.java.structures.DynaArray;


/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * #184 Внутрен класс
 * В случае, если какойто некоторый класс логически связан с другим классом и
 * используется внутри этого внешнего класса
 * то некоторый класс может быть объявлен как Внутренний класс.
 *
 * Внутрен класс Item модель элемента односвязн списка.
 *
 * т.к данный класс используется только внутри LinkedList, класс Item может быть объявлен private
 * и доступ ко всем приватным поля и приватным констуктором возможен напрямую внутри класса LinkedList
 *
 */
public class LinkedListVer2 {
    private ItemVer2 first;

    private ItemVer2 last;

    public void add(int value) {
        ItemVer2 item = new ItemVer2(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
    }

    /**
     * Так как незнаем количество элементов нам подойдет для этой задачи динамический массив DynaArray
     * Будем идти по списку с first элемента до элемента next у которого значение равняется null
     * next == null это означает посл элемент
     * будет возвращать массив целых чисел
     * @return int[] массив
     */
    public int[] toArray() {
        DynaArray dynaArray = new DynaArray();
        ItemVer2 current = first; // текущий элемент односвяз списка
        while(current != null) {
            dynaArray.add(current.value); // current.value -> запрос поля value
            current = current.next;
        }
        // как только вышли из while нужно элементы из дин массива преобразовать в стат массив
        return dynaArray.toArray();
    }

    public String asString() {
        StringBuilder builder = new StringBuilder().append('[');
        ItemVer2 current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }

        return builder.append(']').toString();
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    private static class ItemVer2 {
        //значение
        private int value;

        //ссылка на след элемент
        //т.к. каждый элемент у нас представляется типом ItemVer2
        private ItemVer2 next;


        // с помощью конструктора можно сразу задать значение
        // public у конструктора не имеет смысла класс не публичный
        private ItemVer2(int value) {
            this.value = value;
        }
    }
}
