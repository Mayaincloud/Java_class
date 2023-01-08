package HW_6;

public class Laptop {
    private int ram;
    private int capacity;
    private String os;
    private String color;

    public int getColor() {
        if (color.equals("Черный")) return 1;
        else if (color.equals("Серый")) return 2;
        else return 3;
    }
    public void setColor(String color) {
            this.color = color;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOs() {
        if (os.equals("MacOs")) return 1;
        else if (os.equals("Linux")) return 2;
        else return 3;
    }

    public void setOs(String os) {
        this.os = os;
    }


    @Override
    public String toString() {
        return "Ноутбук{" +
                "ОЗУ=" +
                ", Объем ЖД=" + capacity +
                ", Цвет=" + color +
                ", ОС=" + os +
                '}';
    }
}
