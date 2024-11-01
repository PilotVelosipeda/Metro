package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
@Entity
@Table(name = "allLinesAndStationsMetro")

public class AllLinesAndStationsMetro {
    private Integer id;
    private ArrayList<LineAndHerNamesMetro> stations = new ArrayList<>();

    public void setStations(LineAndHerNamesMetro station) {
        stations.add(station);
    }

    public ArrayList<LineAndHerNamesMetro> getStations() {
        return stations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "All stations: " + getStations();
    }
}
