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

import academy.devonline.java.structures.DynaArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class LinkedList {
    private LinkedList.ItemVer2 first;

    private LinkedList.ItemVer2 last; // скрытая ссылка на объект

    /**
     * метод изменяет состояние объекта
     * @param value целое число
     */
    public void add(int value) {
        LinkedList.ItemVer2 item = new LinkedList.ItemVer2(value);
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
     * метод возращает работает с объектом first
     * @return int[] массив
     */
    public int[] toArray() {
        DynaArray dynaArray = new DynaArray();
        LinkedList.ItemVer2 current = first; // текущий элемент односвяз списка
        while (current != null) {
            dynaArray.add(current.value); // current.value -> запрос поля value
            current = current.next;
        }
        // как только вышли из while нужно элементы из дин массива преобразовать в стат массив
        return dynaArray.toArray();
    }

    /**
     * содержит логическую оишбку при которой возникает утечка памяти
     */
    public void clear() {
        first = null;
        last = null;
        // исправление утечки памяти
    }

    /**
     * Если мы знает кол-во элементов и нам надо собрать строковое представление подойдет StringBuilder
     * метод возращает строковое представление списка, работает с объектом first
     * Вместо динам массив будет использовать StringBuilder
     */
    public String asString() {
        // создаю объект стригбилдер , добавляю открыв [
        StringBuilder builder = new StringBuilder().append('[');
        // текущий элемент односвяз списка в перем типа Item
        LinkedList.ItemVer2 current = first;
        //цикл вайл пока текущ не равен нулл
        while (current != null) {
            // вместо записи дин массив будем записывать стринбилдер с методом append
            builder.append(current.value);
            // current.value -> запрос поля value, добавля ", "
            // проверка на послед элемент, если пусто то уже запятая не нужна
            if (current.next != null) {
                builder.append(", ");
            }
            // в карент след элем
            current = current.next;
        }
        // возращаем строк представление
        return builder.append(']').toString();
    }


    /**
     * Найти пару элементов и удалить, текущий элемент(current), который нужно удалить и предыдущий
     * Нам нужно найти эту пару с помощью метода findPair
     * тип Pair нужен только внутри LinkedList
     */

    public boolean remove(int value) {
        Pair pair = findPair(value);
        //если пара существует
        if(pair != null) {

        }
    }

    /**
     * тип Pair нужен только внутри LinkedList
     * В классе два поля предыдущее значение и текущее
     * current - элемент который хотим удалить
     * previos - сохраняться ссылка на предыдущий элемент
     */
    private static class Pair {
        private ItemVer2 previos;
        private ItemVer2 current;

        private Pair(ItemVer2 previos, ItemVer2 current) {
            this.previos = previos;
            this.current = current;
        }
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
        private LinkedList.ItemVer2 next;


        // с помощью конструктора можно сразу задать значение
        // public у конструктора не имеет смысла класс не публичный
        private ItemVer2(int value) {
            this.value = value;
        }
    }


}

