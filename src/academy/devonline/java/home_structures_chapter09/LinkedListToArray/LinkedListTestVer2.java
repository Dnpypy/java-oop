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

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * #180 Метод LinkedList.toArray Home
 */
public class LinkedListTestVer2 {
    public static void main(String[] args) {
        // создали объект нашего списка
        LinkedListVer2 list = new LinkedListVer2();

        // цикл с 1 до 3
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }

        // через объект обращаемся к методу toArray и выводим нам список
        System.out.println(Arrays.toString(list.toArray()));

    }




}
