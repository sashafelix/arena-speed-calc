package com.ipcommz.arenaspeedcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import static com.ipcommz.arenaspeedcalc.Methods.*;

@SpringBootApplication
@RestController

public class ArenaSpeedCalcApplication {
    double speed, speed2, speed3, speed4 = 0;
    String champName, champName2;

    public static void main(String[] args) {
        SpringApplication.run(ArenaSpeedCalcApplication.class, args);
    }


    @RequestMapping("/index")
    public String calculation(@RequestParam String champName, double baseSpeed, double gearSpeed, double auraSpeed, double turnMeterBoost, double speedBuff, boolean loreOfSteel, double loreOfSteelCount/*, String champName2, double baseSpeed2, double gearSpeed2, double auraSpeed2, double turnMeterBoost2, double speedBuff2, boolean loreOfSteel2, double loreOfSteelCount2*/) {
        speed = speedCalc(baseSpeed, gearSpeed, auraSpeed, turnMeterBoost, speedBuff, loreOfSteel, loreOfSteelCount);
//        speed2 = speedCalc(baseSpeed2, gearSpeed2, auraSpeed2, turnMeterBoost2, speedBuff2, loreOfSteel2, loreOfSteelCount2);
//        speed3 = speedCalc(baseSpeed, gearSpeed, auraSpeed, turnMeterBoost, speedBuff, loreOfSteel, loreOfSteelCount);
//        speed4 = speedCalc(baseSpeed, gearSpeed, auraSpeed, turnMeterBoost, speedBuff, loreOfSteel, loreOfSteelCount);
        return champName + ": " + speed;
    }



    private static double speedCalc(double baseSpeed, double gearSpeed, double auraSpeed, double turnMeterBoost, double speedBuff, boolean loreOfSteel, double loreOfSteelCount) {

        double turnMeterIncrease;
        double newGearSpeed = 0;
        double speedBuffCalc = 0;
        double totalSpeed;


        turnMeterIncrease = (baseSpeed / 100) * turnMeterBoost;

        if (loreOfSteel) {
            //loreOfSteelCalc(loreOfSteelCount);
            newGearSpeed = loreOfSteelCalc(loreOfSteelCount) + gearSpeed;
        } else {
            newGearSpeed = gearSpeed;
        }

        speedBuffCalc();

        totalSpeed = newSpeed(baseSpeed, auraSpeedIncrease(baseSpeed, auraSpeed), newGearSpeed) + turnMeterIncrease;
        return totalSpeed;
    }

}
