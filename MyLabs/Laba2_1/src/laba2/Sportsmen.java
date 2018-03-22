/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laba2;

import java.sql.Date;


/**
 *
 * @author ilya270392
 */
public class Sportsmen {
private  int ID_Sportsmena;
private String FIO;
private String Vid_Sporta;
//private Date Data_Rogdenia;
private int Dohod;
private int Stagh_Raboti;
private int Vozrast;

    Sportsmen(int ID_Sportsmena, String FIO, String Vid_Sporta, int Dohod, int Stagh_Raboti, int Vozrast) {
       this.ID_Sportsmena=ID_Sportsmena;
    this.Dohod=Dohod;
    this.FIO=FIO;
    //this.Data_Rogdenia= Data_Rogdenia;
    this.Stagh_Raboti=Stagh_Raboti;
    this.Vid_Sporta=Vid_Sporta;
    this.Vozrast=Vozrast;

    }
/*public String toString(){
    return ID_Sportsmena+': '+FIO+ ':'+Vid_Sporta+ ': ' +Dohod+': '+Stagh_Raboti+':'+Vozrast;


}*/




    /**
     * @return the ID_Sportsmena
     */
    public int getID_Sportsmena() {
        return ID_Sportsmena;
    }

    /**
     * @param ID_Sportsmena the ID_Sportsmena to set
     */
    public void setID_Sportsmena(int ID_Sportsmena) {
        this.ID_Sportsmena = ID_Sportsmena;
    }

    /**
     * @return the FIO
     */
    public String getFIO() {
        return FIO;
    }

    /**
     * @param FIO the FIO to set
     */
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    /**
     * @return the Vid_Sporta
     */
    public String getVid_Sporta() {
        return Vid_Sporta;
    }

    /**
     * @param Vid_Sporta the Vid_Sporta to set
     */
    public void setVid_Sporta(String Vid_Sporta) {
        this.Vid_Sporta = Vid_Sporta;
    }

    /**
     * @return the Data_Rogdenia
     */
  //  public String getData_Rogdenia() {
    //    return Data_Rogdenia;
    //}

    /**
     * @param Data_Rogdenia the Data_Rogdenia to set
     */
    //public void setData_Rogdenia(String Data_Rogdenia) {
      //  this.Data_Rogdenia = Data_Rogdenia;
    //}

    /**
     * @return the Dohod
     */
    public int getDohod() {
        return Dohod;
    }

    /**
     * @param Dohod the Dohod to set
     */
    public void setDohod(int Dohod) {
        this.Dohod = Dohod;
    }

    /**
     * @return the Stagh_Raboti
     */
    public int getStagh_Raboti() {
        return Stagh_Raboti;
    }

    /**
     * @param Stagh_Raboti the Stagh_Raboti to set
     */
    public void setStagh_Raboti(int Stagh_Raboti) {
        this.Stagh_Raboti = Stagh_Raboti;
    }

    /**
     * @return the Vozrast
     */
    public int getVozrast() {
        return Vozrast;
    }

    /**
     * @param Vozrast the Vozrast to set
     */
    public void setVozrast(int Vozrast) {
        this.Vozrast = Vozrast;
    }

    /**
     * @return the Data_Rogdenia
     */
   /* public Date getData_Rogdenia() {
        return Data_Rogdenia;
    }*/

    /**
     * @param Data_Rogdenia the Data_Rogdenia to set
     */
   /* public void setData_Rogdenia(Date Data_Rogdenia) {
        this.Data_Rogdenia = Data_Rogdenia;
    }
*/


}
