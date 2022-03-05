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

package academy.devonline.java.home_structures_chapter09.LinkedListClear;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class LinkedListTestVer2 {
    public static void main(String[] args) {
        // создали объект нашего списка
        LinkedListVer2 list = new LinkedListVer2();
        for(int i = 1; i <= 3; i++) {
            list.add(i);
        }

        System.out.println(list.asString());

        list.clear();
        System.out.println(list.asString());

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list.asString());

        list.clear();
        System.out.println(list.asString());

        for (int i = 0; i <= 60; i++) {
            list.add(i);
        }
        System.out.println(list.asString());
    }




}
