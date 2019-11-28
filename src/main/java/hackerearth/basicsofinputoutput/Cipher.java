//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cipher-1/
package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cipher {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cipherString = br.readLine();
        Integer cipherKey = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cipherString.length(); i++) {
            if (cipherString.charAt(i) >= 65 && cipherString.charAt(i) <= 90) {

                if (cipherString.charAt(i) + cipherKey > 90) {
                    // changing offset
                    int offset = (cipherString.charAt(i) + cipherKey - 65) % 26;
                    sb.append(Character.toChars(offset + 65));
                } else {
                    sb.append(Character.toChars(cipherString.charAt(i) + cipherKey));
                }
            } else if (cipherString.charAt(i) >= 90 && cipherString.charAt(i) <= 122) {

                if (cipherString.charAt(i) + cipherKey > 122) {
                    // changing offset
                    int offset = (cipherString.charAt(i) + cipherKey - 97) % 26;
                    sb.append(Character.toChars(offset + 97));
                } else {
                    sb.append(Character.toChars(cipherString.charAt(i) + cipherKey));
                }
            } else if (cipherString.charAt(i) >= 48 && cipherString.charAt(i) <= 57) {

                if (cipherString.charAt(i) + cipherKey > 57) {
                    // changing offset
                    int offset = (cipherString.charAt(i) + cipherKey - 48) % 10;
                    sb.append(Character.toChars(offset + 48));
                } else {
                    sb.append(Character.toChars(cipherString.charAt(i) + cipherKey));
                }
            }

            else {
                sb.append(cipherString.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}