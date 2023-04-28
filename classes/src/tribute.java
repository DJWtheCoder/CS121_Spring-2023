public class tribute {

    String name;
    Integer age;
    Integer district;
    String weapon;

    public tribute(String name, Integer age, Integer district, String weapon){
        this.name = name;
        this.age = age;
        this.district = district;
        this.weapon = weapon;
    }

    void printTributeData(){
        System.out.println("\n******** Tribute Data **********");
        System.out.printf("--Name: %s\n--Age: %s\n--Home District: %s\n--Weapon of Choice: %s\n", name, String.valueOf(age), String.valueOf(district), weapon);
    }
}
