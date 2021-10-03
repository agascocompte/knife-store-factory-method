public class Main {
    public static void main(String[] args) {
        KnifeStore europeStore = new EuropeKnifeStore();
        KnifeStore usStore = new USKnifeStore();

        System.out.println(europeStore.createKnife("chef").getName());
        System.out.println(europeStore.createKnife("steak").getName());
        System.out.println(usStore.createKnife("chef").getName());
        System.out.println(usStore.createKnife("steak").getName());

        /*  Output
        Europe Chefs knife
        Europe Steak knife
        Chefs knife
        Steak knife
         */
    }
}
