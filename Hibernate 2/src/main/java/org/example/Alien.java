package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="alien_table")
public class Alien
{
    @Id
    private int aid;
    private String aname;
    private String color;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
    }

    public void setColor(String green) {
    }
}
