package com.mugalliRufaida;

public class Brain_fuck {

    String[] sourceCode = {"+", "+", "+", "+", "+", "+", "+", "+", "#", "+", "+", "+", "#", "+", "+", "+", "#", "+", "+", "+", "+", "+",
            "+", "+", "#", ">", "+", "+", "+", "+", "#", "<", "-","-","#","<","#","+","+","+","+","#","+","+","+","+","+","+","+","+","+","+","+","+","#","<","-","-","-","-","-","-","-","-","-",
            "-","-","#","+","#"};

    private char[] workingTape = new char[10];
    private int index = 0;

    // constructor
    public Brain_fuck() {
        initWork();
        work(sourceCode);


    }

    void initWork() {
        for (int i = 0; i < workingTape.length; i++) {
            workingTape[i] = 'a';
        }
    }

    void shiftRight() {
        if (workingTape.length > 10) {
            index = 0;
        } else {
            index++;
        }
    }

    public void shiftLeft() {
        if (workingTape.length <= 10) {
            index = workingTape.length - 1;
        } else {
            index--;
        }
    }

    private void plus() {
        workingTape[index]++;
    }

    private void minus() {
        workingTape[index]--;
    }

    private void print() {
        System.out.print(workingTape[index]);
    }

    public void work(String[] sourceCode) {
        for (String c : sourceCode) {
            switch (c) {
                case "#":
                    print();
                    break;
                case "+":
                    plus();
                    break;

                case "-":
                    minus();
                    break;
                case ">":
                    shiftRight();
                    break;
                case "<":
                    shiftLeft();
                    break;
                default:
                    System.out.println("Code " + c + " ist nicht zulaessig!");
            }
        }
    }


    public static void main(String[] args) {
        Brain_fuck brain_fuck = new Brain_fuck();
    }
}
