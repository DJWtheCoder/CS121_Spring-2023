import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        System.out.printf("Welcome to the Hunger Games district database." +
                "\nHere you can learn the star tribute, the industry, and a fun fact." +
                "\nThere are 13 districts in Panem: 1-13.");
        System.out.println("\nPlease enter the district you wish to explore:");
        int district =keys.nextInt();
        String tribute = null, industry=null, fact=null;
        switch (district){
            case 1:
                tribute = "Marvel";
                industry = "Luxury Goods Craftsmanship";
                fact = "This is a Career district. The wealthiest of Panem live here (besides those of the Capitol.";
                break;
            case 2:
                tribute = "Cato";
                industry = "Masonry and Weapon Manufacturing";
                fact = "Career district. This is where Peacekeepers were trained.";
                break;
            case 3:
                tribute = "BeeTee";
                industry = "Technology";
                fact = "This is the home of computer science.";
                break;
            case 4:
                tribute = "Finnick";
                industry = "Fishing";
                fact = "Career district. Know for producing the most attractive citizens of Panem.";
                break;
            case 5:
                tribute = "Foxface";
                industry = "Electricity";
                fact = "They powered all of Panem, with the energy of the earth and sky.";
                break;
            case 6:
                tribute = "Titus";
                industry = "Transportation";
                fact = "Painkiller addiction was big, they produce many morphlings.";
                break;
            case 7:
                tribute = "Johanna";
                industry = "Lumber";
                fact = "Their signature weapon was the ax.";
                break;
            case 8:
                tribute = "Cecelia";
                industry = "Textile";
                fact = "One of first district to join rebellion";
                break;
            case 9:
                tribute = "The nameless girl who fought with Katniss over a backpack during 74th Hunger Games.";
                industry = "Grain production";
                fact = "Least important district in Panem history";
                break;
            case 11:
                tribute = "Rue";
                industry = "Agriculture";
                fact = "This is was one of the largest districts.";
                break;
            case 12:
                tribute = "Katniss Everdeen";
                industry = "Coal Mining";
                fact = "This is where the poorest of Panem lived";
                break;
            case 13:
                tribute = "None";
                industry = "Graphite Mining - later Nuclear Technology";
                fact = "This district was said to be destroyed by the capital, but they moved underground.";
                break;
        }
        System.out.printf("Here is the information on your chosen district:\n" +
                "Tribute: %s\n" +
                "Industry: %s\n" +
                "Fun Fact: %s\n", tribute, industry, fact);

    }
}
