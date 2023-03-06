public class ElectricalResistance {
    public static void main(String[] args){
        System.out.println(parallelElectricalResistance()); // <- Your values
        System.out.println(serialElectricalResistance()); // <- Your values
    }
    public static double parallelElectricalResistance(double... Resistance){
        int x = 0;
        double resistance=0;
        if(Resistance.length == 2){
            return (Resistance[0]*Resistance[1])/(Resistance[0]+Resistance[1]);
        } else {
            for(double i : Resistance){
                resistance = 1/Resistance[x]+resistance;
                x++;
            }
            return 1/resistance;
        }
    }
    public static double serialElectricalResistance(double... resistance){
        int x = 0;
        double Resistance=0;
        for(double b : resistance){
            Resistance = Resistance + resistance[x];
        }
        return Resistance;
    }
}
