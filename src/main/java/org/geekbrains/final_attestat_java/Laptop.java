package org.geekbrains.final_attestat_java;
/**
 * Класс Laptop представляет собой модель ноутбука.
 */
public class Laptop {private final String model;
    private final int ram;
    private final int hddCapacity;
    private final String os;
    private final String color;
    private final double price;
    /**
     * Конструктор класса Laptop.
     *
     * @param model       Модель ноутбука.
     * @param ram         Объем оперативной памяти в ГБ.
     * @param hddCapacity Объем жесткого диска в ГБ.
     * @param os          Операционная система.
     * @param color       Цвет ноутбука.
     * @param price       Цена ноутбука.
     */
    public Laptop(String model, int ram, int hddCapacity, String os, String color, double price) {
        this.model = model;
        this.ram = ram;
        this.hddCapacity = hddCapacity;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Возвращает строковое представление объекта в формате:
     * "Laptop{model='...', ram=..., hddCapacity=..., os='...', color='...', price=...}"
     *
     * @return строковое представление информации о ноутбуке.
     */
    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", hddCapacity=" + hddCapacity +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
