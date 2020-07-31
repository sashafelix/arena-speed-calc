package com.ipcommz.arenaspeedcalc;

class Methods extends ArenaSpeedCalcApplication{

    static double auraSpeedIncrease(double baseSpeed, double auraSpeed) {
        return (baseSpeed / 100) * auraSpeed;
    }

    static double newSpeed(double baseSpeed, double auraSpeedIncrease, double newGearSpeed) {

        return baseSpeed + auraSpeedIncrease + newGearSpeed;
    }

    static void speedBuffCalc() {


    }

    static double loreOfSteelCalc(double loreOfSteelCount) {

        double losCalc = 0;
        switch ((int) loreOfSteelCount) {
            case 1:
                losCalc = 12 * 0.15;
                break;
            case 2:
                losCalc = 12 * 0.15 + ((12 * 0.15) * 0.15);
                break;
            case 3:
                losCalc = 12 * 0.15 + ((12 * 0.15) * 0.15) + (((12 * 0.15) * 0.15) * 0.15);
                break;
        }
        return losCalc;
    }
}
