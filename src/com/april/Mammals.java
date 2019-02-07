package com.april;

public class Mammals extends AbstractAnimal implements AllAnimals
{
    public Mammals (String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "Mammals walk";
    }

    @Override
    public String breathe()
    {
        return "Mammals breathe thru there lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }

    @Override
    public String eat()
    {
        return null;
    }
}

