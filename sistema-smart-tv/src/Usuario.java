public class Usuario {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("canal? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume? " + smartTv.volume);

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        System.out.println("Canal? " + smartTv.canal);

        smartTv.escolherCanal(55);
        System.out.println("Canal? " + smartTv.canal);

    }
}
