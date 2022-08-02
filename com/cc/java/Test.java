package com.cc.java;

public class Test {
    
    // Felder (fields) | Attribute, Eigenschaften
    // private --> Kapselung / encapsulation/ data hiding

    private String name; // 
    private int age;

    /* Costum Konstuktor da er belieig anpassbar ist durch Parameter
     * Konstruktor ist auch eine Methode 
     * alle Methoden werden kleingeschrieben ausser 
     * Konstruktor wird großgeschrieben 
     */
    public Test(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    /* default Konstruktor: 
 * public Test (){
 * }; 
 */

	// Sichtbarkeit | access (access modifiers) = Zugriffsmodifizierer
	// public --> alle dürfen sehen/schreiben (+)
	// private --> NUR die eigene Klasse / Objekt (-)
	// protected --> NUR die eigene Klasse / Objekt + Subklassen (#)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 




}
