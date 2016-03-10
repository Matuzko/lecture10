package lecture10;


public class Caesar {

    public static String fromNormalToCaesar(String someToCaesar) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < someToCaesar.length(); i++) {
            char c = someToCaesar.charAt(i);
            if (c >= 'd' && c <= 'z') c -= 3;
            else if (c >= 'D' && c <= 'Z') c -= 3;
            else if (c >= 'a' && c <= 'c') c += 23;
            else if (c >= 'A' && c <= 'C') c += 23;
            stringBuilder.append(c);
        }
        String result = stringBuilder.toString();
        return result;
    }

    public static String fromCaesarToNormal(String someToNormal) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < someToNormal.length(); i++) {
            char c = someToNormal.charAt(i);
            if (c >= 'x' && c <= 'z') c -= 23;
            else if (c >= 'X' && c <= 'Z') c -= 23;
            else if (c >= 'a' && c <= 'w') c += 3;
            else if (c >= 'A' && c <= 'W') c += 3;
            stringBuilder.append(c);
        }
        String result = stringBuilder.toString();
        return result;
    }
}
