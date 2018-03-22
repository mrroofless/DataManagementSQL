import java.util.Date;


public class ManagedBeanRequest {
    private int dollar;
    private int rub;
    private int result;
    private Date data;

    private ManagedBeanSession mbs;

    public ManagedBeanRequest() {
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getRub() {
        return rub;
    }

    public void setRub(int rub) {
        this.rub = rub;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ManagedBeanSession getMbs() {
        return mbs;
    }


    public void setMbs(ManagedBeanSession mbs) {
        this.mbs = mbs;
    }

    public String Count(){
        int i = getMbs().getOp_counter();
        getMbs().setOp_counter(i+1);
        result = rub*dollar;
        return "r";
    }
}
