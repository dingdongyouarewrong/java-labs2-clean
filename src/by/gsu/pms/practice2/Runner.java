package by.gsu.pms.practice2;


import by.gsu.pms.practice2.material_package.Material;
import by.gsu.pms.practice2.material_package.Subject;

public class Runner {
    public static void main(String[] args) {
        Subject subj = new Subject("name1", new Material("name1", 1), 1);
        subj.setMaterial(new Material("name2", 2));
        subj.setMaterial(new Material("name1", 1));
        System.out.println(subj);
    }
}