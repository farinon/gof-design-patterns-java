package designpatterns.flyweight;
/*
Interface do jogador
Tanto CT como TR precisa ter uma miss?o e uma arma
*/

interface Player
{
    public void assignWeapon(String weapon);
    public void mission();
}
