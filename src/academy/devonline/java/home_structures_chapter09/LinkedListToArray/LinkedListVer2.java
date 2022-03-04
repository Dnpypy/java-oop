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

import academy.devonline.java.structures.DynaArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * <p>
 * #180 Метод LinkedList.toArray
 * В классе LinkedListVer2 прописать метод toArray()
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
        DynaArray dynaArray = new DynaArray();// создаю объект DynaArray
        ItemVer2 current = first;// текущий элемент односвяз списка присваиваем первому элементу (врем локал перем индикатор итерации)
        while (current != null) { //цикл вайл пока текущ не равен нулл
            dynaArray.add(current.value);// current.value -> запрос поля value (обновление индикатор итерации)
            current = current.next;// текущ присваиваю текущ некст
        }
        // как только вышли из while нужно элементы из дин массива преобразовать в стат массив
        return dynaArray.toArray();
    }
}
