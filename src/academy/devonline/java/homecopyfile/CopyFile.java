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

package academy.devonline.java.homecopyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {
        File file1 = new File("C:\\video.mp4");
        File file2 = new File("D:\\temp\\video.mp4");
        copyFile(file1, file2);

        Path path1 = new File("C:\\video.mp4").toPath();
        Path path2 = new File("D:\\temp\\video.mp4").toPath();
    }

    private static void copyFile(File source, File target) {

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            byte[] buffer = new byte[88192];   // размер буфера 8 Кб
            int size = 0;
            while ( (size = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, size);
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
