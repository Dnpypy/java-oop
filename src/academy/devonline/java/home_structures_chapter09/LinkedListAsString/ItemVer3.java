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

package academy.devonline.java.home_structures_chapter09.LinkedListAsString;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
#182
 * Практика: Метод LinkedList.asString
 */
public class ItemVer3 {
    //Значение
    int value;

    //объявляется ссылка, она введет на след элемент
    //т.к. каждый элемент у нас представляется типом ItemVer2
    ItemVer3 next;


    // С помощью конструктора можно сразу задать значение
    // public у конструктора не имеет смысла класс не публичный
    ItemVer3(int value) {
        this.value = value;
    }
}
