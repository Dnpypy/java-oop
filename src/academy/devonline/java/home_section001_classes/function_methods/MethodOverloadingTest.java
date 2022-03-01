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

package academy.devonline.java.home_section001_classes.function_methods;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading dynaArray = new MethodOverloading();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        dynaArray.add(new int[]{2, 5});

        MethodOverloading dynaArray2 = new MethodOverloading();
        dynaArray2.add(new int[]{-6, -7, -8});
        dynaArray.add(dynaArray2);

        //dynaArray.count = 20;

        System.out.println(dynaArray.asString());
    }
}
