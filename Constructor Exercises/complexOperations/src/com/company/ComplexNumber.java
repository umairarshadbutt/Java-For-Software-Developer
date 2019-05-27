package com.company;

public class ComplexNumber {
    private  double real;
    private  double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real=this.getReal()+real;
        this.imaginary=this.getImaginary()+imaginary;
    }


    public void add (ComplexNumber obj){
        this.real=obj.getReal()+real;
        this.imaginary=obj.getImaginary()+imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real=real-this.getReal();
        this.imaginary=imaginary-this.getImaginary();
    }


    public void subtract (ComplexNumber obj){
        this.real=real-obj.getReal();
        this.imaginary=imaginary-obj.getImaginary();
    }

}
