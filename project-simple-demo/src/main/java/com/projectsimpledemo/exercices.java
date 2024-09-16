package com.projectsimpledemo;

public class exercices {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutesPassed) {
        return expectedMinutesInOven() - minutesPassed;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int minutesPassed) {
        return preparationTimeInMinutes(layers)+minutesPassed;
    }

    public static void main(String[] args) {
        System.out.println(totalTimeInMinutes(1, 0));
    }

}
