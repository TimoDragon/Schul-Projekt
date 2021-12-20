# Java Tutorial

## Allgemein

### 1. EVA Prinzip
Das EVA-Prinzip beschreibt die Grundprinzipien der Datenverarbeitung. Das Akronym leitet sich aus den Initialen der Begriffe Input, Processing und Output ab (englisches IPO-Modell: Input-Process-Output). Diese drei Begriffe beschreiben den Ablauf der Datenverarbeitung. Dieses Prinzip wird aus der Perspektive der Verarbeitungseinheit (die auch ein Mensch sein kann) betrachtet und ist somit unabhängig von elektronischen Maschinen. Daher ist sie allgemein auf den Prozess der Datenverarbeitung anwendbar.

[![Eva.Prinp](https://img.youtube.com/vi/bRHJd8_afn0/0.jpg)](https://www.youtube.com/watch?v=bRHJd8_afn0)

### 2. Was ist ein Algorithmus
Im Allgemeinen ist ein Algorithmus eine Reihe von Anweisungen, die Schritt für Schritt ausgeführt werden, um ein Problem zu lösen oder eine Aufgabe zu erledigen. Der Algorithmus von Google bestimmt beispielsweise, welche Website an welcher Position in den Google-Suchergebnissen angezeigt wird.

### 3.Compiler und Interpreter

#### 3.1 Compiler

Ein Compiler ist ein Computerprogramm, das den gesamten Quellcode eines Softwareprojekts vor der Ausführung in Maschinensprache übersetzt. Erst dann wird das Projekt vom Prozessor ausgeführt, sodass ihm von Anfang an alle Anweisungen im Maschinencode zur Verfügung stehen. Auf diese Weise ist der Prozessor bereit, alle Komponenten auszuführen, die zum Ausführen der entsprechenden Software, zur Verarbeitung von Eingaben und zur Erzeugung von Ausgaben erforderlich sind. In vielen Fällen erfolgt jedoch ein entscheidender Zwischenschritt im Kompilierungsprozess: Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler in der Regel zunächst den Quellcode in Zwischencode (auch „Objektcode“ genannt). Plattformen und kann auch von einem Dolmetscher verwendet werden.

[![Compiler](https://img.youtube.com/vi/Uuyf3wrGOYM/0.jpg)](https://www.youtube.com/watch?v=Uuyf3wrGOYM)

#### 3.2 Interpreter 

Ein Interpreter ist ein Computerprogramm, das den Quellcode eines Softwareprojekts zur Laufzeit (also bei seiner Ausführung) verarbeitet und als Schnittstelle zwischen dem Projekt und dem Prozessor fungiert. Der Interpreter verarbeitet den Code immer Zeile für Zeile, um nacheinander einzelne Anweisungen für den Prozessor zu lesen, zu analysieren und aufzubereiten. Dieses Prinzip gilt auch für Schleifenanweisungen, die wieder ausgeführt werden, sobald sie an der Reihe sind. Interpreter verwenden eine eigene interne Bibliothek, um Softwarecode zu verarbeiten: Sobald eine Zeile Quellcode in einen entsprechenden maschinenlesbaren Befehl umgewandelt ist, wird sie direkt an den Prozessor weitergeleitet.

[![Interpreter](https://img.youtube.com/vi/d1oGGY1Tlb0/0.jpg)](https://www.youtube.com/watch?v=d1oGGY1Tlb0)

## Einführung in die Programmierung

### 1. Variablen
Variablen sind Speicherzuweisungen, mit denen man z.B. Zahlen oder Text abspeichern kann. Um Zahlen abzuspeichern gib es byte, short, char, int, long und double. Um Text abzuspeichern nutzt man String.
Die Maximalen/Minimalen werte für die jeweiligen Zahlen Speicherzuweisungen sind:
```
boolean: false, true
bye: -128 bis 127
short: -32768 bis 32767
char: ein Buchstabe
int: -2.147.483.648 bis 2.147.483.647
long: -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
float: 1,40239846 x 10^-45 bis 3,40282347 x 10^38
double: 4,9406564584124654 x 10^-324 bis 1,7976931348623157 x 10^308
```
### 2. Inkrementoperator

```java
int number = 10;

System.out.println(number++); //In der Konsole erscheint 10
System.out.println(number); //In der Konsole erscheint 11
System.out.println(++number); //In der Konsole erscheint 12
```
Wenn man einen Konsolen output von number haben will und man "number++" geschrieben hat, dann wird die jeweilige Zahl von number ausgegeben und dann erst eins Höher gerechnet. Wenn man jedoch ++ davor schreibt wird erst ein hoch gerechnet und dann number in der Konsole ausgegeben. Um eins runter zu gehen ersetzt man "++" mit "--".

### 3. Typecasting
Beim Typecasting geht es darum, einen größeren Datentypen in einen kleineren oder einen kleineren Datentypen in einen größeren umzuwandeln.
Die Reihenfolge von klein zu groß ist z.B.
```byte -> short -> char -> int -> long -> float -> double```
und von groß zu klein z.B.
```double -> float -> long -> int -> char -> short -> byte```
###  4. Bedingungen
if Bedingung:

```java
int i = 0;
if (i == 1) {
    System.out.println("Die Zahl ist 1");
}
else {
    System.out.println("Die Zahl ist nicht 1");
}
```
In diesem Beispiel geht es darum, dass wir einen Integer "i" mit dem Wert 0 haben
und dann durch eine if-Abfrage geschaut wird ob "i", 1 ist.
Falls dies true (wahr) ist dann wird in der Konsole "Die Zahl ist 1" ausgegeben, wenn dies
aber false (falsch) ist erscheint in der Konsole "Die Zahl ist nicht 1". Da der Integer 0 und
nicht 1 ist, erscheint "Die Zahl ist nicht 1".


switch case:
```java
int number = 0;
switch(number) {
    case 0: {
        System.out.println("Die Zahl ist 0");
        break;
    }
    case 1: {
        System.out.println("Die Zahl ist 1");
        break;
    }
}
```
Bei dem switch gibt man einen Datentypen ein den man mit den cases vergleichen will. Zum beispiel gibt man den Datentypen "number" ein, welcher ein Integer ist und vergleicht ihn mit 0 und 1. Falls die Zahl 0 ist wird in der Konsole "Die Zahl ist 0" ausgeben, falls dieser 1 ist erscheint "Die Zahl ist 1". "break" sorgt dafür, dass das vergleichen beendet wird.

### 5. Schleifen
for schleife:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
In diesem Beispiel zur for schleife kann man sehen das wir einen int "i" haben, der 0 ist. Als nächstes
kann man erkennen, dass dort "i < 10" steht. Was bedeutet das die schleife solange wiederholt wird, bis i nicht mehr kleiner als 10 ist. Währenddessen wird i ausgegeben.


while schleife:
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i = i + 1;
}
```
Die while schleife wird so lange wiederholt wie der eingegebene Inhalt true (wahr) ist. In diesem fall
so lange wie i unter 10 ist. Nach jeder wiederholung wird i um 1 größer in diesem Beispiel.


do while schleife:
```java
do {

} while();
```
Es wird erst der Code ausgeführt der in "do {}" steht und dann wird geschaut ob der wert in "while" true ist. Falls dieser wahr ist wird der Code nochmal ausgeführt solange bis der wert false ist.

## Einführung in die Objektorientiere Programmierung

## Objektorientierte Programmierung

In einem Buch über Java-Programmierung müssen mehrere Teile vereinigt werden,

die grundsätzliche Programmierung nach dem imperativen Prinzip (Variablen, Operatoren Fallunterscheidung, Schleifen, einfache statische Methoden) in einer neuen Grammatik für Java, dann die Objektorientierung (Objekte, Klassen, Vererbung, Schnittstellen), erweiterte Möglichkeiten der Java-Sprache (Ausnahmen, Generics, Closures) und zum Schluss die Bibliotheken (String-Verarbeitung, Ein-/Ausgabe …).
Dieses Kapitel stellt das Paradigma der Objektorientierung in den Mittelpunkt und zeigt die Syntax, wie etwa in Java Vererbung realisiert wird.

## Objekte
Bei der Objektorientierten Modellierung (OOM) spielen Objekte eine fundamentale Rolle. Der klassische Ansatz im Unterricht arbeitet mit rein virtuellen Objekten - sämtliche Interaktion und auch die Objektkommunikation spielt sich im Rechner ab. Nicht selten kommt es dabei vor, dass man Objekte im wahrsten Sinne des Wortes gar nicht "sieht".
Ziel dieses Projektes ist es, Objekte begreifbar zu machen und Objektkommunikation zu visualisieren. Dafür stehen für den Unterricht Bauteile bereit, mit denen sich verschiedene Szenarien modellieren lassen. Die Schülerinnen und Schüler bekommen so die Möglichkeit, Objekte tatsächlich anzufassen und ihren aktuellen State (Zustand) nicht nur über Methoden zu erfragen, sondern auch zu sehen (Bauteil: RGB-LED) oder zu hören (Bauteil: Summer).

## Klassen

Klassen sind das wichtigste Merkmal objektorientierter Programmiersprachen. Eine Klasse definiert einen neuen Typ, beschreibt die Eigenschaften der Objekte und gibt somit den Bauplan an. Jedes Objekt ist ein Exemplar (auch Instanz[ 104 ](Ich vermeide das Wort Instanz und verwende dafür durchgängig das Wort Exemplar. An die Stelle von instanziieren tritt das einfache Wort erzeugen. Instanz ist eine irreführende Übersetzung des englischen Ausdrucks »instance«. ) oder Ausprägung genannt) einer Klasse.

Eine Klasse deklariert im Wesentlichen zwei Dinge:

Attribute (was das Objekt hat)

Operationen (was das Objekt kann)

## Initialisierung von Klassen

### Die 2 Phasen um Java Klassen zu initialisieren

Kategorie(n): Java klassen, Java Programmierung

Die Java Klassen Initialisierung durchläuft zwei Phasen.

Diese beiden Phasen sind im Grunde genommen, wie die Phasen 2 und 3 bei der Instanz-Initialisierung.

In Phase eins werden die Klassenvariablen der entsprechenden Java Klassen angelegt
Das heißt diese werden deklariert.

Schau dir den folgenden Code dazu an.
Uns interessiert jetzt erst einmal nur die Klassenvariable x.

```java
public class KlassenInitialisierung {
    public static int x=5; //statische Variable vom Datentyp Integer
    int y; //Instanzvariable vom Datentyp Integer
    
    public static void main (String [] args){
    
    }
}
```
Es wird also java intern ein Speicherplatz für die Variable x reserviert.
Die Größe des reservierten Speicherplatzes ist wieder abhängig vom jeweiligen Datentyp.
Und das war es dann auch schon mit Phase eins.

## Phase 2

In Phase zwei wird der Variablen dann ein Wert zugewiesen und es werden Methoden gepackt.
Jetzt, in Phase zwei, wird der Klassenvariablen der entsprechende Wert zugewiesen.

```java
public class KlassenInitialisierung {
    public static int x=5; //Zuweisung des Wertes 5 in Phase zwei der Java Klassen Initialisierung
    int y; //Instanzvariable vom Datentyp Integer
    
    public static void main (String [] args){
    
    }
}
```
Das bedeutet:
Erst in Phase zwei bekommt die Variable den Wert 5 zugewiesen.

Außerdem werden jetzt die Instanzmethoden angelegt.
In diesem Beispiel siehst du die Instanzmethode zunehmenWerte(), welche den Wert der Instanzvariable erhöht.

```java
public class KlassenInitialisierung {
    public static int x=5; //statische Variable vom Datentyp Integer
    int y; //Instanzvariable vom Datentyp Integer
    
    public void zunehmenWerte(){ //Instanzmethode erhöht den Wert der Instanzvariablen
        y=y+22;
        System.out.println(y);
    }

    public static void main (String [] args){
    
    }
}
```
Diese Methode wird jetzt java-intern als statische Methode gewandelt.
Diese würde dann als Argument ein Objekt der Klasse erwarten und die Instanzvariablen des Objektes erhöhen.
In diesem Fall heißt das Argument bzw. Variable ganz einfach „wert“.
Und diese Variable ist vom Datentyp „KlassenInititialsierung“.

```java
public class KlassenInitialisierung {
    public static int x=5; //statische Variable vom Datentyp Integer
    int y; //Instanzvariable vom Datentyp Integer
    
    public void zunehmenWerte(){ //Instanzmethode
        y=y+22; //Erhöhung der Instanzvariablen
        System.out.println(y); //Rückgabe von y
    }

    public static void zunehmenWerte(KlassenInitialisierung wert){ //abgewandelte Klassenmethode
        wert.y=wert.y+22; //Erhöhung der Instanzvariablen
        System.out.println(wert.y); //Rückgabe von y
    }

    public static void main (String [] args){
        KlassenInitialisierung objektEins = new KlassenInitialisierung(); //Objekt erzeugen
        objektEins.zunehmenWerte(); //Aufruf der Instanzmethode
        zunehmenWerte(objektEins); //Aufruf der Java Klassen Methode
    }
}
```
Klar ist, dass beide Methoden genau das Gleiche machen.
Rufe doch, so wie ich auch, beide Methoden einmal in der main-Methode auf und klicke auf „Run“.

Die Instanzvariable y wurde genau zweimal um 22 erhöht.
Nicht schlecht, oder? 🙂

Und genau das macht Java mit Instanzmethoden.
Intern werden diese bei der Klassen Initialisierung als statische Methoden gewandelt und geführt.

Das ganze spielt für dich erst einmal keine Rolle.
Was aber durchaus wichtig ist, ist der Unterschied zwischen der Instanz-Initialisierung und der Klassen-Initialisierung.


## Klassendiagramme
## Infos

- Klasse fasst alle Gemeinsamkeiten von Objekten zusammen 
- Objekt ist eine Ausprägung einer Klasse und stellt ein Objekt aus der realen Welt da
- Klassendiagramm dient zur Verständlichkeit von Programm bevor man dieser überhaupt programmiert 
- Klassendiagramme werden mit Hilfe von UML(Unified Modeling Language- graphische Modellierungssprache) 
- Werden immer als Rechtecke dargestellt 
- Dieses teilt man in Namen, Attributen und Methoden 
  
1. Klassenname (Z.B. NeueKlasse)
   
2. Attribute
3. Methoden
   
 -= Datenkapselung (vor Attributen/ Methoden)
 += public        
-= private    
~ = package  
#= protected 
	
Unterstreichen von Attributen definiert man als Klassenatribute 
Unterstreichen von Methoden definiert man als Klassenmethoden

[![Klassendiagramme](https://img.youtube.com/vi/zzwUH3vbNkc/0.jpg)](https://www.youtube.com/watch?v=zzwUH3vbNkc)
### Typ 1 "instanziiert"

Wenn wir ein Objekt erstellen, welches ein anderes Objekt verwendet, ohne dessen Referenz als Membervariable zu speichern, handelt es sich um eine lose «inszanziiert» Beziehung.

### Typ 2 "use"

Wenn wir auf ein statisches Element einer anderen Klasse zugreifen, handelt es sich um eine lose «use» Beziehung.

### Assoziationsbeziehung

Prinzipiell sprechen wir von einer Assoziationsbeziehung, wenn ein Objekt einer Klasse, eine Referenz (die Speicherstelle eines anderen Objektes) als Membervariable speichert.
Kategoresierungsgesichtspunkte

 Nach ihrer Richtung:

 unidirektionale (gerichtete) Assoziation

 bidirektionale Assoziation

 Nach der Mengenangabe:

 1:1-Assoziation (ein Objekt kann ein anderes Objekt referenzieren)

 1:n-Assoziation (ein Objekt kann ein oder mehrere andere Objekte referenzieren)

 N:m-Assoziation (Objekte können sich gegenseitig mehrfach referenzieren)

Nach der Wirkung:

Assoziation

Aggregation (Spezialfall der Assoziation)

Komposition (Spezialfall der Aggregation)

Operationen (was das Objekt kann)

## Objektdiagramm 

- Objekt= Ausprägung einer Klasse 
- Objektdiagramm ist ähnlich wie Klassendiagramm aufgebaut und orientiert sich immer auf dessen Struktur 
- Objektdiagramm wird als Rechteck dargestellt 
1. Objektname: Klassenname (muss unterstreichen)
2. Attributname = Attributwert  
 ( Attributname muss gleich wie in der Klassenname sein)

 [![Objektdiagramme](https://img.youtube.com/vi/oaykwg2_TG8/0.jpg)](https://www.youtube.com/watch?v=oaykwg2_TG8)

 ## Konstruktoren
 
 Konstruktoren sind spezielle Methoden zur Erzeugung und Initialisierung neuer Objekte.
 Die Initialisierung erfolgt normalerweise mit Werten, die dem Konstruktor als Parameter übergeben werden.
 Im Gegensatz zu einfachen Methoden, die über eine Objektreferenz aufgerufen werden müssen, können Konstruktoren sowohl über Klassen- als auch über Objektreferenzen aktiviert werden.
 
Um ein neues Objekt zu erzeugen, muss ein Konstruktor über eine Klassenreferenz aufgerufen werden:

```java
Person := TPerson.Create;   oder
Person := TPerson.Init('Otto', 'Meier');
```

Als einfacher Methodenaufruf für ein schon existierendes Objekt :

```java
Person.Init('Otto', 'Meier');
```
Benutzt man den vom System bereitgestellten Konstruktor Create, dann werden dem erzeugten Exemplar keine Werte zugewiesen. (s. Delphi Hilfe)


Wegen der Polymorphie kann eine Klasse mehrere Konstruktoren haben, die sich im Bezeichner unterscheiden müssen.

Welcher Konstruktor aufgerufen wird, entscheidet sich beim Erzeugen eines neuen Exemplars.
(Einige Programmiersprachen erlauben auch die Benutzung desselben Bezeichners mit unterschiedlichen Parametern. Dann ist eventuell eine spezielle Compiler-Direktive zu verwenden).

## Methoden

Das Kernstück jeder objektorientierten Programmierung bildet das Objekt. Allgemein kann man sagen, dass Objekte Attribute und Methoden enthalten. Dabei sind Attribute nur Variablen und Konstanten, die Werte aufnehmen können, und beschreiben damit das statische Wesen des Objektes. Im Gegensatz dazu gibt es die Methoden, die das gesamte dynamische Verhalten des Objektes oder einer Klasse charakterisieren. Sie enthalten die algorithmische Essenz des Objektes. In der objektorientierten Programmierung sind Methoden Teil der Definition einer Klasse.

Das folgende Beispiel in der Programmiersprache C# zeigt die Methoden berechneEinnahmen(...), gibPartei(), wähleVorsitzender(...) und gibAnzahlDerAbgeordneten(...), die von den Klassen Partei, Abgeordneter und Parlament definiert werden. Die Parameter werden in den Klammern hinter dem Namen der Methode deklariert. Der Datentyp steht jeweils vor dem Namen der Variablen. Der Rückgabetyp steht vor dem Namen der Methode. Bei Methoden ohne Rückgabewert wird der Rückgabetyp void angegeben.

```java
class Partei
{
    List<Person> mitglieder;
    double mitgliedsbeitrag;
    
    // Methode mit zwei Parametern und mit Rückgabewert
    double berechneEinnahmen(double spenden, double sonstigeEinnahmen)
    {
        return mitglieder.Count * mitgliedsbeitrag + spenden + sonstigeEinnahmen;
    }
}

class Abgeordneter
{
    Partei partei;
    
    // Methode ohne Parameter und mit Rückgabewert
    Partei gibPartei()
    {
        return partei;
    }
}

class Parlament
{
    List<Abgeordneter> abgeordnete = new List<Abgeordneter>();
    Abgeordneter vorsitzender;
    int maximalGroesse;
    
    // Methode mit einem Parameter und ohne Rückgabewert
    void wähleVorsitzender(Abgeordneter abgeordneter)
    {
        vorsitzender = abgeordneter;
    }
    
    // Methode mit einem Parameter und mit Rückgabewert
    int gibAnzahlDerAbgeordneten(Partei partei)
    {
        int anzahl = 0;
        foreach (Abgeordneter abgeordneter in abgeordnete)
        {
            if (abgeordneter.gibPartei() == partei)
            {
                anzahl++;
            }
        }
        return anzahl;
    }
}
```



 # Aufgaben Java Toturail 

 Gebe folgende Struktorporgramm  als Code wieder.


![Test](/docs/images/structorprogramm.PNG)

[Lösung](/docs/Lösung/LoesungAufabe1.java)
