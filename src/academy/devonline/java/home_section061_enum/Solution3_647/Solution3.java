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

package academy.devonline.java.home_section061_enum.Solution3_647;


/**
 * @author Dnpypy
 */
public class Solution3 {

    enum Status{
        STARTED,
        IN_PROGRESS,
        COMPLETED

    }

    public static class Task{

        private Status status =Status.STARTED;

        public void setStatus(Status status) {
            this.status = status;
        }


        public Status status() {
            return status;
        }

        public static void main(String[] args) {
            Task task = new Task();
            task.setStatus(Status.IN_PROGRESS);
            System.out.println(task.status);
            task.setStatus(Status.COMPLETED);
            System.out.println(task.status);

        }

    }
}
