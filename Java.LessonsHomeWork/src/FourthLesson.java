public class FourthLesson {
    public static void main(String[] args) {
//        System.out.println("Task 1");
//        theLongest("Fear Leads to Anger,", "Anger Leads to Hate,", "and Hate Leads to Suffering");
//        theLongest("May the Force","Be","With You");


//        System.out.println();
//        System.out.println("Task 2");
//        System.out.println(itIsPalindrome("saippuakivikauppias")); //торговец щёлоком на финском
//        System.out.println(itIsPalindrome("а роза упала на лапу Азора"));
//
//        System.out.println();
//        System.out.println("Task 3");
//        System.out.println(Сensorship("Встретились Бяка и Бука.\n" +
//                "Никто не издал ни звука.\n" +
//                "Никто не подал и знака —\n" +
//                "Молчали Бука и Бяка.\n" +
//                "\n" +
//                "И Бука\n" +
//                "Думал со скукой:\n" +
//                "«Чего он так смотрит — букой?»\n" +
//                "А Бяка думал:\n" +
//                "«Однако\n" +
//                "Какой он ужасный\n" +
//                "Бяка…»"));
//
//
//        System.out.println();
//        System.out.println("Task 4");
//        System.out.println(Occurrences("test", "This is a test string to test test"));
//
//
        System.out.println();
        System.out.println("Task 5");
        System.out.println(reverse("This is a test string"));


    }

    public static void theLongest(String str1, String str2, String str3){
        int a = str1.length();
        int b = str2.length();
        int c = str3.length();

        String name = " - самая длинная строка";

        if(a == b && b == c){
            System.out.println("");
        }
        else {
            if (a >= b && a >= c) {
                System.out.println(str1 + name);
            } else if (b >= a && b >= c) {
                System.out.println(str2 + name);
            } else {
                System.out.println(str3 + name);
            }
        }
    }

    public static boolean itIsPalindrome(String str) {
        return str.replaceAll("\\W","").equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W","")).reverse().toString());
    }

    public static String Occurrences(String str){
        String[] text = str.split(" ");
        String badWord = "Бяка";
        String result = "";
        for (String string : text){
            if(string.equalsIgnoreCase(badWord)){
                result =  str.replaceAll(badWord, "[вырезано цензурой]");
            }
        }
        return result;
    }

    public static int Occurrences(String s, String str){
        String[] text = str.split(" ");
        int count = 0;
        for(String string : text){
            if(s.equalsIgnoreCase(string))
                count++;
        }
        return count;
    }

    public static String reverse(String str){
        StringBuilder reverser = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reverser.append(sb.reverse());
            reverser.append(" ");
        }
        return reverser.toString();
    }

}
