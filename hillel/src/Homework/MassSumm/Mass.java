package Homework.MassSumm;

public class Mass {
    public static void main(String[] args) {
        float[] mass = new float[20];
        float summ = 0;
        float b = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (float) (Math.random());
            b = mass[i] + summ;

            //float f = mass[i] * 100;
            //f = (int) f;
            //mass[i] = f / 100;
            System.out.println("mass[i]= " + mass[i]);
            System.out.println("summ= " + summ);
            System.out.println("b= " + b);

        }

    }
}

//for (int i = 0; i < mass.length; i++) {
//  System.out.print(mass[i] + " ");
// }
//}

