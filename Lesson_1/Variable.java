public class Variable {
    public static void main (String[] args) {
        //объявление и инициализация переменной типа byte. core - количество ядер процессора
        byte numberCore = 8;
        //объявление и инициализация переменной типа short. capacityRam - объем оперативной памяти, в МБ
        short capacityRam = 20480;
        //объявление и инициализация переменной типа int. capacitySsd - объем ssd накопителя, в МБ
        int capacitySsd = 524288;
        //объявление и инициализация переменной типа long. speedRam - скорость оперативной памяти, в Гц
        long speedRam = 2400000000l;
        //объявление и инициализация переменной типа float  speedCpuF - Базовая скорость процессора, в ГГц
        float speedCpuF = 1.8f;
        //объявление и инициализация переменной типа double. speedCpuD - Базовая скорость процессора, в ГГц
        double speedCpuD = 1.8d;
        //объявление и инициализация переменной типа char. systemDisc - Наименование диска с ОС
        char systemDisc = 'C';
        //объявление и инициализация переменной типа boolean. Сравнение текущей скорости CPU c  базовой скоростью CPU
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