package com.seb;

import java.util.ArrayList;

public interface Item {

    public void setName(String name);
    public String getName();

    public void setDesc(String desc);
    public String getDesc();

    public void setCost(int cost);
    public int getCost();

    public void addEffect(Effects effect);
    public ArrayList<Effects> getEffects();
    public void removeEffect(Effects effect);
}
