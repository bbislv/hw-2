import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println(totalWeight);
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println(weightDifference);

        var remained = boxer2Weight % boxer1Weight;
        System.out.println(remained);

        var workTime = 640;
        var timePerDay = 8;
        var employeeCount = workTime / timePerDay;
        System.out.println("Всего работников в компании — " + employeeCount + " человек");

       employeeCount = employeeCount +94;
       var newTimePerDay = workTime / employeeCount;
       System.out.println("Если в компании работает " + employeeCount + " человека," + " то всего " + newTimePerDay + " часа работы может быть поделено между сотрудниками");




    }
}