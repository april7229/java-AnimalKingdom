package com.april;

public class Fish extends AbstractAnimal implements AllAnimals
{
    public Fish(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "Fish swim";
    }

    @Override
    public String breathe()
    {
        return "Fish have gills";
    }

    @Override
    public String reproduce()
    {
        return "Fish lay eggs";
    }

    @Override
    public String eat()
    {
        return null;
    }
}