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

package academy.devonline.java.home_structures_chapter09.LinkedListToArray;

import academy.devonline.java.home_structures_chapter09.LinkedListA.LinkedList;
import academy.devonline.java.structures.DynaArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * <p>
 * #180 Метод LinkedList.toArray
 * В классе LinkedListVer2 прописать метод toArray()
 */
public class LinkedListVer2 {

    //У этого класса должно быть два поля, которые указывают на первый
    // элемент списка и на последний
    private ItemVer2 first;
    private ItemVer2 last;

    /**
     * добавляет элемент в списки
     * т.к. метод add является методом класса LinkedList, то он имеет доступ к полям этого класса
     *
     * @param value целое число
     */
    void add(int value) {
        //создаю объект элемента списка типа Item с одним аргументом конструктора
        ItemVer2 itemVer2 = new ItemVer2(value);
        //тут нужна проверка если элементов нет в списке, т.е. список пустой
        //по умолчани. внутр поля класс инициализируются null(если ничего не записано в них), задачи в пакете values
        // тут проверка первого элемента!
        if (first == null) {
            // операция присваивания является правосторонней справо на лево
            //сначала эта операция last = item, потом эта first = last
            first = last = itemVer2;
        } else {
            // если в списке есть хотя бы один элемент, нам нужно обновить ссылку last
            // напрямую к next не можем обратится, только через last
            last.next = itemVer2;
            last = itemVer2;
        }
    }

    /**
     * Так как незнаем количество элементов нам подойдет для этой задачи динамический массив DynaArray
     * Будем идти по списку с first элемента до элемента next у которого значение равняется null
     * next == null это означает посл элемент
     * будет возвращать массив целых чисел
     *
     * @return int[] массив
     */
    public int[] toArray() {
        // создаю объект DynaArray
        DynaArray dynaArray = new DynaArray();
        // текущий элемент односвяз списка присваиваем первому элементу (врем локал перем индикатор итерации)
        ItemVer2 current = first;
        while(current != null){ //цикл вайл пока текущ не равен нулл
            // current.value -> запрос поля value (обновление индикатор итерации)
            //добавление поля в ооъект
            dynaArray.add(current.value);
            // текущ присваиваю текущ некст
            current = current.next;
        }
        // как только вышли из while нужно элементы из дин массива преобразовать в стат массив
        return dynaArray.toArray();
    }
}
