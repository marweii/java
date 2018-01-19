package Challenge;

public class rotateString {
    public void rotate(char[] str, int offset) {
        // write your code here

        int size = str.length;
        if(size!=0) {
            offset = offset % size;
            char a, b;
            char[] str1 = new char[size];
            for (int i = 0; i < size; i++) {
                str1[i] = str[i];
            }
            for (int i = 0; i < size; i++) {
                str[i] = str1[(size - offset + i) % size];
            }
        }else {
        }
    }
}
