package by.gsu.pms.idz_1_classes.butter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort_butters {

    public static ArrayList<Butter> sortButtersByPrice(ArrayList<Butter> butters) {
        butters.sort(Comparator.comparing(Butter::getPrice));
        return butters;
    }

    public static ArrayList<Butter> sortButtersByName(ArrayList<Butter> butters) {
        butters.sort(Comparator.comparing(Butter::getName));
        return butters;
    }
}
