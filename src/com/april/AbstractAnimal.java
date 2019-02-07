package com.april;

public abstract class AbstractAnimal implements AllAnimals
{
    static int maxId = 0;
    int id;
    // Declaring/initializing variables
    String name;
    int yearNamed;

    // constructor--------------------------
    public AbstractAnimal(String name, int yearNamed)
    {
        this.name = name;
        this.yearNamed = yearNamed;
        id = maxId++; // increment new animal id's
    }

    // methods -----------------------------
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearNamed()
    {
        return yearNamed;
    }

    public void setYearNamed(int yearNamed)
    {
        this.yearNamed = yearNamed;
    }

    public int getId()
    {
        return id;
    }

    // Animals can move, breathe, reproduce
    // Overrides------------------------------
    @Override
    public String move()
    {
        return null;
    }

    @Override
    public String breathe()
    {
        return null;
    }

    @Override
    public String reproduce()
    {
        return null;
    }

    @Override
    public String eat()
    {
        return "Yum Yum!";
    }
}