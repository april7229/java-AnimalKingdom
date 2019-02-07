package com.april;

public class Bird extends AbstractAnimal implements AllAnimals
{
    public Bird(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "Birds fly in the sky";
    }

    @Override
    public String breathe()
    {
        return "Birds have lungs";
    }

    @Override
    public String reproduce()
    {
        return "Birds lay eggs";
    }

    @Override
    public String eat()
    {
        return null;
    }
}