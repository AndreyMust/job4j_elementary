package ru.job4j.stream;

public class Laptop {
    private String brand;
    private String model;
    private String osName;
    private int ram;
    private int hddSize;
    private float screen;
    private float weight;

    @Override
    public String toString() {
        return "Laptop Description: " + '\n'
                + " Brand Name: " + brand + '\n'
                + " Model Name: " + model + '\n'
                + " OS Name: " + osName + '\n'
                + " RAM Size: " + ram + " GB \n"
                + " HDD Size: " + hddSize + " GB\n"
                + " Screen Size: " + screen + " inch\n"
                + " Weight: " + weight + " kg\n";
    }

        static class Builder {
        private String brand;
        private String model;
        private String osName;
        private int ram;
        private int hddSize;
        private float screen;
        private float weight;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildOsName(String osName) {
            this.osName = osName;
            return this;
        }

        Builder buildRam(int ram) {
            this.ram = ram;
            return this;
        }

        Builder buildHddSize(int hddSize) {
            this.hddSize = hddSize;
            return this;
        }

        Builder buildScreen(float screen) {
            this.screen = screen;
            return this;
        }

        Builder buildWeight(float weight) {
            this.weight = weight;
            return this;
        }

        Laptop build() {
            Laptop laptop = new Laptop();
            laptop.brand = brand;
            laptop.model = model;
            laptop.osName = osName;
            laptop.ram = ram;
            laptop.hddSize = hddSize;
            laptop.screen = screen;
            laptop.weight = weight;
            return laptop;
        }
    }

    /**
     * Пример шаблона Строитель
     * @param args - нет
     */
    public static void main(String[] args) {
        Laptop laptop = new Builder().buildBrand("IBM")
                .buildModel("Astra_RTZ5090")
                .buildOsName("Win12")
                .buildRam(8)
                .buildHddSize(2000)
                .buildScreen(14.2f)
                .buildWeight(2.8f)
                .build();
        System.out.println(laptop);
    }
}
