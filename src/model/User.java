package model;

import java.io.Serializable;
import java.util.Objects;

public abstract class User implements Serializable, CsvConvertible {
    private String name;
    private String surname;
    private String pesel;

    public User(String  name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Objects.equals(getPesel(), user.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPesel());
    }

    @Override
    public String toString() {
        return "Imię: " + name + " Nazwisko: " + surname + " Pesel: " + pesel;
    }
}
