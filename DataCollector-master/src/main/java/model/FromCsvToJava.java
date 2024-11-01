package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table (name = "from_csv_to_java")
public class FromCsvToJava {

    private String name;

    private LocalDate data;

    public FromCsvToJava(String name, LocalDate data) {
        this.name = name;
        this.data = data;
    }
    public String getName() {return name;
    }
    public void setName(String name) {this.name = name;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FromCsvToJava that = (FromCsvToJava) o;
        return Objects.equals(name, that.name) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data);
    }

    @Override
    public String toString() {

        return "From csv to java:\n" +
                "\tName \"" + name + "\"," +
                "\n\tDate \"" + data + "\".\n";
    }
}
