package poke;
class Ataques {
	int rayo = 70;
	int placaje = 35;
	int latigo_cepa = 35;
	int pistola_agua =35;
	int ascuas = 35;
}
class Pokemon{
	int vida = 200;
}

class pikachu {
	String tipo = "electrico";
	Pokemon pokemon = new Pokemon();
	 int pikavida = pokemon.vida;
	 Ataques ataques = new Ataques();
	String ataquesNombres [] = {"rayo","placaje","gruñido"};
}

class bulbasaur {
	String tipo = "planta";
	Pokemon pokemon = new Pokemon();
	 int bulvida = pokemon.vida;
	 Ataques ataques = new Ataques();
	String ataquesNombres [] = {"latigo cepa","placaje","gruñido"};
}

class mudkid {
	String tipo = "agua";
	Pokemon pokemon = new Pokemon();
	 int mudvida = pokemon.vida;
	  Ataques ataques = new Ataques();
	String ataquesNombres []  = {"pistola agua","placaje","gruñido"};
   
}

class chinchar{
	String tipo ="fuego";
	Pokemon pokemon = new Pokemon();
	 int chinvida = pokemon.vida;
	 Ataques ataques = new Ataques();
	String ataquesNombres [] = {"ascuas","placaje","gruñido"};
}

