/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Locale LCL = new Locale("en", "EN");
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(LCL); 

    public static void main(String[] args) {
//          Variable
        boolean procesoOK = false;
        double n;
//          Bucle

        do {
            try {
                System.out.printf("El alumno ha APROBADO con......:");
                n = SCN.nextDouble();
                if (procesoOK = n >= 5 && n <= 10) {
                    procesoOK = true;
                    System.out.printf("El alumno ha APROBADO con......:%.2f"
                            + " nota%n", n);
                } else {
                    System.out.println("ERROR: Entrada incorrecta.");
                }

            } catch (Exception e) {
                System.out.println("ERROR: Entrada incorrecta.");

            } finally {
                SCN.nextLine();
            }
        } while (!procesoOK);
        System.out.println("END");
    }
}
