public class MethodKMP {
    public int methodKMP(String massiv, String obraz){
        int pi[] = new int[obraz.length()];
        pi[0] = 0;
        int j = 0;
        int i = 1;
        while ((i < obraz.length()) && (j < obraz.length())){
            if (obraz.charAt(i) == obraz.charAt(j)){
                pi[i] = j + 1;
                i++;
                j++;
            }
            else if (j == 0){
                pi[i] = 0;
                i++;
            }
            else {
                j = pi[j - 1];
            }
        }

        int k = 0;
        int l = 0;
        int count = 0;

        while ((k < massiv.length()) && (l < obraz.length())){
            count++;
            if (massiv.charAt(k) == obraz.charAt(l)){
                if (l == obraz.length() - 1) return count;
                k++;
                l++;
            }
            else if (l == 0){
                if (k == massiv.length() - 1) return 0;
                k++;
            }
            else l = pi[l - 1];
        }
        return -1;
    }
}
