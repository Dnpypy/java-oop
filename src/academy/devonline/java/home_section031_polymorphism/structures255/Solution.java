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

package academy.devonline.java.home_section031_polymorphism.structures255;

/**
 * (!) Зачем нужен полностью абстрактный класс?
 *
 * Носит исключительно описательную характеристику,
 * сразу видим что мы можем делать с любой структурой данных,
 * каким образом мы можем взаимодействовать с любой структурой данных.
 *
 * Так как все методы в абстрактном классе абстрактные, то любые классы,
 * которые наследуются от абстрактного класса обязаны переопределить эти методы у себя в классе
 *
 * (!)Класс BaseDataStructure выполняет задачу уйти от дублирующего кода в классах LinkedList и DynaArray.
 *
 * #255
 * Создать абстрактный класс DataStructure у которого все методы абстрактны
 * Копировать все методы из BaseDataStructure в класс DataStructure
 * B вместо тело метода, все методы делаем абстрактными в классе DataStructure
 * Добавить оставшиеся методы, которые есть в LinkedList и DynaArray, которых нет в классе DataStructure
 * BaseDataStructure наследуется от класса DataStructure
 * Переопределить все методы которые переопределяются в классах наследниках
 */

public class Solution {
}
