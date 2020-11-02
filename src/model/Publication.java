package model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Publication implements  Serializable, Comparable <Publication>, CsvConvertible{

    private int year;
    private String title;
    private String publisher;

    Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String toString() {
        return title + "; " + publisher + "; " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(publisher, that.publisher)&&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, publisher);
    }

    public int CompareTo(Publication p){
        return title.compareToIgnoreCase(p.title);
    }
}