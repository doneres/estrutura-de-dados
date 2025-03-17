package binary_search;

public class Main {
    private static int BinarySearch(String[] names, String nomeBuscar) {
        int numeroEtapas = 0;
        int baixo = 0;
        int alto = names.length-1; //busca indexs existentes

        while(baixo < alto){
            int meio = (baixo + alto)/2;
            String chute = names[meio];
            numeroEtapas++;

            if(chute.equals(nomeBuscar)){
                System.out.println(chute);
                return numeroEtapas;
            }else if(chute.compareTo(nomeBuscar) < 0){
                System.out.println(chute+" menor");
                baixo = meio+1;
            }else{
                System.out.println(chute+" maior");
                alto = meio-1;
            }
        }
        return numeroEtapas;
    }

    public static void main(String[] args) {
        String[] names = {
                "Aaron", "Adam", "Aiden", "Alice", "Amber", "Amelia", "Annalise", "Ariana", "Arthur", "Asher", "August", "Axel",
                "Beckett", "Bella", "Beth", "Bianca", "Blake", "Bob", "Brandon", "Bria", "Brody", "Brynn",
                "Caleb", "Callie", "Camila", "Cameron", "Catherine", "Charlie", "Cody", "Connor", "Cyrus",
                "Dahlia", "Daisy", "Dakota", "Daniel", "David", "Dawson", "Dean", "Delilah", "Derek", "Diana",
                "Elias", "Eliana", "Elijah", "Elliot", "Eloise", "Emily", "Emilio", "Ethan", "Eve",
                "Faith", "Faye", "Felix", "Finn", "Ford", "Francesca", "Frank", "Franklin",
                "Gabriella", "Gavin", "Genevieve", "George", "Georgia", "Gideon", "Giovanni", "Grace", "Grayson", "Giselle",
                "Hannah", "Harry", "Haven", "Hazel", "Helena", "Holden", "Holly", "Hudson", "Hunter",
                "Ian", "Iker", "Imogen", "Indigo", "Isaac", "Isaiah", "Isabelle", "Isla", "Ivy",
                "Jack", "Jacob", "Jasmine", "Jayden", "Jenna", "Joelle", "Jordan", "Jude", "Julia",
                "Kara", "Katherine", "Kamila", "Kellan", "Kendall", "Kevin", "Kiera", "Kingston", "Kinsley", "Kyle",
                "Landon", "Laura", "Leilani", "Leo", "Liam", "Liana", "Lily", "Lukas", "Luna",
                "Macy", "Madeline", "Mark", "Mason", "Maverick", "Maxwell", "Melanie", "Micah", "Mia", "Mila",
                "Nathan", "Nash", "Natalie", "Naomi", "Nico", "Nina", "Noah", "Noelle", "Nova", "Nora",
                "Oakley", "Octavia", "Olivia", "Omar", "Opal", "Ophelia", "Orion", "Oscar", "Owen",
                "Paisley", "Parker", "Patrick", "Paul", "Paxton", "Penelope", "Phoebe", "Phoenix", "Piper", "Presley",
                "Queen", "Quentin", "Quincy", "Quinlan", "Quinn", "Quorra",
                "Rachel", "Reagan", "Reese", "Remy", "Riley", "River", "Roman", "Ronan", "Rowan", "Ryan",
                "Samuel", "Savannah", "Scarlett", "Sebastian", "Serena", "Samantha", "Skylar", "Soren", "Sophia", "Stella",
                "Talia", "Tanner", "Theo", "Theodore", "Thomas", "Tiffany", "Tina", "Tobias", "Travis", "Tristan",
                "Ulysses", "Ulises", "Ulric", "Ulrika", "Umar", "Uma", "Uriah", "Uriel", "Ursula",
                "Valentin", "Valentino", "Valeria", "Vance", "Vera", "Victor", "Vienna", "Vince", "Vincent", "Violet",
                "Walter", "Wendy", "Weston", "Whitney", "Willow", "Winter", "Wren", "Wyatt",
                "Xander", "Xavian", "Xavier", "Xena", "Xerxes", "Ximena", "Xiomara", "Xochitl", "Xyla",
                "Yadira", "Yanis", "Yara", "Yasmine", "Yasmin", "Yosef", "Yvonne",
                "Zachary", "Zander", "Zane", "Zara", "Zavier", "Zeke", "Zelda", "Zion", "Zinnia", "Zoe"
        };
        System.out.println(BinarySearch(names,"Skylar"));
    }
}
