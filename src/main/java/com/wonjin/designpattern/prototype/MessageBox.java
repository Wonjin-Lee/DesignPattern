package com.wonjin.designpattern.prototype;

import com.wonjin.designpattern.prototype.framework.Product;

public class MessageBox extends Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + str + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }
}
