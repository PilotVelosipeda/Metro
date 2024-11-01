package model;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.Objects;

public class FromJsonToJava {
    @Column (name = "station")
    private String station_name;
    @Column (name = "depth")
    private String depth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FromJsonToJava that = (FromJsonToJava) o;
        return Objects.equals(station_name, that.station_name) && Objects.equals(depth, that.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(station_name, depth);
    }

    public String getStation_name() {
        return station_name;
    }

    public String getDepth() {
        return depth;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "From json to java:\n" +
                "\tStation name \"" + station_name + "\"," +
                "\n\tDepth \"" + depth + "\".\n";
    }
}
