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

package academy.devonline.java.home_section021_inheritance_and_polymorphism.sizecount;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * protected модификатор используется в классах наследниках и внутри текущего класса
 */
public class BaseDataStructure {

    /**
     * сохраняет количество элементов в заданной структуре данных
     */
    protected int count;

    /**
     *
     * @return Возвращает количество элементов в данной структуре данных размер массива целые числа
     */
     public int size() {
         return count;
     }

    /**
     * Обнуление перем count результат []
     */
    public void clear() {
        count = 0;
    }

}
