package com.company.lab2;

public class Pen {
    private int inkQty;

    public Pen(int ink){
        this.inkQty = ink;
    }

    public void write(String text, Papper papper){
        if(text.length() > inkQty){
            throw new NoInkException("There is no enough ink.");
        }

        this.inkQty -= text.length();
        papper.write(text);
    }
}

class NoInkException extends RuntimeException {
    public NoInkException(String msg){
        super(msg);
    }
}
