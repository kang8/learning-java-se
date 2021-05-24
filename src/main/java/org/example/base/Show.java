package org.example.base;

public class Show {
    private String brief;

    public Show(String brief) {
        this.brief = brief;
        System.out.println(brief);
    }

    public Show() {
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public String toString() {
        return "Show{" +
                "brief='" + brief + '\'' +
                '}';
    }

    public static String create(String brief) {
        new Show(brief);
        return brief;
    }
}
