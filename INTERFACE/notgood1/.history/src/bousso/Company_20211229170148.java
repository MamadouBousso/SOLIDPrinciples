public class Company{
    private Designer ds;
    private Dev dev;
    public Company(Designer ds, Dev dev, Testeur test) {
        this.ds = ds;
        this.dev = dev;
        this.test = test;
    }
    public Designer getDs() {
        return ds;
    }
    public void setDs(Designer ds) {
        this.ds = ds;
    }
    public Dev getDev() {
        return dev;
    }
    public void setDev(Dev dev) {
        this.dev = dev;
    }
    public Testeur getTest() {
        return test;
    }
    public void setTest(Testeur test) {
        this.test = test;
    }
    private Testeur test;
}