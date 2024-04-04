package fr.voxi.admin;

public class AppAdmin {
	public static void main(String[] args) {
		Oeuvre Oeuvre1 = new Oeuvre (103, "Le Crépuscule et l'Aube");
		System.out.println(Oeuvre1.toString());
		System.out.println("le nombre d'oeuvre créé est de " + Oeuvre1.getNbOeuvre());
		
		Oeuvre Oeuvre2= new Oeuvre (302, "Nature Humaine");
		System.out.println (Oeuvre2.toString());
		System.out.println("le nombre d'oeuvre créé est de " + Oeuvre2.getNbOeuvre());
		
		Oeuvre Oeuvre3 = new Oeuvre (318, "L'anomalie");
		System.out.println (Oeuvre3.toString());
		System.out.println("le nombre d'oeuvre créé est de " + Oeuvre3.getNbOeuvre());
		System.out.println("le nombre d'oeuvre créé est de " + Oeuvre1.getNbOeuvre());
	//cet instruction nous permet d'afficher le nombre d'oeuvre crée meme en passant par l'oeuvre créé en premier
	}
}
