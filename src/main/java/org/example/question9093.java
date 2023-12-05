package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                StringBuffer stringBuffer = new StringBuffer(str[i]);
                System.out.print(stringBuffer.reverse() + " ");
            }
            System.out.println();
        }
    }
}
