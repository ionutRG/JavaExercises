package electrical_resistance;

public class ElectricalResistance {
    float wireLengthM;
    float wireDiameterM;
    float wireAreaM2=(wireDiameterM*wireDiameterM/4)*3.141f;
    float wireCurrentA;
    float wireVoltageV;
    String wireMaterial;
    float wireResistivityOhmM;

    public String getWireMaterial() {
        return wireMaterial;
    }

    public void setWireMaterial(String wireMaterial) {
        this.wireMaterial = wireMaterial;
    }

    public double getWireResistivityOhmM() {
        return wireResistivityOhmM;
    }

    public void setWireResistivityOhmM(float wireResistivityOhmM) {
        this.wireResistivityOhmM = wireResistivityOhmM;
    }

    public double getWireCurrentA() {
        return wireCurrentA;
    }

    public void setWireCurrentA(float wireCurrentA) {
        this.wireCurrentA = wireCurrentA;
    }

    public double getWireVoltageV() {
        return wireVoltageV;
    }

    public void setWireVoltageV(float wireVoltageV) {
        this.wireVoltageV = wireVoltageV;
    }

    public double getWireLengthM() {
        return wireLengthM;
    }

    public void setWireLengthM(float wireLengthM) {
        this.wireLengthM = wireLengthM;
    }

    public double getWireDiameterM() {
        return wireDiameterM;
    }

    public void setWireDiameterM(float wireDiameterM) {
        this.wireDiameterM = wireDiameterM;
    }

    public double getWireRestivity() {
        return wireResistivityOhmM;
    }

    public void setWireRestivity(float wireRestivity) {
        this.wireResistivityOhmM = wireRestivity;
    }

    public double getWireAreaM2() {
        return wireAreaM2;
    }

    public void setWireAreaM2(float wireAreaM2) {
        this.wireAreaM2 = wireAreaM2;
    }

    public static void main(String[] args) {
        ElectricalResistance wireLength = new ElectricalResistance();
        ElectricalResistance wireDiameter = new ElectricalResistance();
        ElectricalResistance wireResistivity = new ElectricalResistance();
        ElectricalResistance wireArea = new ElectricalResistance();
        ElectricalResistance wireMaterial = new ElectricalResistance();

        wireLength.setWireLengthM(1.00f);
        wireDiameter.setWireDiameterM(0.001f);
        wireResistivity.setWireRestivity(1.78e-8f);
        wireMaterial.setWireMaterial("Copper");
        wireResistivity.setWireRestivity((float) (wireResistivity.getWireRestivity()*(wireLength.getWireLengthM()*wireArea.getWireAreaM2())));
//        wireArea.setWireAreaM2(((wireDiameter.getWireAreaM2()/2)*(wireDiameter.getWireAreaM2()/2))*3.141);
// Calculation of wire area: pi*r^2
//        float area = (float) (((wireDiameter.getWireDiameterM()/2)*(wireDiameter.getWireDiameterM()/2))*3.141);
        float resistivity = (float) (wireResistivity.getWireRestivity()*(wireLength.getWireLengthM()/wireAreaM2()));

        System.out.println("Wire length[m] is: " + wireLength.getWireLengthM() + " and has a diameter[m] of: " + wireDiameter.getWireDiameterM());
        System.out.println("Wire area[m2] is: " + wireArea);
        System .out.println("Wire material is: " + wireMaterial.getWireMaterial() + " and has a resistivity[Ohm*m] of: " + wireResistivity.getWireRestivity());
        System.out.println("Wire resistivity[Ohm*m] is: " + wireResistivity.getWireRestivity());


    }

    private static float wireAreaM2() {
        return 0;
    }

    private static double area() {
        return 0;
    }
}
