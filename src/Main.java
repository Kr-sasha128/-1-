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
        int ageTho = 17;
        if (ageTho >= 18 && ageTho < 21) ;
        System.out.println("Ты достаточно взрослый чтобы водить но недостаточно взрослый, чтобы пить алкоголь");

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
        int Vozrast = 25;
        if (Vozrast > 2 && Vozrast <= 6) {
            System.out.println("Если возраст человека равен " + Vozrast + " то ему нужно ходить в детский сад");
        }
        if (Vozrast > 7 && Vozrast <= 17) {
            System.out.println("Если возраст человека равен " + Vozrast + " то ему нужно ходить в школу");
        }
        if (Vozrast >= 18 && Vozrast <= 24) {
            System.out.println("Если возраст человека равен " + Vozrast + " то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + Vozrast + " то ему пора ходить на работу");
        }
//        ЗАДАЧА 5
        int AgeForAttraction = 4;
        boolean RazresheniyeNaAtraktsiony = AgeForAttraction < 5;
        if (RazresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + AgeForAttraction + " нельзя кататься на аттракционе");
        }
        RazresheniyeNaAtraktsiony = AgeForAttraction >= 5 && AgeForAttraction < 14;
        if (RazresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + AgeForAttraction + " можно кататься на аттракционе в сопровождении взрослого");
        }
        RazresheniyeNaAtraktsiony = AgeForAttraction >= 14;
        if (RazresheniyeNaAtraktsiony) {
            System.out.println("Если возраст ребёнка равен " + AgeForAttraction + " можно кататься на аттракционе без сопровождения взрослого");
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
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(" Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println(" Число two больше остальных");
        } else {
            System.out.println(" Число three больше остальных");
        }
    }
}