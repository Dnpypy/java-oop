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

package academy.devonline.java.home_structures_chapter09.LinkedListA;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * Создание односвязного списка  №176
 * Создать 2 класса Item(не публичный), LinkedList  в пакете academy.devonline.java.home_structures_chapter09
 * LinkedListTest уже тест готов проверка там
 * В классе Item прописать 2 поля: значение типа int, след элемент типа Item и метод конструктора для значения с
 * одним параметром
 *
 * В классе LinkedList прописать 2 поля private типа Item, которые указывают на первый и последний элемент в списке
 * В нем же создать класс add с одним параметром значение целого числа
 * В котором создаю объект Item и делаю проверку, если элемент в списке проверка на null,
 * если нет элемента в списке first last присваивается item,
 * иначе обновляю ссылки на last
 *
 * В классе LinkedTest такая проверка будет:
 * Создаю объект , цикл фор с 1 до 3 элемнтов итерация
 * Заглушка (ничего не вывожу) prinln
 *
 * Изменяю класс Item и делаю его внутренним(184 урок) и переношу его в класс LinkedList и делаю его приватным.
 */
public class HomeSolution01 {
}
