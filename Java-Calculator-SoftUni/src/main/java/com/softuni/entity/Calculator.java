package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }


    public double getLeftOperand() {
        return this.leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return this.rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {

        switch (this.operator) {
            case "+":
                return this.leftOperand + this.rightOperand;

            case "-":
                return this.leftOperand - this.rightOperand;

            case "*":
                return this.leftOperand * this.rightOperand;

            case "/":
                return this.leftOperand / this.rightOperand;

            case "mod":
                return this.leftOperand % this.rightOperand;

            case "pow":
                return Math.pow(this.leftOperand, this.rightOperand);


            case "What is X% of Y":
                return this.leftOperand / 100 * this.rightOperand;

            case "X is what % of Y":
                if (this.rightOperand != 0) {
                    return this.leftOperand / this.rightOperand * 100;
                }

            case "√X":
                return Math.sqrt(this.leftOperand);

            default:
                return 0;


        }

    }
}
