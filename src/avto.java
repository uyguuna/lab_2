import java.util.Scanner;

class Model{
    String name;
    double number_reg;
    double year_release;
    double probeg;
    double cost;
}

public class avto {
    public static Model[] setModArr(int k){
        Scanner sc=new Scanner(System.in,"ср1251");
        Model mod[]=new Model[k];

        System.out.println("Введите кол-во моделей=>");
        int n=sc.nextInt();
        Model Mod[]=new Model[n];
        System.out.println("Введите информацию о машинах: ");
        for (int i = 0; i<Mod.length; i++) {
            sc.nextLine();
            Mod[i]=new Model();
            System.out.print("Название "+(i+1)+"-й модели =>");
            Mod[i].name=sc.nextLine();
            System.out.print("рег номер "+(i+1)+"-й модели=>");
            Mod[i].number_reg=sc.nextDouble();
            System.out.print("год выпуска "+(i+1)+"-й модели=>");
            Mod[i].year_release=sc.nextDouble();
            System.out.print("пробег "+(i+1)+"-й модели=>");
            Mod[i].probeg=sc.nextDouble();
            System.out.print("стоимость "+(i+1)+"-й модели=>");
            Mod[i].cost=sc.nextDouble();
        }
        System.out.println("\nХарактеристики моделей: ");
        for (int i=0; i<Mod.length; i++){
            System.out.println(""+Mod[i].name+"\t"+Mod[i].number_reg+" "+Mod[i].year_release+"г "+Mod[i].probeg+" "+Mod[i].cost+"рб");
        }
        int nommin=0;
                double min=Mod[nommin].cost;
        for (int i=0; i<Mod.length; i++) {
            if (Mod[i].cost < min)
                min = Mod[i].cost;
            nommin = i;
        }
        System.out.println("\nСамый дешевый автомобиль: ");
        System.out.println(""+Mod[nommin].name+"\t"+Mod[nommin].cost+"рб");
        for (int i=0; i<Mod.length-1; i++)
            for (int j=0; j<Mod.length-1-i; j++)
                if (Mod[j].year_release>Mod[j+1].year_release){
                    Model rab=mod[j];
                    mod[j]=mod[j+1];
                    mod[j+1]=rab;
                }
        System.out.println("\nОтсортированный список по площади:");
        for (int i=0; i<mod.length; i++) {
            System.out.println(""+Mod[i].name+"\t"+mod[i].year_release+"г ");
        }
        sc.nextLine();
        System.out.println("Введите регистрационный номер=>");
        String number_reg=sc.nextLine();
        int nom=-1;
        for (int i=0; i< mod.length; i++)
            if (number_reg.equalsIgnoreCase(mod[i].number_reg))
                nom = i;
        if (nom != -1) {
                System.out.println("Такой номер есть в списке. Это " + mod[nom].name + " " + mod[nom].number_reg);
            } else System.out.println("Такого номера нет в списке");
    return mod;
    }
}

