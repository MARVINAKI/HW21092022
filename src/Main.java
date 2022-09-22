public class Main {
    public static void main(String[] args) {

        //Exercise 1
        int i=5;
        byte b=8;
        short s=133;
        long l= 51200L;
        float f=3.14f;
        double d=5.67890887;
        String s1="Значение переменной ", s2=" с типом ", s3=" равно ";
        System.out.println(s1+"i"+s2+"int"+s3+i);
        System.out.println(s1+"b"+s2+"byte"+s3+b);
        System.out.println(s1+"s"+s2+"short"+s3+s);
        System.out.println(s1+"l"+s2+"long"+s3+l);
        System.out.println(s1+"f"+s2+"float"+s3+f);
        System.out.println(s1+"d"+s2+"double"+s3+d);
        System.out.println();

        //Exercise 2
        float n0=27.12F;
        long n1=987678965549L;
        byte n2=2;
        short n3=786;
        boolean n4=false;
        short n5=569;
        short n6=-159;
        int n7=27897;
        short n8=67;

        //Exercise 3
        int teacher1=23, teacher2=27, teacher3=30, paper=480;
        int pupils=teacher1+teacher2+teacher3;
        int amountLists= (paper/pupils); //Выбираю целочисленный тип, потому что считаю, что половину или одну треть листа не выдадут
        System.out.println("На каждого ученика рассчитано "+amountLists+" листов бумаги");
        /*System.out.println(paper%pupils); //Остаток листов, если не удается поделить ровно
        boolean check=paper%pupils!=0;
        System.out.println(check?pupils-(paper%pupils):0); //Скольки ученикам не достанется целого листа, если раздавать все листы
        */
        System.out.println();

        //Exercise 4
        int bottlesPerMinute=8; //Из условия 16 бутылок за 2 минуты, соответственно за 1 минуты выходит 8 бутылок
        int time0=2; //Значение переменных сразу буду переводить в минуты
            System.out.println("За 2 минуты машина произвела бутылок: "+time0*bottlesPerMinute+" штук");
        int time1=20;
            System.out.println("За 20 минут машина произвела бутылок: "+time1*bottlesPerMinute+" штук");
        int time2=24*60;
            System.out.println("За сутки машина произвела бутылок: "+time2*bottlesPerMinute+" штук");
        int time3=3*24*60;
            System.out.println("За 3 дня машина произвела бутылок: "+time3*bottlesPerMinute+" штук");
        int time4=31*24*60; //Возьмем месяц с 31 днём
            System.out.println("За 1 месяц машина произвела бутылок: "+time4*bottlesPerMinute+" штук");
            System.out.println();

        //Exercise 5
        int jarNeeds=120,jarWhite=2,jarBrown=4,count=0;
        int classes=jarNeeds/(jarWhite+jarBrown);
            while(count<jarNeeds){
                jarWhite+=2;
                jarBrown+=4;
                count=jarWhite+jarBrown;}
            System.out.println("В школе, где "+classes+" классов, нужно "+jarWhite+"\n"+
                    "банок белой краски и "+jarBrown+" банок коричневой краски");
        System.out.println();

        //Exercise 6
        short bananas=5, milk=200, icecream=2, eggs=4;
        double bananasWeight=80.0, milkWeight=105.0/100.0, icecreamWeight=100.0, eggsWeight=70.0;
        double totalWeightGr=bananas*bananasWeight + milk*milkWeight + icecream*icecreamWeight + eggs*eggsWeight;
        System.out.println("Общий вес спорт-завтрака составляет: "+totalWeightGr/1000+" киллограмм.");
        System.out.println();

        //Exercise 7
        double weightExcess=7.0, minWeight=250.0/1000.0, maxWeight=500.0/1000.0, middleWeight=(minWeight+maxWeight)/2;
        double daysMin=weightExcess/maxWeight, daysMax=weightExcess/minWeight, daysMiddle=weightExcess/middleWeight;
        System.out.println("Если спортсмен будет сбрасывать по 250гр. в весе ежедневно, то ему понадобится дней: "+(int)Math.ceil(daysMax)+"\n"+
                "Если спортсмен будет сбрасывать по 500гр. в весе ежедневно, то ему потребуется дней: "+(int)Math.ceil(daysMin)+"\n"+
                "Если брать среднее количество дней, то оно равно: "+(int)Math.ceil(daysMiddle));
        System.out.println();

        //Exercise 8
        int mashaCash=67760, denisCash=83690, kristinaCash=76230;
        float rate=1.1f;
        int mashaCashYearBefore=mashaCash*12, denisCashYearBefore=denisCash*12, kristinaCashYearBefore=kristinaCash*12;
        int mashaCashAfter=(int)(mashaCash*rate), denisCashAfter=(int)(denisCash*rate), kristinaCashAfter=(int)(kristinaCash*rate);
        int mashaCashYearAfter=mashaCashAfter*12, denisCashYearAfter=denisCashAfter*12, kristinaCashYearAfter=kristinaCashAfter*12;
        System.out.println("Маша теперь получает "+mashaCashAfter+" рублей. Годовой доход вырос на "+mashaCashYearAfter%mashaCashYearBefore+" рублей");
        System.out.println("Денис теперь получает "+denisCashAfter+" рублей. Годовой доход вырос на "+denisCashYearAfter%denisCashYearBefore+" рублей");
        System.out.println("Кристина теперь получает "+kristinaCashAfter+" рублей. Годовой доход вырос на "+kristinaCashYearAfter%kristinaCashYearBefore+" рублей");
        System.out.println();

        //End

    }
}