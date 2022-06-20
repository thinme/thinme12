package packageTest0001;

public class computer {
    public String company="apple";
    public String name = "MacBook";
    public int OsType;
    public String CPU;
    public String Ram;
    public String SSD;

    public computer() {
    }

    public computer(int inputOsType, String inputCPU, String inputRam, String inputSSD) {
        this.OsType=inputOsType;
        this.CPU= inputCPU;
        this.Ram= inputRam;
        this.SSD= inputSSD;
    }
    
}
