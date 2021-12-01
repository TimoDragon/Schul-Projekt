# Java Tutorial

## Allgemein

### - EVA Prinzip
Das EVA-Prinzip beschreibt die Grundprinzipien der Datenverarbeitung. Das Akronym leitet sich aus den Initialen der Begriffe Input, Processing und Output ab (englisches IPO-Modell: Input-Process-Output). Diese drei Begriffe beschreiben den Ablauf der Datenverarbeitung. Dieses Prinzip wird aus der Perspektive der Verarbeitungseinheit (die auch ein Mensch sein kann) betrachtet und ist somit unabhängig von elektronischen Maschinen. Daher ist sie allgemein auf den Prozess der Datenverarbeitung anwendbar.

[![Eva.Prinp](https://img.youtube.com/vi/bRHJd8_afn0/0.jpg)](https://www.youtube.com/watch?v=bRHJd8_afn0)

### - Was ist ein Algorithmus
Im Allgemeinen ist ein Algorithmus eine Reihe von Anweisungen, die Schritt für Schritt ausgeführt werden, um ein Problem zu lösen oder eine Aufgabe zu erledigen. Der Algorithmus von Google bestimmt beispielsweise, welche Website an welcher Position in den Google-Suchergebnissen angezeigt wird.

### -Compiler und Interpreter

#### -Compiler

Ein Compiler ist ein Computerprogramm, das den gesamten Quellcode eines Softwareprojekts vor der Ausführung in Maschinensprache übersetzt. Erst dann wird das Projekt vom Prozessor ausgeführt, sodass ihm von Anfang an alle Anweisungen im Maschinencode zur Verfügung stehen. Auf diese Weise ist der Prozessor bereit, alle Komponenten auszuführen, die zum Ausführen der entsprechenden Software, zur Verarbeitung von Eingaben und zur Erzeugung von Ausgaben erforderlich sind. In vielen Fällen erfolgt jedoch ein entscheidender Zwischenschritt im Kompilierungsprozess: Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler in der Regel zunächst den Quellcode in Zwischencode (auch „Objektcode“ genannt). Plattformen und kann auch von einem Dolmetscher verwendet werden.

[![Compiler](https://img.youtube.com/vi/Uuyf3wrGOYM/0.jpg)](https://www.youtube.com/watch?v=Uuyf3wrGOYM)

#### -Interpreter 

Ein Interpreter ist ein Computerprogramm, das den Quellcode eines Softwareprojekts zur Laufzeit (also bei seiner Ausführung) verarbeitet und als Schnittstelle zwischen dem Projekt und dem Prozessor fungiert. Der Interpreter verarbeitet den Code immer Zeile für Zeile, um nacheinander einzelne Anweisungen für den Prozessor zu lesen, zu analysieren und aufzubereiten. Dieses Prinzip gilt auch für Schleifenanweisungen, die wieder ausgeführt werden, sobald sie an der Reihe sind. Interpreter verwenden eine eigene interne Bibliothek, um Softwarecode zu verarbeiten: Sobald eine Zeile Quellcode in einen entsprechenden maschinenlesbaren Befehl umgewandelt ist, wird sie direkt an den Prozessor weitergeleitet.

[![Interpreter](https://img.youtube.com/vi/d1oGGY1Tlb0/0.jpg)](https://www.youtube.com/watch?v=d1oGGY1Tlb0)

## Einführung in die Programmierung
### 1. Inkrementoperator

### 2. Typecasting
Beim Typecasting geht es darum, einen größeren Datentypen in einen kleineren oder einen kleineren Datentypen in einen größeren umzuwandeln.
Die Reihenfolge von klein zu groß ist z.B.
```byte -> short -> char -> int -> long -> float -> double```
und von groß zu klein z.B.
```double -> float -> long -> int -> char -> short -> byte```
###  3. Bedingungen
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

### 4. Schleifen
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

## Implemation 

Das Interface gibt vor, welche Methoden Du in den konkreten Klassen programmieren musst. In den Interfaces selbst steht überhaupt kein Code, sondern es werden nur die Methodennamen mit Rückgabewert und Parametern angegeben.

Zu Deinem Beispiel mit Shape (Form) und Rectangle (Rechteck).

In einer Firma arbeiten 3 Mitarbeiter, die gemeinsam an einem Programm entwickeln. Mit diesem Programm sollen verschiedene mathematische Berechnungen und die Darstellung von Formen möglich sein.

Der 1 Mitarbeiter schreibt das Hauptprogramm, welches die verschiedene Formen benutzt, d.h. diese anzeigt und mit ihnen Berechnungen ausführt. Da er allerdings nicht auch noch die konkreten Klassen für die Formen Kreis, Rechteck, Quadrat, Raute, Dreieck programmieren kann (aus Zeitmangel), er aber bereits weiß, welche Funktionen/Methoden alle diese Klassen gemeinsam haben müssen, schreibt er für die beiden anderen Mitarbeiter eine Vereinbarung/Interface.

Code:
```java
interface Form {

public double berechneUmfang(); 
public double berechneFlaeche();
public void formAnzeigen();
public void formAusmalen(Color color);
usw.
}
``` 

Anschließend gibt er dieses Interface an die beiden anderen weiter, mit der Bitte die noch fehlenden Klassen Kreis, Rechteck, Quadrat, Raute, Dreieck zu programmieren. Durch das Interface wissen jetzt beide Mitarbeiter, welche Methoden die konkreten Klassen unbedingt haben müssen. Und so programmieren sie die konkreten Klassen.

Code:
```java
public class Kreis implements Form {

//Konstruktor
public Kreis(){}

public double berechneUmfang() {

    //Hier steht der Code zur Berechnung des Umfanges
   return umfang;

} 

public double berechneFlaeche() {

    //Hier steht der Code zur Berechnung der Fläche
   return flaeche;

}

public void formAnzeigen() {

    //Hier steht der Code zum Anzeigen
   return umfang;

}

public void formAusmalen(Color color) {

    //Hier steht der Code zum Ausmalen
   return umfang;

}

... entsprechend die weiteren Klassen
```

Interfaces helfen außerdem Deinen Code von konkreten Implementierungen zu entkoppeln. D.h. Der Mitarbeiter, der das Hauptprogramm schreibt, verwendet in seinem Programm einfach das Interface und lässt sich eine konkrete Klasse z.B. durch eine Factory erzeugen bzw. injezieren (Stichpunkte Dependency Injection und Spring).

Code:
  ```Java
  //irgendwo im Programm
  Form meineForm = Factory.erzeugekonkreteForm();
  ```

## Klassendiagramme
### Typ 1 «instanziiert»

Wenn wir ein Objekt erstellen, welches ein anderes Objekt verwendet, ohne dessen Referenz als Membervariable zu speichern, handelt es sich um eine lose «inszanziiert» Beziehung.

### Typ 2 «use»

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

## Klassendiagramme 

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

## Objektdiagramm 

- Objekt= Ausprägung einer Klasse 
- Objektdiagramm ist ähnlich wie Klassendiagramm aufgebaut und orientiert sich immer auf dessen Struktur 
- Objektdiagramm wird als Rechteck dargestellt 
1. Objektname: Klassenname (muss unterstreichen)
2. Attributname = Attributwert  
 ( Attributname muss gleich wie in der Klassenname sein)

 [![Objektdiagramme](https://img.youtube.com/vi/oaykwg2_TG8/0.jpg)](https://www.youtube.com/watch?v=oaykwg2_TG8)