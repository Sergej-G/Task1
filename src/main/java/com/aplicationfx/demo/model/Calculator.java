package com.aplicationfx.demo.model;

public class Calculator {
    private Double num;
    private Double percent;
    private Double result;

    public Double getNum() {
        return num;
    }

    public void setNum(Double number) {
        this.num = number;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double calc() {
        result = (num / 100) * percent;
        return result;
    }
}
