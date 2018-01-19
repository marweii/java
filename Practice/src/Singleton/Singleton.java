package Singleton;

public  class Singleton
{
    private static Singleton _instance = null;

    private Singleton()
    {
    }

    public static Singleton Instance()
    {
        return new Singleton();
    }
}