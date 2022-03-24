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

package academy.devonline.java.home_section031_polymorphism.InstanceOf267;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Main {

    public static void main(String[] args) {
        Object o = new Parent();
        boolean result = (o instanceof Child);
        System.out.println(result);

        if (o instanceof Parent) {
            System.out.println("Parent");
        }
    }

    private static class GrandParent /*extends Object*/{

    }

    private static class Parent extends GrandParent {

    }

    private static class Child extends Parent {

    }
}
