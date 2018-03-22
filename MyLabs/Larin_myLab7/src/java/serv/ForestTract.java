package serv;
import java.sql.Date;

public class ForestTract {
    private int idTract;
    private String name;
    private int area;
    private Date dateLastCheck;
    private int idDirector;

    ForestTract(int idTract, String name, int area, Date dateLastCheck, int idDirector) {
        this.idTract = idTract;
        this.name = name;
        this.area = area;
        this.dateLastCheck = dateLastCheck;
        this.idDirector = idDirector;
    }

    public ForestTract(String name, int area, Date dateLastCheck, int idDirector) {
        this.name = name;
        this.area = area;
        this.dateLastCheck = dateLastCheck;
        this.idDirector = idDirector;
    }

    public int getArea() {
        return area;
    }

    public Date getDateLastCheck() {
        return dateLastCheck;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public int getIdTract() {
        return idTract;
    }

    public String getName() {
        return name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setDateLastCheck(Date dateLastCheck) {
        this.dateLastCheck = dateLastCheck;
    }

    void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    public void setIdTract(int idTract) {
        this.idTract = idTract;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + " " + area + " " + dateLastCheck + " " + idDirector;
    }
}
