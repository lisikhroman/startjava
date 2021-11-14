public class Variable {
    public static void main (String[] args) {
        byte numberCore = 8;
        short capacityRam = 20480;
        int capacitySsd = 524288;
        long speedRam = 2400000000l;
        float speedCpuF = 1.8f;
        double speedCpuD = 1.8d;
        char systemDisc = 'C';
        boolean currentSpeedCpu = 1.1 < speedCpuF;
        
        System.out.println(numberCore);
        System.out.println(capacityRam);
        System.out.println(capacitySsd);
        System.out.println(speedRam);
        System.out.println(speedCpuF);
        System.out.println(speedCpuD);
        System.out.println(systemDisc);
        System.out.println(currentSpeedCpu);
    }

}