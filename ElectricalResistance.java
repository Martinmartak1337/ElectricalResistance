public class ElectricalResistance {
    public static void main(String[] args){
        System.out.println(parallelElectricalResistance(1,2)); // <- Your doubles
        System.out.println(serialElectricalResistance(8,5,9)); // <- Your doubles
    }
    public static double parallelElectricalResistance(double... Resistance){
        double resistance=0;
        if(Resistance.length == 2){
            return (Resistance[0]*Resistance[1])/(Resistance[0]+Resistance[1]);
        } else {
            for(double i : Resistance){
                resistance = 1/Resistance[(int) i]+resistance;
            }
            return resistance/1;
        }
    }
    public static double serialElectricalResistance(double... resistance){
        double Resistance=0;

        for (int i = 0; i < resistance.length-1; i++) {
            Resistance += resistance[i];
        }
        return Resistance;
    }
}
