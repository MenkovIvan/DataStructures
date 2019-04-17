public class MethodPerebor {
    public int  methodPerebor(String massiv, String obraz){
        int i = 0;
        int j = 0;
        int count = 0;
        int countSrav = 0;

        while (i < massiv.length() && j < obraz.length()){
            count++;
            if (massiv.charAt(i) == obraz.charAt(j)){
                if (j == obraz.length() - 1) return count;
                i++;
                j++;
                countSrav++;
            }
            else {
                i -= countSrav - 1;
                j = 0;
                countSrav = 0;
            }
        }
        return 0;
    }
}
