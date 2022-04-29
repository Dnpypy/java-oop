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

package academy.devonline.java.home_passwordtest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Test {
    public static void main(String[] args) {

        int leftLimit = 33; //
        int rightLimit = 126; //
        int targetStringLength = 12;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        System.out.println(generatedString);
        writeText(generatedString);

        System.out.printf("Пароль: \"%s\". Сложность пароля %d баллов", generatedString, countPoints(generatedString));


    }

    static int countPoints(String psw) {
        int balls = 0;
        balls += psw.length() >= 8? 10: 0;  // более 8 знаков
        balls += psw.chars()                // 2 буквы
                .filter(i -> "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".contains("" + (char) i)).count() > 1? 10: 0;
        balls += psw.chars()                // 2 цифры
                .filter(i -> "0123456789".contains("" + (char) i)).count() > 1? 10: 0;
        balls += psw.chars()                // одна или больше больших букв
                .anyMatch(i -> "ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" + (char) i))? 10: 0;
        balls += psw.chars()                // одна или больше маленьких букв
                .anyMatch(i -> "abcdefghijklmnopqrstuvwxyz".contains("" + (char) i))? 10: 0;
        balls += psw.chars()                // содержатся спецсимволы (дополнить список символов по желанию)
                .anyMatch(i -> "!@#$%^&*[]".contains("" + (char) i))? 10: 0;
        return balls;
    }

    private static void writeText(String str) {
        String test = str; // Эту строку мы посимвольно запишем в файл

        // Создание файлового потока для записи символов ак автозакрываемый ресурс
        // Нам не надо вызывать fw.close(), т.к. в данном случае он будет закрыт автоматически
        try (FileWriter fw = new FileWriter("D:\\text.txt", true)) {
            // Записываем посимвольно , обращаясь к каждому элементу строку (как к символу)

            for (int i = 0; i < test.length(); i++) {
                fw.write(test.charAt(i));
            }
            fw.write("\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
