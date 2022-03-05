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

package academy.devonline.java.section011_base_structures;

import academy.devonline.java.home_structures_chapter09.LinkedListA.LinkedList;
import academy.devonline.java.home_structures_chapter09.LinkedListAsString.LinkedListVer3;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * #187
 */
public class GCExampleTest {
    public static void main(String[] args) {
        String result = generate();
        System.out.println(result);
    }

    private static String generate() {
        LinkedListVer3 list = new LinkedListVer3();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
        return list.asString();
    }
}
