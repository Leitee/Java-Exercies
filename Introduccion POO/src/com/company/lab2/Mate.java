package com.company.lab2;

public class Mate {
    private int cebadasRemaining;
    private boolean isFilled;

    public Mate(int cebadasQty) {
        this.cebadasRemaining = cebadasQty;
    }

    public void cebar() throws MateAlreadyFilledException {
        if(this.isFilled) {
            throw new MateAlreadyFilledException("Watch out, you burned out!!!");
        }

        this.isFilled = true;
    }

    public void beber() throws MateIsEmptyException {
        if(!this.isFilled) {
            throw new MateIsEmptyException("The mate is empty!!!");
        }

        if(this.cebadasRemaining == 0) {
            System.out.println("Warning: mate tasteless");
        }

        this.isFilled = false;
        this.cebadasRemaining = this.cebadasRemaining > 0 ? this.cebadasRemaining - 1 : 0;
    }
}

class MateAlreadyFilledException extends RuntimeException {
    public MateAlreadyFilledException(String msg) {
        super(msg);
    }
}

class MateIsEmptyException extends RuntimeException {
    public MateIsEmptyException(String msg) {
        super(msg);
    }
}
