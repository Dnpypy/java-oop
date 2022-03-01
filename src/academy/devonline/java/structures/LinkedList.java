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

package academy.devonline.java.structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * <p>
 * класс публичный любой разработчик имеет доступ к этому классу
 */


public class LinkedList {
    //У этого класса должно быть два поля, которые указывают на первый
    // элемент списка и на последний
    private Item first;
    private Item last;

    /**
     * добавляет элемент в списки
     *
     * @param value целое число
     */
    public void add(int value) {
        //создаю объект элемента списка
        Item item = new Item(value);
        //тут нужна проверка если элементов нет в списке, т.е. список пустой
        //по умолчани. внутр поля класс инициализируются null(если ничего не записано в них) задачи в пакете values
        if (first == null) {
            first = last = item;
        } else { // если в списке есть хотя бы один элемент, нам нужно обновить ссылку last
            last.next = item;
            last = item;
        }

    }
}
