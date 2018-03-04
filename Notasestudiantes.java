import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Notasestudiantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Decide el numero de la lista 
        System.out.print("Escribe el numero de notas: ");
        int numOfGrades = Integer.parseInt(scan.nextLine());

        // Crea un listado para mantener las notas
        int arrayOfGrades[] = new int[numOfGrades];
        for (int i = 0; i < arrayOfGrades.length; i++) {
            System.out.print("Escribe la nota numero " + (i + 1) + " : ");
            arrayOfGrades[i] = scan.nextInt();
        }

        // Muestra las notas uno por uno
        for (int i = 0; i < arrayOfGrades.length; i++) {
            System.out.print("Nota numero " + (i + 1) + " : ");
            System.out.print(arrayOfGrades[i] + "\n");
        }


        double tot = 0;
        double mean = 0;
        for (int i = 0; i < numOfGrades; i++) {
            tot = tot + arrayOfGrades[i];
        }
        mean = tot / numOfGrades;
        System.out.println("El valor medio es: " + mean);
        // Calcula Media
        double median = 0;
        double mid = 0;
        if (numOfGrades % 2 == 0) {
            int temp = (numOfGrades / 2) - 1;
            for (int i = 0; i < numOfGrades; i++) {
                if (temp == i || (temp + 1) == i) {
                    mid = mid + arrayOfGrades[i];
                }
            }
            mid = mid / 2;
            System.out.println("La mediana es: " + mid);
        } else {
            int temp = (numOfGrades / 2);
            for (int i = 0; i < numOfGrades; i++) {
                if (temp == i) {
                    mid = arrayOfGrades[i];
                    System.out.println("Mediana: " + mid);
                }
            }
        }
        //Calcula la Moda
        int i, j, z, tmp, maxCount, modeValue;
        int[] tally = new int[numOfGrades];
        for (i = 0; i < numOfGrades; i++) {
            for (j = 0; j < numOfGrades - i; j++) {
                if (j + 1 != numOfGrades) {
                    if (arrayOfGrades[j] > arrayOfGrades[j + 1]) {
                        tmp = arrayOfGrades[j];
                        arrayOfGrades[j] = arrayOfGrades[j + 1];
                        arrayOfGrades[j + 1] = tmp;
                    }
                }
            }
        }
        for (i = 0; i < numOfGrades; i++) {
            for (z = i + 1; z < numOfGrades; z++) {
                if (arrayOfGrades[i] == arrayOfGrades[z]) {
                    tally[i]++;
                }
            }
        }
        maxCount = 0;
        modeValue = 0;
        for (i = 0; i < numOfGrades; i++) {
            if (tally[i] > maxCount) {
                maxCount = tally[i];
                modeValue = arrayOfGrades[i];
            }
        }
        System.out.println("La moda es :" + modeValue);
    }
}