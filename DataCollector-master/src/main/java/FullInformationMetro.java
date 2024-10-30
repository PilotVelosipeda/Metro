import java.time.LocalDate;

public record FullInformationMetro(String nameStation, String depth, String date) { //проджект класс (гет,сет,то струнг)

    public String toString() {
        return "Name station \"" + nameStation + "\"\n" +
                "Depth station \"" + depth + "\"\n" +
                "Date create station \"" + date + "\"\n";
    }
}

