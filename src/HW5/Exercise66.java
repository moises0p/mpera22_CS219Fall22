package HW5;

public class Exercise66 {



        public static boolean canSpell(String word, String tiles) {
            int tracker=0;
            int index=0;

            while (index<=word.length()-1){
                boolean flag=false;
                int newL=0;
            for (int i = 0; i < tiles.length(); i++) {
                char letter = tiles.charAt(i);
                char l = word.charAt(index);
                if (l == letter) {
                    flag=true;
                    newL=i;

                }

            } // loop
                if (flag){
                    tracker++;

                    tiles = tiles.substring(0,newL) + tiles.substring(newL+1);
                }

            index++;
            } // loop
            if (tracker==word.length()){
                return true;
            } else{
                return false;
            }
        }

        public static void main(String [] args) {
            System.out.println(canSpell("boot", "axobasrto"));
            System.out.println(canSpell("hippo", "haxobapsrito"));
            System.out.println(canSpell("spongecake", "pppppppppppppppsssssppps"));
            System.out.println(canSpell("ubereiks", "we are the ubereiks five or fourto.lowercase"));



            // Student: add more test cases
        }






}
