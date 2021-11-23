# Java Tutorial

## Allgemein


### - EVA Prinzip
Das EVA-Prinzip beschreibt die Grundprinzipien der Datenverarbeitung. Das Akronym leitet sich aus den Initialen der Begriffe Input, Processing und Output ab (englisches IPO-Modell: Input-Process-Output). Diese drei Begriffe beschreiben den Ablauf der Datenverarbeitung. Dieses Prinzip wird aus der Perspektive der Verarbeitungseinheit (die auch ein Mensch sein kann) betrachtet und ist somit unabhängig von elektronischen Maschinen. Daher ist sie allgemein auf den Prozess der Datenverarbeitung anwendbar.

[![Eva.Prinzip](https://img.youtube.com/vi/bRHJd8_afn0/0.jpg)](https://www.youtube.com/watch?v=bRHJd8_afn0)

### - Was ist ein Algorithmus
Im Allgemeinen ist ein Algorithmus eine Reihe von Anweisungen, die Schritt für Schritt ausgeführt werden, um ein Problem zu lösen oder eine Aufgabe zu erledigen. Der Algorithmus von Google bestimmt beispielsweise, welche Website an welcher Position in den Google-Suchergebnissen angezeigt wird.

### -Compiler und Interpreter

#### -Interpreter 

Ein Interpreter ist ein Computerprogramm, das den Quellcode eines Softwareprojekts zur Laufzeit (also bei seiner Ausführung) verarbeitet und als Schnittstelle zwischen dem Projekt und dem Prozessor fungiert. Der Interpreter verarbeitet den Code immer Zeile für Zeile, um nacheinander einzelne Anweisungen für den Prozessor zu lesen, zu analysieren und aufzubereiten. Dieses Prinzip gilt auch für Schleifenanweisungen, die wieder ausgeführt werden, sobald sie an der Reihe sind. Interpreter verwenden eine eigene interne Bibliothek, um Softwarecode zu verarbeiten: Sobald eine Zeile Quellcode in einen entsprechenden maschinenlesbaren Befehl umgewandelt ist, wird sie direkt an den Prozessor weitergeleitet.

#### -Compiler

Ein Compiler ist ein Computerprogramm, das den gesamten Quellcode eines Softwareprojekts vor der Ausführung in Maschinensprache übersetzt. Erst dann wird das Projekt vom Prozessor ausgeführt, sodass ihm von Anfang an alle Anweisungen im Maschinencode zur Verfügung stehen. Auf diese Weise ist der Prozessor bereit, alle Komponenten auszuführen, die zum Ausführen der entsprechenden Software, zur Verarbeitung von Eingaben und zur Erzeugung von Ausgaben erforderlich sind. In vielen Fällen erfolgt jedoch ein entscheidender Zwischenschritt im Kompilierungsprozess: Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler in der Regel zunächst den Quellcode in Zwischencode (auch „Objektcode“ genannt). Plattformen und kann auch von einem Dolmetscher verwendet werden.

## Einführung in die Programmierung
### 1. Inkrementoperator

### 2. Typecasting
    
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
    }
    case 1: {
        System.out.println("Die Zahl ist 1");
    }
}
```

### 4. Schleifen
for schleife:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
In diesem Beispiel zur for schleife kann man sehen das wir einen int "i" haben, der 0 ist. Als nächstes
kann man erkennen das dort "i < 10" steht was bedeutet das die schleife solange wiederholt wird bis, i nicht mehr kleiner als 10 ist. Währenddessen wird i ausgegeben.


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
```

## Einführung in die Objektorientiere Programmierung

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [Basic writing and formatting syntax](https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax).

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://docs.github.com/categories/github-pages-basics/) or [contact support](https://support.github.com/contact) and we’ll help you sort it out.