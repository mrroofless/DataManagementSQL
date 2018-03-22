package serv;


public class Client {


    private String Fname;
    private String Lname;
    private String Address;
    private int idClient;

    Client(int idClient, String Fname, String Lname, String Address) {
        this.idClient = idClient;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
    }

    public Client(String Fname, String Lname, String Address) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String toString(){
        return Fname + " " + Lname + " " + Address;
    }

    public boolean equals(Client d) {
        return this.Fname.equals(d.Fname) && this.Lname.equals(d.Lname) &&
                this.Address.equals(d.Address);
    }


}
