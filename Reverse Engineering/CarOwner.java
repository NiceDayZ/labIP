// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CarOwner.java


class CarOwner
{

    CarOwner()
    {
    }

    public transient boolean SignUp(String s, String as[])
    {
        return false;
    }

    public void Login(String s, String s1)
    {
    }

    public String Choose_Port(Port port)
    {
        return null;
    }

    public void Reserve_Port(Port port)
    {
    }

    public boolean Cancellation(Port port)
    {
        return false;
    }

    public void Rate_Port_Owner(ChargingPortOwner chargingportowner)
    {
    }

    public boolean Pay()
    {
        return false;
    }

    public void Insert_Destination(String s)
    {
    }

    public String Choose_Route(Route route)
    {
        return null;
    }

    public void Insert_Specifications(Car car1)
    {
    }

    private String name;
    private String surname;
    private int id;
    private Car car;
    private CheckAuthentification checkA;
    private Payment payment;
    public Admin myAdmin;
}
