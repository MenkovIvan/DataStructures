public class MethodBM {
    public int methodBM(String massiv, String obraz) {
        int pi[] = new int[256];
        for (int i = 0; i < 256; i++) {
            pi[i] = obraz.length();
        }

        for (int i = obraz.length() - 2; i >= 0; i--) {
            if (pi[(int) obraz.charAt(i)] == obraz.length()){
                pi[(int) obraz.charAt(i)] = obraz.length() - i - 1;
            }
        }


        int i = obraz.length() - 1;
        int j = i;
        int count = 0;

        while (i < massiv.length() && j >= 0){
            count++;
            if (massiv.charAt(i) != obraz.charAt(j)){
                if (j == obraz.length() - 1){
                    i += pi[(int) massiv.charAt(i)];
                }
                else {
                    i += pi[(int) obraz.charAt(obraz.length() - 1)] + obraz.length() - j - 1;
                    j = obraz.length() - 1;
                }
            }
            else {
                if (j == 0) return count;
                i--;
                j--;
            }
        }
        return 0;
    }

}
