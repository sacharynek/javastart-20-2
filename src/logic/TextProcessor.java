package logic;

public class TextProcessor {

    public static int getCharAmount(String text){
        return text.length();
    }

    public static int getCharAmountWithoutSpace(String text){
        return text.replace(" ", "").length();
    }

    public static int getWordCount(String text){
        String trim = text.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    public static boolean isPalindrome(String text){
        return text.equals(new StringBuilder(text).reverse().toString());
    }

}
