package by.gsu.pms.practice2.material_package;

public class Material {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    private String name;
    private int density;

    public Material() {
    }

    public Material(String name, int density) {
        this.name = name;
        this.density = density;
    }



    @Override
    public String toString() {
        return name + ";" + density;
    }

}