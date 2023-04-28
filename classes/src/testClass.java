public class testClass {
    public static void main(String[] args){
        tribute Katniss = new tribute("Katniss Everdeen", 16, 12, "Bow and Arrow");
        district Twelve = new district(12, "Coal Mining", 2, "Haymitch Abernathy - only living victor of district. At 16, he won the Second Quarter Quell.");
        tribute Haymitch = new tribute("Haymitch Abernathy", 40, 12, "Knife");

        Katniss.printTributeData();
        Twelve.districtDictionary();
        Twelve.calculateWinningChance();
        Haymitch.printTributeData();
    }
}
