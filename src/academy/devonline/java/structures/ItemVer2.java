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
 */
public class ItemVer2 {
    //значение
    int value;

    //ссылка на след элемент
    //т.к. каждый элемент у нас представляется типом ItemVer2
    ItemVer2 next;


    // с помощью конструктора можно сразу задать значение
    // public не имеет смысла класс не публичный
    ItemVer2(int value) {
        this.value = value;
    }
}
