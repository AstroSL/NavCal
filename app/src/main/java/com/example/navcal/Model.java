package com.example.navcal;

public class Model {
    private double lbs_of_mulch;
    private double bags;
    private double bags_per_tank;
    private double tank_loads;
    private double sq_ft_tank;
    private String dateTime;

    public Model(double lbs_of_mulch, double bags, double bags_per_tank, double tank_loads, double sq_ft_tank,String dateTime) {
        this.lbs_of_mulch = lbs_of_mulch;
        this.bags = bags;
        this.bags_per_tank = bags_per_tank;
        this.tank_loads = tank_loads;
        this.sq_ft_tank = sq_ft_tank;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public double getLbs_of_mulch() {
        return lbs_of_mulch;
    }

    public void setLbs_of_mulch(double lbs_of_mulch) {
        this.lbs_of_mulch = lbs_of_mulch;
    }

    public double getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public double getBags_per_tank() {
        return bags_per_tank;
    }

    public void setBags_per_tank(double bags_per_tank) {
        this.bags_per_tank = bags_per_tank;
    }

    public double getTank_loads() {
        return tank_loads;
    }

    public void setTank_loads(double tank_loads) {
        this.tank_loads = tank_loads;
    }

    public double getSq_ft_tank() {
        return sq_ft_tank;
    }

    public void setSq_ft_tank(double sq_ft_tank) {
        this.sq_ft_tank = sq_ft_tank;
    }
}
