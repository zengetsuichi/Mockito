package pl.kurs.wyrwalke;

import java.util.List;

public class Engine {

    private double displacement;
    private String type;
    private List<Part> parts;

    public Engine(double displacement, String type, List<Part> parts) {
        this.displacement = displacement;
        this.type = type;
        this.parts = parts;

        if(parts == null || parts.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }



    }

    public void addPart(Part part){
        parts.add(part);

    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}
