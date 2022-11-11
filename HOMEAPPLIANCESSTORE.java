public class HOMEAPPLIANCESSTORE {
    static String ον;
    static String δ;
    static int πλ;
    public static void main(String[] args) {
        κλάση αντ = new κλάση();
        αντ.setΟν(args[0]);
        αντ.setΔ(args[1]);
        αντ.setΠλ(Integer.parseInt(args[2]));
        System.out.print( αντ.getΟν() + '\n' + αντ.getΔ() + '\n' + αντ.getΠλ() + '\n');
        ον = args[0];
        δ = args[1];
        πλ = Integer.parseInt(args[2]);
        System.out.print( ον + '\n' + δ + '\n' + πλ);
        if(ον == null ) {
            System.out.println("λάθος όνομα");
        }
        if (δ == null ) {
            System.out.println("λάθος διέυθηνση");
        }
    }
}
