package com.example.springboottest.Model;

import java.util.*;

public class BrugerService
{
private static final List <Bruger> brugerliste = new ArrayList<>();

public void opretBruger (Bruger b)
{
    brugerliste.add(b);
}
public List<Bruger> hentAlleBrugere ()
{
    return brugerliste;
}
}
