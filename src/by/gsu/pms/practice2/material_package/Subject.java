package by.gsu.pms.practice2.material_package;

public class Subject {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", material=" + material +
                ", volume=" + volume +
                '}';
    }

    private String name;
    private Material material;
    private double volume;



    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Subject() {
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

}