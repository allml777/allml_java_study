public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {
                "24/7","multiTier","30,000 foot","B-to-B","win-win",
                "frontend", "web-based","pervasive", "smart", "sixsigma",
                "critical-path", "dynamic"
        };
        String[] wordListTwo = {
                "empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded","outside-the-box", "positioned",
                "networked", "focused", "leveraged", "aligned", "targeted", "shared",
                "cooperative", "accelerated"
        };
        String[] wordListThree = {
                "process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };

        int OneList = wordListOne.length;
        int TwoList = wordListTwo.length;
        int ThreeList = wordListThree.length;

        int rand_1 = (int)(Math.random()*OneList);
        int rand_2 = (int)(Math.random()*TwoList);
        int rand_3 = (int)(Math.random()*ThreeList);

        String phrase_rand = "rand_1:" + rand_1 + "\t" + "rand_2:" + rand_2 +  "\t" + "rand_3:" + rand_3;
        String phrase = wordListOne[rand_1] + " " + wordListTwo[rand_2] + " " + wordListThree[rand_3];

        System.out.println(phrase_rand);
        System.out.println(phrase);





    }
}

