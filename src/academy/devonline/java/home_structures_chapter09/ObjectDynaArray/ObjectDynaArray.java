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

package academy.devonline.java.home_structures_chapter09.ObjectDynaArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ObjectDynaArray {
    private Element[] result = new Element[5];

    private int count;

    public void add(Element value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    private void grow(int newLength) {
        Element[] newArray = new Element[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    /**
     * Чтобы не произошлои утечки памяти, нужно удалить неявные ссылки на объекты находящиеся в массиве,
     * пройтись по всем элементам нашего статического массива result(цикл for)
     * и явным образом присвоить туда значение null
     * И тогда эти объекты(new Element()) для сборщика мусора буду считаться мусором и он их удалит
     */
    public void clear() {
        for (int i = 0; i < count; i++) {
            result[i] = null;
        }
        count = 0;

    }

    public static void main(String[] args) {
        // в динам массиве будут содержаться ссылки на объекты new Element()
        ObjectDynaArray dynaArray = new ObjectDynaArray();
        // после метода clear остаются неявные ссылки на эти объекты
        dynaArray.add(new Element()); // содержится ссылка на отдельный объект в памяти
        dynaArray.add(new Element());
        dynaArray.add(new Element());
        dynaArray.add(new Element());

        System.out.println(dynaArray);
        // после метода clear остаются неявные ссылки на эти объекты
        dynaArray.clear();
        System.out.println(dynaArray);
        System.out.println();
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static class Element {

    }
}
