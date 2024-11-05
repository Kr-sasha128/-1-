public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }
        if (age < 18) {
            System.out.println("Ты не можешь водить");
        }
        int score = 63;
        if (score <= 60) {
            System.out.println("Ты не прошел тест");
        } else {
            System.out.println("Ты прошел тест");
        }
        int ageTwo = 18;
        if (ageTwo >= 18 && ageTwo < 21) {
            System.out.println("Ты достаточно взрослый чтобы водить но недостаточно взрослый, чтобы пить алкоголь");
        }
        int ageThree = 21;
        boolean canNotGoToSkool = ageThree < 7 || ageThree > 18;
        if (canNotGoToSkool) {
            System.out.println("Я думаю ты не ходишь в школу");
        } else {
            System.out.println("Я думаю ты  ходишь в школу");
        }
//        ЗАДАЧА 1
        int ageFour = 19;
        if (ageFour >= 18) {
            System.out.println("Если возраст человека равен " + ageFour + " лет то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageFour + " лет то он ещё не достиг совершеннолетия, нужно немного подождать.");
        }
//        ЗАДАЧА 2
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
//        ЗАДАЧА 3
        int speedKm = 55;
        if (speedKm > 60) {
            System.out.println("Если скорость " + speedKm + "Км/ч то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedKm + "Км/ч то можно ездить спокойно");
        }
//        ЗАДАЧА 4
        int vozrast = 17;
        if (vozrast >= 2 && vozrast <= 6) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить в детский сад");
        }
        if (vozrast >= 7 && vozrast <= 17) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить в школу");
        }
        if (vozrast >= 18 && vozrast <= 24) {
            System.out.println("Если возраст человека равен " + vozrast + " то его место в университете");
        } else if (vozrast >= 24) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему пора ходить на работу");
        }
//        ЗАДАЧА 5
        int ageForAttraction = 5;
        boolean razresheniyeNaAtraktsiony = ageForAttraction < 5;
        if (razresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + ageForAttraction + " нельзя кататься на аттракционе");
        }
        razresheniyeNaAtraktsiony = ageForAttraction >= 5 && ageForAttraction < 14;
        if (razresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + ageForAttraction + " можно кататься на аттракционе в сопровождении взрослого");
        }
        razresheniyeNaAtraktsiony = ageForAttraction >= 14;
        if (razresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + ageForAttraction + " можно кататься на аттракционе без сопровождения взрослого");
        }
//        ЗАДАЧА 6
        int occupiedSeats = 50;
        int carriageCapacity = 102;
        int seating = 60;
        int standingRoom = carriageCapacity - seating;
        System.out.println(standingRoom + " стоячих мест");
        boolean nalichiyeMesta = occupiedSeats < seating;
        if (nalichiyeMesta) {
            System.out.println("Если в вагоне " + occupiedSeats + " пассажиров то в нём есть сидячие места");
        } else if (occupiedSeats >= seating && occupiedSeats < carriageCapacity) {
            System.out.println("Если в вагоне " + occupiedSeats + " пассажиров то в нём есть стоячие места");
        } else if (occupiedSeats >= carriageCapacity) {
            System.out.println("Если в вагоне " + occupiedSeats + " пассажиров то вагон полностью забит");
        }
//        ЗАДАЧА 7
        int one = 1;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(" Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println(" Число two больше остальных");
        } else {
            System.out.println(" Число three больше остальных");
//            Исправленное ДЗ
        }
    }
}