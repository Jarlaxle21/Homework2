public class Main {
    public static void main(String[] args) {

        System.out.println ("Задача№1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println ("Задача№2");
        var resultDogPlus = dog + 2;
       var resultCatPlus = cat + 2;
       var resultPaperPlus = paper + 2;
        System.out.println ("dog+2="    +resultDogPlus );
        System.out.println ("cat+2="    + resultCatPlus);
        System.out.println ("paper+2=" + resultPaperPlus);

        System.out.println ("Задача№3");
        var resultDogMinus = dog - 3.5;
        var resultCatMinus = cat - 1.6;
        var resultPaperMinus = paper - 7639;
        System.out.println ("dog-3.5="  + resultDogMinus );
        System.out.println ("cat-1.6=" + resultCatMinus );;
        System.out.println ("paper-7639="   +resultPaperMinus);

        System.out.println ("Задача№4");
        var friend  =   19;
        var friendPlus  =   friend + 2;
        var friendDivide    =   friendPlus/7;
        System.out.println (friend);
        System.out.println ("friend+2=" + friendPlus);
        System.out.println ("(friend+2)/7=" + friendDivide);

        System.out.println ("Задача№5");
        var frog = 3.5;
        var frogMultiplication = frog * 10;
        var frogDivide = frogMultiplication / 3.5;
        var frogPlus = frogDivide + 4;;
        System.out.println (frog);
        System.out.println ("frog*10="+ frogMultiplication);
        System.out.println ("frog*10/3.5="+ frogDivide);
        System.out.println ("frog*10/3.5+4=" + frogPlus);

        System.out.println ("Задача№6");
        var boxerNumberOne = 78.2;;
        var boxerNumberTwo = 82.7;
        var totalWeight = boxerNumberOne + boxerNumberTwo;
        var weightDifference = boxerNumberTwo - boxerNumberOne;
        System.out.println ("Масса первого боксёра -" + boxerNumberOne + "кг.");
        System.out.println ("Масса второго боксёра -" + boxerNumberTwo + "кг.");
        System.out.println ("Общая масса боксёров -" + totalWeight + "кг.");
        System.out.println ("Разница массы боксёров -" + weightDifference + "кг.");

        System.out.println ("Задача№7");
        var remainderOfDivide = boxerNumberTwo % boxerNumberOne;
        System.out.println ("Остаток от деления веса -" +remainderOfDivide);

        System.out.println ("Задача№8");
        System.out.println ("Часть 1");
        var numberOfHours = 640;
        var workingDay = 8;
        var numberOfEmployees = numberOfHours / workingDay;
        System.out.println ("Всего работников в компании-" + numberOfEmployees + "человек");

        System.out.println ("Часть 2");
        var increasedNumberOfEmployees = numberOfEmployees + 94;
        var increasedNumberOfHours = increasedNumberOfEmployees * 8;
        System.out.println ("Если в компании работает " + increasedNumberOfEmployees + " человека, то всего " + increasedNumberOfHours + " часа работы может быть поделено между сотрудниками");


    }
}

